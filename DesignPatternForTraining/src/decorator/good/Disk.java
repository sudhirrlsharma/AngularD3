package decorator.good;

public class Disk extends ComponentDecorator {
	Computer computer;

	public Disk(Computer c) {
		this.computer = c;
	}

	public String description() {
		return computer.description() + " and a disk";
	}

}
