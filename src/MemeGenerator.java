public class MemeGenerator {
  public static void main(String [] args) {
    Director director = new Director();
    MemeBuilder mb = new MemeBuilder();

    director.setBuilder(mb);
    director.create();

    Meme meme = director.getMeme();
    System.out.println(meme.get());
  }
}
