package com.xworkz.facebook.repository;

import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;

public interface FacebookRepository {

	public boolean validateAndSave(FacebookDto dto);

	public boolean update(FacebookDto dto, int id) throws ClassNotFoundException, SQLException;

	public boolean read() throws ClassNotFoundException, SQLException;

	public boolean delete(FacebookDto dto, int id) throws ClassNotFoundException, SQLException;

	public boolean updateByEmail(String firstName, String email) throws ClassNotFoundException, SQLException;

	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException;

	public boolean readByEmail(String email) throws ClassNotFoundException, SQLException;

}
