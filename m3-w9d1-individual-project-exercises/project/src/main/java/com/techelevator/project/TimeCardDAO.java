package com.techelevator.project;

import java.util.List;

public interface TimeCardDAO {

	List<TimeCard> getAllTimeCards(String username);

	Long makeClockIn(String username);

}
