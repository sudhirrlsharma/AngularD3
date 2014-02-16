package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatroomImpl implements  Chatroom{

	  private Map<String,Participant>participants =new HashMap<String,Participant>();
	@Override
	public void register(Participant participant) {
		 if (!participants.containsValue(participant))
	      {
	        participants.put(participant.getName(), participant);
	      }
	 
	      participant.setChatroom(this);
		
	}

	@Override
	public void send(String from, String to, String message) {
		Participant participant = participants.get(to);
		 
	      if (participant != null)
	      {
	        participant.receive(from, message);
	      }
	    }

}
