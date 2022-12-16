package day58_자바정리_수3_문제풀이_다운로드_박수현;
class URLParameter
{
	public String key;
	public String value;
	
	
}

public class URLAnalyer {
	
	private String url;
	
	
	public URLAnalyer()
	{
		
	}
	
	public URLAnalyer(String url)
	{
		this.url = url;
		
	}
	
	
//https://www.naver.com/index.html?id=admin&pwd=1234&type=manager");
	public String getDomain()
	{
		int startIndex;
		int endIndex;
		
		startIndex = url.indexOf("//");
		
		endIndex = url.indexOf("/", startIndex + 2);
		
		String domain = url.substring(startIndex + 2, endIndex);
		
		return domain;
		
	}
	
	
	
	
	public int getParamCount()
	{
		
		String temp = url.replace("&", "");		
		int count = url.length() - temp.length();
		
		if (count == 0)
		{
			if (-1 != url.indexOf("?"))
				return 1;
			else 
				return 0;
				
		}
		else	
			return count + 1;		// ?포함
				
	}
	
	
	
	
	private URLParameter makeURLParam(String str)
	{
		URLParameter param = new URLParameter();
		
		int index = str.indexOf("=");
		
		param.key = str.substring(0, index);
		param.value = str.substring(index + 1, str.length());
		
		return param;
		
	}
	
	
	public URLParameter getParam(int nth)
	{
		int startIndex = 0;
		int endIndex = 0;
		int tempIndex = 0;
		String paramString;
		URLParameter param = null;
		
		int count = getParamCount();
		
		if ((count == 0) || (count <= nth))
			return null;
		
		
		
		if (nth == 0)
		{
			//? 부터 첫번째 &사이의 문자열을 가지고온다.
			startIndex = url.indexOf("?");
			endIndex = url.indexOf("&");			
			paramString = url.substring(startIndex + 1, endIndex);
			
			//가지고온 문자열로부터 param을 만든다.
			param = makeURLParam(paramString);
			
		}
		else
		{
			//https://www.naver.com/index.html?id=admin&pwd=1234&type=admin
			
			tempIndex = url.indexOf("?") + 1;
			
			//1. startIndex를 찾는다.
			for (int i = 0; i < nth; i++)
			{
				startIndex = url.indexOf("&", tempIndex);				
				tempIndex = startIndex + 1; 				
				
			}
			
			startIndex++;
			
			//2. endIndex를 찾는다.			
			endIndex = url.indexOf("&", startIndex);
			
			if (endIndex == -1)
			{
				paramString = url.substring(startIndex, url.length());	
				
			}
			else
			{
				paramString = url.substring(startIndex, endIndex);
				
			}
					
			param = this.makeURLParam(paramString);
			
			
		}
		
		
		return param;
	}

}

