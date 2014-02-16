package behavioral.visitor;

public class PrintShapeVisitor implements ShapeVisitor{

	@Override
	public void visit(Triangle triangle) {
		System.out.println("Trianlge is printed");
		
	}

	@Override
	public void visit(Pentagon pentagon) {
		System.out.println("Pentagon is printed");
		
	}

}
