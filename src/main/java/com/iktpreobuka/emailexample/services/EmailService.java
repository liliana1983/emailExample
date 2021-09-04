package com.iktpreobuka.emailexample.services;

import com.iktpreobuka.emailexample.models.EmailObject;

public interface EmailService {
	void sendSimpleMessage (EmailObject object);
	void sendTemplateMessage (EmailObject object) throws
	Exception;
	void sendMessageWithAttachment (EmailObject object,
	String pathToAttachment) throws Exception;
}
