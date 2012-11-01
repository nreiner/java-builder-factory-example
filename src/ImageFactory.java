public class ImageFactory {
  public static Image create(Format format) {
    Image image = null;
    switch (format) {
      case PNG: image = new PNGImage(); break;
      case JPEG: image = new JPEGImage(); break;
      case PDF: image = new PDFImage(); break;
    }
    return image;
  }
}

class JPEGImage extends Image {}
class PNGImage extends Image {}
class PDFImage extends Image {}
