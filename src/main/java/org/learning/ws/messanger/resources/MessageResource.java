package org.learning.ws.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.learning.ws.messanger.model.Message;
import org.learning.ws.messanger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		List<Message> lst = service.getAllMessages();
		lst.forEach(a -> System.out.println(a));
		return lst;
	}
}
