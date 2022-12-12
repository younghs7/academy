package day58_자바정리_수1_저번주_문제_추가요구;



public class URLAnalyer {

	private String url;
	private URLParameter[] param;

	
			

// 생성자ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ			
			
	public URLAnalyer()
	{
		url = null;
		param  = null;
	}
	
	public URLAnalyer(String url)
	{
		this.url = url;
		this.param = null;
	}
	

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	public void initalize()
	{
		setParameter();
	}
	
	
	
	// 기능 : url에서 parameter를 추출해서 필드 param에 넣음.
	public URLParameter[] setParameter()
	{
		
		// ? 가 없는 경우 null 을 리턴한다.
		if(url.indexOf("?") == -1)
			return null;
		
		
		// URL parameter만 따로 문자열로 짤라낸다.
		int firstIndex = url.indexOf("?") + 1;      		  // parameter 시작 인덱스를 찾는다.
		
		int endIndex = 0;                    				  // parameter 마지막 인덱스
		if(url.indexOf("#") == -1) 
		{
			endIndex = url.length() -1;               
		}
		else
		{
			endIndex = url.indexOf("#") - 1;
		}
		
		String parameterString = url.substring(firstIndex, endIndex );      // 기존 URL에서 parameter만 짤라낸다.
		
		
		
		
		// 파라미터를 URLParameter의 key, value 형식으로 저장한다.
	    String[] parameterArr = parameterString.split("\\&"); 		   // 짤라낸 문자열을 각 파라미터로 쪼개서 배열에 담는다.
		
	    
	    int paramCount = parameterArr.length;
	    this.param = new URLParameter[paramCount];
	    
	    for(int i = 0; i < paramCount; i++)
	    {	
	    	String[] keyValue = parameterArr[i].split("=");
	
	    	this.param[i] = new URLParameter();
	    	this.param[i].key = keyValue[0];
	    	this.param[i].value = keyValue[1];
	    	  	
	    }
	    
	    
	    return param;
	}
	
	
	
	
	
	
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	public URLParameter getParamBy(int index)
	{
		return param[index];
	}
	
	
	
	public String getURL()
	{
		return url;
	}
	
	
	public URLParameter[] getParameter()
	{
		return param;
	}
	
	
	
	public int getParamCount()
	{
		return param.length;
	}
	
	
	
	public String getDomain()
	{
		//  url이 "https://도메인" 인 경우와 "도메인/"인 경우를 나누어 처리함.
		int firstIndex;
		if( url.indexOf("//") == -1 )
		{
			firstIndex = 0;
		}
		else
		{
			firstIndex = url.indexOf("//") + 2;
		}
		
		int lastIndex = url.indexOf("/", firstIndex+2);
		
		String domain = url.substring(firstIndex, lastIndex);
		
		return domain;
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
	
	
	
	
	
}
