package day22_링크드리스트_개인;

public class NodeData {
	
	private int    intValue;
	private String strValue;

	
//	--------------------------------------
	
	//기본 생성자
	public NodeData()
	{
		intValue = 0;
		strValue = null;
	}
	
	
	//오버로딩된 생성자
	public NodeData(int intValue, String strValue)
	{
		this.intValue = intValue;
		this.strValue = strValue;
	}

	
	
//	--------------------------------------

	public int getIntValue() {
		return intValue;
	}


	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}


	public String getStrValue() {
		return strValue;
	}


	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
	
//	--------------------------------------
	
	
	
	
	
}	
