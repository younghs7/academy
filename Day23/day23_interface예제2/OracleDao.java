package day23_interface예제2;

public class OracleDao implements DataAccessObject{
	
	
	public void select()
	{
		System.out.println("mysql db에서 검색");
	}
	
	public void insert()
	{
		System.out.println("mysql db에서 삽입");
	}
	
	public void update()
	{
		System.out.println("mysql db에서 수정");
	}
	
	public void delete() 
	{
		System.out.println("mysql db에서 삭제");
	}

}
