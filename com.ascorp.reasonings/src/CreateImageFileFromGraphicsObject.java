import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class CreateImageFileFromGraphicsObject {

	public static void main(String[] args) throws IOException {

		int width = 250;
		int height = 250;

		// Constructs a BufferedImage of one of the predefined image types.
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

		// Create a graphics which can be used to draw into the buffered image
		Graphics2D g2d = bufferedImage.createGraphics();

		// fill all the image with white
		g2d.setColor(Color.BLUE);
		g2d.fillRect(0, 0, width, height);

		// create a circle with black
		g2d.setColor(Color.black);
		g2d.fillOval(0, 0, width, height);

		// create a string with yellow
		g2d.setColor(Color.yellow);
		g2d.drawString("Secure Passworda", 50, 120);

		// Disposes of this graphics context and releases any system resources that it
		// is using.
		g2d.dispose();

		// Save as PNG
		File file = new File("myimage.png");
		ImageIO.write(bufferedImage, "png", file);

		// Save as JPEG
		file = new File("myimage.jpg");
		ImageIO.write(bufferedImage, "jpg", file);

		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("Z");
		System.out.println(arrayList);
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.contains("A"));

	}

}