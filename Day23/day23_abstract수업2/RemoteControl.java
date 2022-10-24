package day23_abstract수업2;

public interface RemoteControl {
	
	public void turnON();
	public void turnOFF();
	
	
//	default void setMute(boolean mute)
//	{
//		if(mute) 
//		{
//			System.err.println("무음 처리합니다.");
//		}
//		else
//		{
//			System.out.println("무음 해제합니다.");
//		}
//	}
	/*
	 데이터를 불러오고 셋팅할 필요없이 독립적으로 도는 메소드만 
	 인터페이스에 default 메소드로 넣을 수 있다.
	 */
	
	
	
}
