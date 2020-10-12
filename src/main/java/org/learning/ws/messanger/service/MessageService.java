package org.learning.ws.messanger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.learning.ws.messanger.database.DatabaseClass;
import org.learning.ws.messanger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	
	  public MessageService() {
		  /*messages.put(1L, new Message(1,"Hello World!","satish",new Date())); 
		  messages.put(2L, new Message(1,"Hello Jersey!","ashish",new Date())); 
		  messages.put(3L, new Message(1,"Hello JAX-RS!","manish",new Date())); */
		  messages.put(1L, new Message.Builder()
				  .id(1L)
				  .message("Hello World!")
				  .author("satish")
				  .created(new Date())
				  .build());
		  messages.put(2L, new Message.Builder()
				  .id(2L)
				  .message("Hello Jersey!")
				  .author("kirshna")
				  .created(new Date())
				  .build());
		  messages.put(3L, new Message.Builder()
				  .id(3L)
				  .message("Hello JAX-RS!")
				  .author("kavya")
				  .created(new Date())
				  .build());
	  }
	 
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		//message.setId(messages.size()+1);
		message = new Message.Builder().messages(message).id(messages.size()+1).build();
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
