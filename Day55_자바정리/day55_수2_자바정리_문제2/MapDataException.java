package day55_수2_자바정리_문제2;
public class MapDataException extends Exception {
	
	public MapDataException()
	{
		super("맵 데이터 잘못되었다.");
	}

	
	public MapDataException(String message)
	{
		super(message);
	}

}


// 오류 검색해보기
//
// The serializable class MapDataException does not declare a static final serialVersionUID field of type long