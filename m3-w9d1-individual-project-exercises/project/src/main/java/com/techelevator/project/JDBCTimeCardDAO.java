package com.techelevator.project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCTimeCardDAO implements TimeCardDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCTimeCardDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<TimeCard> getAllTimeCards(String username) {
		List<TimeCard> allPosts = new ArrayList<>();
		String sqlSelectAllTimeCards = "SELECT * FROM timecard WHERE user_name=?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllTimeCards, username);
		while(results.next()) {
			TimeCard tc = new TimeCard();
			tc.setId(results.getLong("id"));
			tc.setUsername(results.getString("user_name"));
			tc.setProject(results.getString("project"));
			tc.setNotes(results.getString("notes"));
			tc.setStart(results.getTimestamp("start_datetime").toLocalDateTime());
			tc.setEnd(results.getTimestamp("end_datetime").toLocalDateTime());
			allPosts.add(tc);
		}
		return allPosts;
	}
	
	@Override
	public Long makeClockIn(String username) {
		String sqlClockIn = "INSERT INTO timecard (user_name, start_datetime) VALUES (?,?)";
		Long clockInId = (Long)jdbcTemplate.queryForObject(sqlClockIn, Long.class, username, LocalDateTime.now());
		return clockInId;
	}
	

}
