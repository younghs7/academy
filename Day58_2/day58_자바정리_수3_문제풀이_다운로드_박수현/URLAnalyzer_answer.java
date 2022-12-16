package day58_자바정리_수3_문제풀이_다운로드_박수현;

public class URLAnalyzer_answer {
	
	private String url;
	private String domain;
	private URLParameter[] urlParamArr;
	
	// 기본생성자
	public URLAnalyzer_answer() 
	{
		url = null;
		domain = null;
		urlParamArr = null;
	}
	
	// 오버로딩된 생성자
	public URLAnalyzer_answer(String url) 
	{
		this.url = url;
		domain = null;
		urlParamArr = null;
	}
	
	///////////////////////////////////////////
	
	// domain get
	public String getDomain()
	{
		// ["https:", "", "www.naver.com", "index.html?id=admin&pw=1234"]
		String[] domainCutting = url.split("/");
		domain = domainCutting[2];
		return domain;
	}
	
	// parameter count get
	public int getParamCount()
	{
		int count = 0;
		
		// ["https://www.naver.com/index.html", "id=admin&pw=1234"]
		String paramCutting = url.split("\\?")[1];
		
		// ["id=admin", "pw=1234"]
		String[] paramsArr = paramCutting.split("&");
		
		count = paramsArr.length;
		
		return count;
	}
	
	// parameter arr setting
	public void setUrlParamArr()
	{
		urlParamArr = new URLParameter[getParamCount()];
		
		// ["https://www.naver.com/index.html", "id=admin&pw=1234"]
		String paramCutting = url.split("\\?")[1];
		
		// ["id=admin", "pw=1234"]
		String[] paramsArr = paramCutting.split("&");
		
		String[] keyValue;
		
		for(int i = 0; i < urlParamArr.length; i++)
		{
			keyValue = paramsArr[i].split("=");	// ["id", "value"]
			
			urlParamArr[i] = new URLParameter();
			urlParamArr[i].key = keyValue[0];
			urlParamArr[i].value = keyValue[1];
		}
	}
	
	// param get
	public URLParameter getParam(int index)
	{
		if(index >= getParamCount())
		{
			return null;
		}
		setUrlParamArr();
		return urlParamArr[index];
	}
	
	
}
