package Lesson_46.part_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class ConcurentTest {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    List<String> result = new ArrayList<>();
    List<Future<String>> futures = new ArrayList<>();

    final ExecutorService service = Executors.newFixedThreadPool(4);

    System.out.println("START");

    try {
      futures.add(service.submit(new PhotoProperty()));
      futures.add(service.submit(new MarketProperty()));
      futures.add(service.submit(new MarketProperty()));
      futures.add(service.submit(new PhotoProperty()));

      for (Future<String> future : futures) {
        result.add(future.get());
      }
    } finally {
      service.shutdown();
    }

    System.out.println("STOP");

    for (String s : result) {
      System.out.println(s);
    }
  }
}

class PhotoProperty implements Callable<String> {

  @Override
  public String call() throws Exception {
    int count = 0;
    for (int i = 0; i < 10; i++) {
      count += i;
      sleep(1000);
    }
    return String.format("PhotoProperty: %s", count);
  }
}

class MarketProperty implements Callable<String> {

  @Override
  public String call() throws Exception {
    int count = 0;
    int size = (int) Math.floor(Math.random() * 100);
    for (int i = 0; i < 10; i++) {
      count += i;
      sleep(10);
    }
    return String.format("MarketProperty: %s", count);
  }
}