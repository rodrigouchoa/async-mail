package com.rodrigouchoa.async.mail;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.mail.Session;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class ResourcesProducer {
	
	@Produces
	@PersistenceContext( unitName = "async-mail-pu")
	private EntityManager entityManager;
	
	/* Note that this resource has to be configured in standalone.xml (or domain.xml if you're in domain mode) */
	@Produces
	@Resource(mappedName = "java:jboss/mail/Gmail")
	private Session mailSession;

}
