package com.triveratravel.client;

import java.util.List;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC., Worldwide
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Technologies, Inc.
 *
 * Copyright (c) 2020 Trivera Technologies, LLC. http://www.triveratech.com
 * </p>
 * 
 * @author The Trivera Tech Team.
 */

public class RepositoryClient {

	public List<String> listFlights(String... destinationCodes) {
		return null;
	}

	public static void main(String[] args) {
		RepositoryClient client = new RepositoryClient();
		List<String> flightsString = client.listFlights("LAX", "LAS", "SFO");
		flightsString.forEach(System.out::println);
	}

}
