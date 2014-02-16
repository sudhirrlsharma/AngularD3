package behavioral.visitor;

public class MainApp {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		//tri.applyColor();
		
		tri.accept(new SaveShapeVisitor());
		tri.accept(new PrintShapeVisitor());

		Shape pent = new Pentagon(new GreenColor());
		//pent.applyColor();
		pent.accept(new SaveShapeVisitor());
		pent.accept(new PrintShapeVisitor());
		
	
		
	}
}
