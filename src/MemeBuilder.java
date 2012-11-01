import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemeBuilder extends Builder {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public Builder setImage() {
    meme.setImage(read("Image path:"));
    return this;
  }

  public Builder setTop() {
    meme.setTop(read("Text on top:"));
    return this;
  }

  public Builder setBottom() {
    meme.setBottom(read("Text at bottom:"));
    return this;
  }
  public Builder setFormat() {
    Format format;

    loop:
    while (true) {
      System.out.println("Choose format:\n1: PNG\n2: PDF\n3: JPEG");
      switch (Integer.parseInt(read(""))) {
        case 1: format = Format.PNG; break loop;
        case 2: format = Format.PDF; break loop;
        case 3: format = Format.JPEG; break loop;
        default:
          System.out.println("Invalid choice.");
          break;
      }
    }

    meme.setOutput(ImageFactory.create(format));
    return this;
  }

  private String read(String message) {
    String input = "";
    try {
      System.out.println(message);
      input = br.readLine();
    } catch (IOException e) {
    }
    return input;
  }
}
