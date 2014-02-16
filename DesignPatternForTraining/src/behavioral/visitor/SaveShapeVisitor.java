package behavioral.visitor;

public class SaveShapeVisitor implements ShapeVisitor{

	@Override
	public void visit(Triangle triangle) {
		System.out.println("Trianlge is saved");
		
	}

	@Override
	public void visit(Pentagon pentagon) {
		System.out.println("Pentagon is saved");
		
	}

}
