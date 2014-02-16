package behavioral.mediator;

public class Participant {
	private Chatroom chatroom;
	private String name;
	public Chatroom getChatroom() {
		return chatroom;
	}

	public void setChatroom(Chatroom chatroom) {
		this.chatroom = chatroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Constructor
	public Participant(String name) {
		this.name = name;
	}

	// Sends message to given participant
	public void send(String to, String message) {
		chatroom.send(name, to, message);
	}

	// Receives message from given participant
	public void receive(String from, String message) {
		System.out.printf("{%s} to {%s}: '{%s}'\n", from, getName(), message);
	}
}
