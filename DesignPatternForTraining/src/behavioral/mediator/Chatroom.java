package behavioral.mediator;

public interface Chatroom {
	public void register(Participant participant);
	public void send(String from, String to, String message);
}
