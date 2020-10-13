package org.learning.ws.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name = "Message")
public class Message {
	
	private long id;
	private String message;
	private String author;
	private Date created;
	/*private Message messages;
	public Message(){
		
	}
	private Message(Builder builder) {
		this.id = builder.id;
		this.message = builder.message;
		this.author = builder.author;
		this.created = builder.created;
		this.messages = builder.messages;
	}
	
	@XmlElement(name = "id")
	public long getId() {
		return id;
	}

	@XmlElement(name = "message")
	public String getMessage() {
		return message;
	}

	@XmlElement(name = "author")
	public String getAuthor() {
		return author;
	}

	@XmlElement(name = "created")
	public Date getCreated() {
		return created;
	}
	*/
	

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", author=" + author + ", created=" + created + "]";
	}

/*

	@XmlRootElement(name = "Message")
	@XmlType(name = "Builder")
	public static class Builder{
		
		private long id;
		private String message;
		private String author;
		private Date created;
		private Message messages;
		
		public Builder() {}
		
		public Builder messages(Message messages) {
			this.messages = messages;
			return this;
		} 
		
		public Builder id(long id) {
			this.id = id;
			return this;
		}
		
		public Builder message(String message) {
			this.message = message;
			return this;
		}
		
		public Builder author(String author) {
			this.author = author;
			return this;
		}
		
		public Builder created(Date created) {
			this.created = created;
			return this;
		}
		
		public Message build() {
			return new Message(this);
		}
	}*/
	public Message() {
		
	}
	
	public Message(long id, String message, String author, Date created) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = created;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
