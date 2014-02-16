package creational.prototype;

public class MainApp {

	public static void main(String[] args) {
		ColorManager colormanager = new ColorManager();
		Color red = new Color(255, 0, 0);
		Color green = new Color(0, 255, 0);
		Color blue = new Color(0, 0, 255);

		Color angry = (Color) red.clone();
		angry.setGreen(24);
		System.out.println("Rad  " + red);
		System.out.println("Angry  " + angry);

	}

}
