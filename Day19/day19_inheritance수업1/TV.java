package day19_inheritance수업1;

public class TV {
	
	public int channel;         //채널
	public String channelName;     //채널명

	public TV()
	{

		channel = 0;      
		channelName = "noname";   

	}
	
	public TV(int channel)
	{

		this.channel = channel;      
		channelName = "noname";   

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
