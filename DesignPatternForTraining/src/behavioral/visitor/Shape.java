package behavioral.visitor;

public abstract class Shape implements ShapeElement{
	// Composition - implementor
	protected Color color;

	// constructor with implementor as input argument
	public Shape(Color c) {
		this.color = c;
	}

	abstract public void applyColor();
	
}
