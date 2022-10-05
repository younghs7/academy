
package Day12문제1;

public class Student {
	

	private String name;
	private int 학번;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private double avgScore;


	public int total()
	{
		this.totalScore = this.korScore + this.engScore + this.mathScore;
		return this.totalScore;
	}
	
	public double avg()
	{
		this.totalScore = this.korScore + this.engScore + this.mathScore;
		this.avgScore = (double)this.totalScore/3;
		return this.avgScore;
	}
	
	
	
//	-이름---------------------------------
	
	public void setName(String _name)
	{
		this.name = _name;
	}

	public String getName()
	{
		return this.name;
	}

//	-학번---------------------------------
	
	public void set학번(int _학번) 
	{	
		if(_학번 < 0)
		{
			System.out.println("ERR 학번은 음수로 설정할 수 없습니다.");
			return;	
		}
	
		학번 = _학번;
	}
	
	
	public int get학번()
	{
		return this.학번;
	}
		
//	--국어점수-------------------------------
	
	public void setKor(int kor)
	{
		if( ( kor < 0) || (kor > 100) )
			return;
		
		korScore = kor;
	}
	
	public int getKor()
	{
		return korScore;
	}
	
//	--영어점수-------------------------------
	
	public void setEng(int eng)
	{
		if( ( eng < 0) || (eng > 100) )
			return;
		
		engScore = eng;
	}
	
	
	public int getEng()
	{
		return engScore;
	}
	
	
//	--수학점수-------------------------------
	
	public void setMath(int math)
	{
		if( ( math <= -1) || (math >= 101) )
			return;
		
		mathScore = math;
	}
	
	
	public int getMath()
	{
		return mathScore;
	}
	

}
