package behavioral.mediator;

public class NonGroup extends Participant{
	public NonGroup(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receive(String from, String message) {
		System.out.print("To a NonGroup: ");
		super.receive(from, message);
	}
}
