package mempjtcom.office.ex;

public interface IMemberDao {
	
	final public String DRIVER = "com.mysql.cj.jdbc.Driver";
	final public String URL = "jdbc:mysql://localhost:3306/db_member";
	final public String USER = "root";	
	final public String PASSWORD = "1234";
	
	public int insertNewMember(MemberDto memberDto);

	public MemberDto selectMemberByMemId(String memId);

}
