package com.rodrigouchoa.async.mail;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class CustomerService {
	
	@Inject
	private EntityManager em;
	
	@Inject
	private Event<MailEvent> eventProducer;
	
	
	/* This method correctly saves an object and sends an email as soon as
	 * the transaction commits, asynchronously. */
	public void saveSuccess() {
		Customer c1 = new Customer();
		c1.setId(1L);
		c1.setName("John Doe");
		em.persist(c1);
		
		System.out.println("Trying to send the email from the 'success' method...");
		sendEmail();
	}
	
	/* To get a transaction rollback, we intentionally set the same
	 * name to two different objects. Since this column has a unique constraint,
	 * a database error should occur.
	 * 
	 *  The email will never be sent.*/
	public void saveFail() {
		Customer c1 = new Customer();
		c1.setId(1L);
		c1.setName("Mary Anne");
		em.persist(c1);
		
		Customer c2 = new Customer();
		c2.setId(2L); 
		c2.setName("Mary Anne"); //same name!
		em.persist(c2);
		
		System.out.println("Trying to send the email from the 'fail' method... ");
		sendEmail();
	}
	
	private void sendEmail() {
		MailEvent event = new MailEvent();
		event.setTo("some.email@foo.com"); //PLEASE SWTICH THIS VALUE BY AN EMAIL OF YOUR OWN
		event.setSubject("Async email testing");
		event.setMessage("Testing email");
		eventProducer.fire(event);
	}
	

}
