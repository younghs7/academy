package day19_inheritance수업1;

public class SmartTV extends TV{
	
	public String ipAddress;
	
	
	public SmartTV()
	{	
		super();
		ipAddress = null;
	
	}
	public SmartTV(String ipAddress, int channel)
	{	
		super(channel);
		this.ipAddress = ipAddress;
		
	}
//	-----------------------------------
	public String setchannelName()
	{
		return super.channelName;
	}
	
	
	public void Show()
	{	super.Show();
		System.out.println("Show image");
		System.out.println("Show smartTV");
		
		
	}
	
	
	public void Browsing()
	{
		System.out.println("Start Internet!!");
	}
	

	
}
