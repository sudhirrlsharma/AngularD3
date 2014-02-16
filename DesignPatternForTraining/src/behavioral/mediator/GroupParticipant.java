package behavioral.mediator;

public class GroupParticipant extends Participant {

	public GroupParticipant(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receive(String from, String message) {
		System.out.print("To a Group: ");
		super.receive(from, message);
	}
}
