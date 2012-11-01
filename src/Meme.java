public class Meme {
  private String image;
  private String top;
  private String bottom;
  private String format;
  private Image output;

  public Meme setImage(String filename) {
    this.image = filename;
    return this;
  }
  public Meme setTop(String text) {
    this.top = text;
    return this;
  }
  public Meme setBottom(String text) {
    this.bottom = text;
    return this;
  }
  public Meme setOutput(Image image) {
    this.output = image;
    return this;
  }
  public String get() {
    return "Image: " + this.image
      + "\nTop: " + this.top
      + "\nBottom: " + this.bottom
      + "\nOutput: output." + this.output.getExtension();
  }
}
