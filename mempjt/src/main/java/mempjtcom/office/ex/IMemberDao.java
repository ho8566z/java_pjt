package mempjtcom.office.ex;

/**
 * 회원 DAO 가 지켜야 할 기능과 MySQL(db_member) 접속 상수를 정의한 인터페이스.
 */
public interface IMemberDao {
	
	final public String DRIVER = "com.mysql.cj.jdbc.Driver";
	final public String URL = "jdbc:mysql://localhost:3306/db_member";
	final public String USER = "root";	
	final public String PASSWORD = "1234";
	
	public int insertNewMember(MemberDto memberDto);

	public MemberDto selectMemberByMemId(String memId);

	/**
	 * 회원 번호로 회원 정보를 수정한다.
	 * 
	 * @param memberDto 수정할 회원 정보
	 * @return 수정된 행 수
	 */
	public int updateMemberByMemNo(MemberDto memberDto);

}
