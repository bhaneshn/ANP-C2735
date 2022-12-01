package org.spring.jdbc.daoimpl;

import org.spring.jdbc.dao.PassengerDAO;
import org.spring.jdbc.entity.Passenger;
import org.springframework.jdbc.core.JdbcTemplate;

public class PassengerDAOImpl implements PassengerDAO{

	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int savePassenger(Passenger pass) {
		String query = "insert into passenger value('"+pass.getId()+"','"+pass.getSeatNo()+"','"+pass.getAge()+"','"+pass.getTicketPrice()+"','"+pass.getPname()+"')";
		return jdbcTemplate.update(query);
	}

	public int updatePassenger(Passenger pass) {
		String query= "update passenger set pname = '"+pass.getPname()+"' where id='"+pass.getId()+"'";
		return jdbcTemplate.update(query);
	}

	public int deletePassenger(Passenger pass) {
		String query = "delete from passenger where id='"+pass.getId()+"'";
		return jdbcTemplate.update(query);
	}

}
