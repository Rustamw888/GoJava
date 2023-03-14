package Lesson1_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
//import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class PlayMusic {

  public static void main(String[] args) throws Exception {

      InputStream stream = new FileInputStream("src/main/java/Lesson1_9/music/Waqas_Ahmed_-_Demon_Slayer_(musmore.com).mp3");

      Player player = new Player(stream);
      player.play();
      player.close();
  }

//  public static void main(String[] args) {
//
//    try {
//      URL url = new URL("https://music.yandex.ru/album/6670589/track/149584");
//      InputStream is = new BufferedInputStream(url.openStream());
//
//      Player player = new Player(is);
//      player.play();
//      player.close();
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    } catch (JavaLayerException e) {
//      throw new RuntimeException(e);
//    }
//
//  }

}
