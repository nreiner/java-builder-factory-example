public class Director {
  private Builder builder;

  public Director setBuilder(Builder builder) {
    this.builder = builder;
    return this;
  }

  public Meme getMeme() {
    return builder.getMeme();
  }

  public void create() {
    builder
      .init()
      .setImage()
      .setTop()
      .setBottom()
      .setFormat();
  }
}
