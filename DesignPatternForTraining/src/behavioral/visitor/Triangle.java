package behavioral.visitor;

public class Triangle extends Shape {

	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}
	

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
		
	}

}