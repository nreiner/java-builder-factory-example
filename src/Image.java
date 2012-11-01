public abstract class Image {
  public String getExtension() {
    return this
      .getClass()
      .getSimpleName()
      .replace("Image", "")
      .toLowerCase();
  }
}
