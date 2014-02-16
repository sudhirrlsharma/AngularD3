package behavioral.mediator;

public class MainApp {
	public static void main(String[] args) {
		// Create chatroom
	      Chatroom chatroom = new ChatroomImpl();
	 
	      // Create participants and register them
	      Participant Jay = new GroupParticipant("Jay");
	      Participant Viru = new GroupParticipant("Viru");
	      Participant Basanti = new GroupParticipant("Basanti");
	      Participant Gabbar = new GroupParticipant("Gabbar");
	      Participant Thakur = new NonGroup("Thakur");
	 
	      chatroom.register(Jay);
	      chatroom.register(Viru);
	      chatroom.register(Basanti);
	      chatroom.register(Gabbar);
	      chatroom.register(Thakur);
	 
	      // Chatting participants
	      Thakur.send("Gabbar", "Ye hath nahi Ye phasi ka phanda hai");
	      Viru.send("Basanti", "In kutto ke samne mat nachana");
	      Basanti.send("Jay", "yu to mera nam Basanti hai");
	      Viru.send("Gabbar", "Kutte kamene mai tera khun pe jauga");
	      Gabbar.send("Thakur", "Ye hath mujhe dede thakur");
	}

}
