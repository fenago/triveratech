package com.triveratravel.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.triveratravel.service.model.FlightRepository;

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
		var destinations = Arrays.asList(destinationCodes);
		var repository = FlightRepository.getDefaultInstance();

		var flights = repository.getFlightsForDestination(destinations);

		var results = new ArrayList<String>();
		for (var i = 0; i < flights.size(); i++) {
			var flight = flights.get(i);
			var description = flight.getFlightDescription();

			var flightString = String.format("%d) %s", i, description);
			results.add(flightString);
		}
		return results;
	}

	public static void main(String[] args) {
		RepositoryClient client = new RepositoryClient();
		List<String> flightsString = client.listFlights("LAX", "LAS", "SFO");
		flightsString.forEach(System.out::println);
	}

}
