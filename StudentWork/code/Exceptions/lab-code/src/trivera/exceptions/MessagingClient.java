package trivera.exceptions;

import trivera.exceptions.messaging.MessagingService;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera
 * Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2020 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class MessagingClient {

	private void sendMessages() {
		MessagingService service = new MessagingService();
		service.sendMessage("Fred", "123", "Hello World");
		service.sendMessage("Fred", "123", "this is a .NET class");
	}

	public static void main(String[] args) {
		MessagingClient client = new MessagingClient();
		client.sendMessages();

	}

}
