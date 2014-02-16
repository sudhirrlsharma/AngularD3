package behavioral.visitor;

public interface ShapeElement {
	void accept(ShapeVisitor visitor);
}
