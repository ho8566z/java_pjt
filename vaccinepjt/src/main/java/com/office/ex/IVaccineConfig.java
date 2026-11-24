package com.office.ex;

/**
 * 백신 프로젝트에서 쓰는 MySQL(db_flu) 접속 상수를 모아 둔 인터페이스.
 */
public interface IVaccineConfig {

	final public String DRIVER = "com.mysql.cj.jdbc.Driver";
	final public String URL = "jdbc:mysql://127.0.0.1:3306/db_flu";
	final public String USER = "root";
	final public String PASSWORD = "1234";
	
}
