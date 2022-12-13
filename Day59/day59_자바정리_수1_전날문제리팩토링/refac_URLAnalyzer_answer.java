package day59_자바정리_수1_전날문제리팩토링;


public class refac_URLAnalyzer_answer {
	
	private String url;					// 입력받은 URL
	private String domain;				// 도메인이 저장되는 변수
	private URLParameter[] urlParamArr;	// 파라미터가 저장되는 변수
	
	
	
	// 기본생성자
	public refac_URLAnalyzer_answer() 
	{
		url = null;
		domain = null;
		urlParamArr = null;
	}
	
	// 오버로딩된 생성자
	public refac_URLAnalyzer_answer(String url) 
	{
		this.url = url;
		domain = null;
		urlParamArr = null;
	}
	
	
	public void clean()
	{
		this.url = url;
		domain = null;
		urlParamArr = null;
		
		
	}
	// 초기 셋팅 설정 함수
	public boolean init()
	{	
		if (0 == url.length())
		{
			return false;
		}
		
		//1. URL을 파싱하여 클래스 변수에 설정한다.
		parseUrlParam();
		
		//2. Domain을 파싱하여 클래스 변수에 설정한다.
		parseDomain();
		
		return true;
	}
	
	public boolean init(String url)
	{		
		if (0 == url.length())
		{
			return false;
		}
	
		this.url = url;
	
		//1. URL을 파싱하여 클래스 변수에 설정한다.
		parseUrlParam();
		
		//2. Domain을 파싱하여 클래스 변수에 설정한다.
		parseDomain();
		
		return true;
	
		
	}
	
	
	
	///////////////////////////////////////////
	
	private boolean parseDomain()
	{		
		String[] domainCutting = url.split("/");
		domain = domainCutting[2];
		
		return true;
	
	}
	
	
	
	// domain get
	public String getDomain()
	{
		return domain;
	}
	
	// parameter count get
	public int getParamCount()
	{
		int count = 0;
		
		// "?"가 없어 결국 아무일도 일어나지 않은 경우 ==> 파라미터가 없다.
		if(url.split("\\?").length == 1)
		{
			return 0;
		}
		
		// ["https://www.naver.com/index.html", "id=admin&pw=1234"]
		String paramCutting = url.split("\\?")[1];
		
		// ["id=admin", "pw=1234"]
		String[] paramsArr = paramCutting.split("&");
		
		count = paramsArr.length;
		
		return count;
	}
	
	// parameter arr setting
	private void parseUrlParam()
	{
		if(getParamCount() != 0)
		{
			// 1. 파라미터 개수만큼 파라미터 객체를 생성.
			urlParamArr = new URLParameter[getParamCount()];
			
			// 2. URL에서 파라미터 부분만 띄어낸다.
			// ["https://www.naver.com/index.html", "id=admin&pw=1234"]
			String paramCutting = url.split("\\?")[1];
			
			// ["id=admin", "pw=1234"]
			String[] paramsArr = paramCutting.split("&");
			
			String[] keyValue;	// key와 value값을 담을 배열
			
			//3. key와 value를 분리해 낸다.
			for(int i = 0; i < urlParamArr.length; i++)
			{
				keyValue = paramsArr[i].split("=");	// ["id", "value"]
				
				urlParamArr[i] = new URLParameter();
				urlParamArr[i].key = keyValue[0];
				urlParamArr[i].value = keyValue[1];
			}
		}
	}
	
	// param get
	public URLParameter getParam(int index)
	{
		// 가지고 있는 파라미터개수보다 더 큰 index값 받은 경우 null로 가드코드 
		if(index >= getParamCount())
		{
			return null;
		}
		
		return urlParamArr[index];
	}
	
	
}
