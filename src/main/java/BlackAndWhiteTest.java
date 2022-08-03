
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BlackAndWhiteTest {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/loica/Downloads/téléchargement.jpg");
        BufferedImage orginalImage = ImageIO.read(file);

        BufferedImage blackAndWhiteImg = new BufferedImage(
                orginalImage.getWidth(), orginalImage.getHeight(),
                BufferedImage.TYPE_BYTE_BINARY);

        Graphics2D graphics = blackAndWhiteImg.createGraphics();
        graphics.drawImage(orginalImage, 0, 0, null);

        ImageIO.write(blackAndWhiteImg, "png", new File("C:/Users/loica/Downloads/téléchargementBW.jpg"));
    }

}