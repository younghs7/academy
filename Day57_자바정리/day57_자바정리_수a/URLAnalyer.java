package day57_자바정리_수a;

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
		int elementIndex = url.indexOf(parameterKey);
		
		// 타켓 문자열부터 문자 끝까지를 담는다.
		String partURL = url.substring(elementIndex, url.length()-1);
		
		int AmpersandIndex = partURL.indexOf("&");
		
		String result = url.substring(elementIndex + parameterKey.length()+1 , elementIndex + AmpersandIndex);
		
		return result;
		
	}
	
	
	public String[] getParameterALL()
	{
		// 불완전하네.
		
		// ? 가 없는 경우 null 을 리턴한다.
		// #이 있는 경우 #까지 담는다.
		
		int ParameterFirstIndex = url.indexOf("?") + 1;       					// parameter 시작 인덱스를 찾는다.
	
		int endIndex = url.length() -1 ;										// URL 마지막 인덱스를 찾는다.
		
		String ParameterString = url.substring(ParameterFirstIndex, endIndex ); // 기존 문자열에서 parameterIndex ~ URL 마지막까지를 짤라낸다.
		
		
	    String[] ParameterArr = ParameterString.split("\\&"); 					// 짤라낸 문자열을 &를 구분자로 써서 배열에 담는다.
		
	    return ParameterArr;
	}
	
	
	
	
	public String getURL()
	{
		return this.url;
	}
	
	

}
