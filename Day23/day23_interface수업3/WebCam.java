package day23_interface수업3;

public class WebCam implements Cam, Mic, SimpleUse {
	
	
	public void init()
	{
		initCam();
		initMic();
	}
	
	@Override
	public void initCam()
	{
		System.out.println("initCam");
	}
	@Override
	public boolean TurnON_Cam()
	{
		System.out.println("TurnON_Cam");
		return true;
	}
	@Override
	public void TurnOFF_Cam()
	{
		System.out.println("TurnOFF_Cam");
	}
	
	@Override
	public void initMic()
	{
		System.out.println("initMic");
	}
	
	@Override
	public boolean TurnON_Mic()
	{
		System.out.println("TurnON_Mic");
		return true;
	}
	
	@Override
	public void TurnOFF_Mic()
	{
		System.out.println("TurnOFF_Mic");
	}

	
}
