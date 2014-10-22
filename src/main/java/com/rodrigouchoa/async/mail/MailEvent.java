package com.rodrigouchoa.async.mail;

/* This is our event object.
 * 
 *  It encapsulates the information necessary to send the email,
 *  such as the recipient, the message itself and the subject.
 *  
 *  In more realistic scenarios this class would have a bunch of other fields,
 *  such as "toCC", "attachments", etc.
 *  */
public class MailEvent {
	private String to; //recipient address
	private String message;
	private String subject;
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
