package behavioral.visitor;

public interface ShapeVisitor {
	void visit(Triangle triangle);
    void visit(Pentagon pentagon);
}
