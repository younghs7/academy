package day19수업1;

public class TV {
	
	public int channel;         //채널
	public String channelName;     //채널명

	public TV()
	{

		channel = 0;      
		String channelName = "noname";   

	}
	
	public TV(int channel)
	{

		this.channel = channel;      
		String channelName = "noname";   

	}

	
	public void changeChannle(int channel)
	{
		this.channel = channel;
	}
	
	public void Show()
	{
		System.out.println("Show TV");
	}
	
	
}
