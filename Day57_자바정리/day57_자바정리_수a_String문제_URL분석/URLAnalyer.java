package day57_자바정리_수a_String문제_URL분석;

public class URLAnalyer {
	
	private String url;
	
	
	
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	public URLAnalyer() 
	{
		String url = null;
	}
	
	public URLAnalyer(String url) 
	{
		this.url = url;
	}
	

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	
	public String getParameterValueBy(String parameterKey)
	{
		int keyIndex = url.indexOf(parameterKey);
		
		// 타켓 문자열부터 문자 끝까지를 담는다.
		String partURL = url.substring(keyIndex, url.length()-1);
		
		int AmpersandIndex = partURL.indexOf("&");
		
		String result = url.substring(keyIndex + parameterKey.length()+1 , keyIndex + AmpersandIndex);
		
		return result;
		
	}
	
	
	public String[] getParameterALL()
	{
		
		// ? 가 없는 경우 null 을 리턴한다.
		if(url.indexOf("?") == -1)
			return null;
		
		int endIndex = 0;                    // parameter 마지막 인덱스
		// #이 있는 경우 # 전까지 담는다.
		if(url.indexOf("#") == -1)
		{
			endIndex = url.length() -1;               
		}
		else
		{
			endIndex = url.indexOf("#") - 1;
		}
		
		
		int ParameterFirstIndex = url.indexOf("?") + 1;       					// parameter 시작 인덱스를 찾는다.
	
		
		String ParameterString = url.substring(ParameterFirstIndex, endIndex ); // 기존 문자열에서 parameterIndex ~ URL 마지막까지를 짤라낸다.
		
		
	    String[] ParameterArr = ParameterString.split("\\&"); 					// 짤라낸 문자열을 &를 구분자로 써서 배열에 담는다.
		
	    return ParameterArr;
	}
	
	
	
	
	public String getURL()
	{
		return this.url;
	}
	
	

}
