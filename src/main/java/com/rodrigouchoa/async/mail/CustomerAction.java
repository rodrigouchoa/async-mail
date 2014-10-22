package com.rodrigouchoa.async.mail;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/* This is the JSF Managed Bean */
@Named
@RequestScoped
public class CustomerAction {
	
	@Inject
	private CustomerService customerService;
	
	/* Method called by the "save" button */
	public void save() {
		customerService.saveSuccess();
	}
	
	public void fail() {
		customerService.saveFail();
	}

}
