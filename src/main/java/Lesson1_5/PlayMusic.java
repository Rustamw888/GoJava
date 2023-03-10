package Lesson1_5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class PlayMusic {

//  public static void main(String[] args) {
//
//    try {
//      InputStream stream = new FileInputStream("src/main/java/Lesson1_5/music/Waqas_Ahmed_-_Demon_Slayer_(musmore.com).mp3");
//
//      Player player = new Player(stream);
//      player.play();
//    } catch (FileNotFoundException e) {
//      throw new RuntimeException(e);
//    } catch (JavaLayerException e) {
//      throw new RuntimeException(e);
//    }
//  }

  public static void main(String[] args) {

    try {
      URL url = new URL("https://music.yandex.ru/album/6670589/track/149584");
      InputStream is = new BufferedInputStream(url.openStream());

      Player player = new Player(is);
      player.play();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (JavaLayerException e) {
      throw new RuntimeException(e);
    }

  }

}
