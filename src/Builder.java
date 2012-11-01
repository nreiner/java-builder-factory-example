public abstract class Builder {
  protected Meme meme;

  public Meme getMeme() {
    return this.meme;
  }

  public Builder init() {
    this.meme = new Meme();
    return this;
  }

  public abstract Builder setImage();
  public abstract Builder setTop();
  public abstract Builder setBottom();
  public abstract Builder setFormat();
}
