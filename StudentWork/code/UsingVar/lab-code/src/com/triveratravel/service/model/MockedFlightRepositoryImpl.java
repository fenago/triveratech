package com.triveratravel.service.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
public class MockedFlightRepositoryImpl implements FlightRepository {
	private static final List<Flight> flights = new ArrayList<>();
	static {

		flights.add(new Flight("B6", 1077, "JetBlue Airways", "LAS", "Las Vegas", "7:00 AM"));
		flights.add(new Flight("VX", 351, "Virgin America", "SFO", "San Francisco", "7:15 AM"));
		flights.add(new Flight("DL", 2531, "Delta Air Lines", "LAX", "Los Angeles", "7:19 AM"));
		flights.add(new Flight("UA", 809, "United Airlines", "SFO", "San Francisco", "8:20 AM"));
		flights.add(new Flight("B6", 133, "JetBlue Airways", "SFO", "San Francisco", "8:25 AM"));
		flights.add(new Flight("B6", 1833, "JetBlue Airways", "SFO", "San Francisco", "10:35 AM"));
		flights.add(new Flight("UA", 477, "United Airlines", "SFO", "San Francisco", "10:45 AM"));
		flights.add(new Flight("AA", 147, "American Airlines", "LAX", "Los Angeles", "2:55 PM"));
		flights.add(new Flight("UA", 1572, "United Airlines", "SFO", "San Francisco", "4:05 PM"));
		flights.add(new Flight("VX", 353, "Virgin America", "SFO", "San Francisco", "4:25 PM"));
		flights.add(new Flight("B6", 487, "JetBlue Airways", "LAX", "Los Angeles", "4:55 PM"));
		flights.add(new Flight("NK", 641, "Spirit Airlines", "LAS", "Las Vegas", "5:17 PM"));
		flights.add(new Flight("VX", 367, "Virgin America", "LAX", "Los Angeles", "5:45 PM"));
		flights.add(new Flight("AA", 305, "American Airlines", "LAX", "Los Angeles", "5:59 PM"));
		flights.add(new Flight("B6", 833, "JetBlue Airways", "SFO", "San Francisco", "6:10 PM"));
		flights.add(new Flight("UA", 576, "United Airlines", "SFO", "San Francisco", "6:15 PM"));
		flights.add(new Flight("VX", 357, "Virgin America", "SFO", "San Francisco", "6:59 PM"));
		flights.add(new Flight("B6", 777, "JetBlue Airways", "LAS", "Las Vegas", "7:55 PM"));
		flights.add(new Flight("B6", 687, "JetBlue Airways", "LAX", "Los Angeles", "9:15 PM"));
		flights.add(new Flight("B6", 619, "JetBlue Airways", "SAN", "San Diego", "7:35 AM"));
		flights.add(new Flight("LY", 8564, "El Al", "SAN", "San Diego", "7:35 AM"));
		flights.add(new Flight("B6", 19, "JetBlue Airways", "SAN", "San Diego", "4:40 PM"));
		flights.add(new Flight("EI", 5258, "Aer Lingus", "SAN", "San Diego", "4:40 PM"));
		flights.add(new Flight("EK", 6097, "Emirates", "SAN", "San Diego", "4:40 PM"));
		flights.add(new Flight("QR", 4034, "Qatar Airways", "SAN", "San Diego", "4:40 PM"));
		flights.add(new Flight("AS", 769, "Alaska Airlines", "SAN", "San Diego", "6:10 PM"));
		flights.add(new Flight("AA", 7133, "American Airlines", "SAN", "San Diego", "6:10 PM"));
		flights.add(new Flight("EK", 3015, "Emirates", "SAN", "San Diego", "6:10 PM"));
	}

	@Override
	public List<Flight> getFlightsForDestination(List<String> destinationCodes) {
		return flights.stream().filter(flight -> destinationCodes.contains(flight.getDestinationCode()))
				.collect(Collectors.toList());
	}

}
