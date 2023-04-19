package Lesson_55.part_1;

public class ConvertingTest {

  public static void main(String[] args) {

    Convertor convertor = new Convertor(new ConvertToJpeg("our document"));
    convertor.converting();
    convertor = new Convertor(new ConvertToPng());
    convertor.converting();
    convertor = new Convertor(new ConvertToGif());
    convertor.converting();
  }
}

interface IConvert {
  void convert();
}

class ConvertToJpeg implements IConvert {

  private String content;

  public ConvertToJpeg(String content) {
    this.content = content;
  }

  @Override
  public void convert() {
    System.out.printf("Converting %s to Jpeg\n", this.content);
  }
}

class ConvertToPng implements IConvert {

  @Override
  public void convert() {
    System.out.println("Converting to Png");
  }
}

class ConvertToGif implements IConvert {

  @Override
  public void convert() {
    System.out.println("Converting to Gif");
  }
}

class Convertor {
  IConvert convert;

  public Convertor(IConvert convert) {
    this.convert = convert;
  }

  public void converting() {
    convert.convert();
  }
}
