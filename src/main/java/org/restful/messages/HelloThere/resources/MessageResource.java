package org.restful.messages.HelloThere.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.restful.messages.HelloThere.beans.MessageFilterBean;
import org.restful.messages.HelloThere.model.Message;
import org.restful.messages.HelloThere.service.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService messageService = new MessageService();

	@GET
	public List<Message> getMessages(@BeanParam MessageFilterBean filterBean) {
		if (filterBean.getYear() > 0) {
			return messageService.getAllMessagesForYear(filterBean.getYear());
		}
		if(filterBean.getStart() >= 0 && filterBean.getSize() >= 0){
			return messageService.getAllMessagesPaginated(filterBean.getStart(), filterBean.getSize());
		}
		return messageService.getAllMessages();
	}

	@POST
	public Message addMessage(Message message) {

		return messageService.addMessage(message);
	}

	@PUT
	@Path("/{messageId}")
	public Message updateMessage(Message message,
			@PathParam("messageId") long messageId) {

		message.setId(messageId);
		return messageService.updateMessage(message);
	}

	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long messageId) {
		messageService.removeMessage(messageId);
	}

	@GET
	@Path("/{messageId}")
	// Here Jersey is making the conversion from String type of the messageId
	// from the URL
	// to long type in the method
	public Message test(@PathParam("messageId") long messageId) {

		return messageService.getMessage(messageId);
	}
	
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource(){
		return new CommentResource();
	}

}
