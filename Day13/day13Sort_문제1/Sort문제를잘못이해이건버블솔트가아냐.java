package day13Sort_문제1;

public class Sort문제를잘못이해이건버블솔트가아냐 {
	
	//0. 클래스 private 변수 설정
	private int[] array = null; //생성된 배열
	private int[] temp = new int[2]; //temp: temporary(임시공간)

	private String err = "정상 작동";
	
	
	//1. 배열 생성 함수
	public void gen배열(int input크기)
	{
		array = new int[input크기];

	}
	
	
	//2. 생성된 배열에 랜덤값을 채우는 함수
	public void fillArrayWithRandom()
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random()*100)+1;
		}
	}
	
	
	//3. 생성된 배열을 오름차순으로 정렬하는 함수
	public void setAscendingOrder()
	{	
		
		
		// HaveToRun 변수가 false가 될 때까지 while문이 실행함.
		boolean HaveToRun = true;
		while(HaveToRun)
		{
			HaveToRun = false;
			for(int j = 0; j < array.length-1; j++)
			{	
				
				//1.배열[index]끼리 크기를 비교하고 크기가 다르다면 배치를 바꾸고,
				//HaveToRun 변수를 true 상태로 만듬.
				
				if(array[j] > array[j+1])
				{
					temp[0] = array[j];
					temp[1] = array[j+1];
					array[j] = temp[1];
					array[j+1] = temp[0];
					
					//2.한번도 실행되지 않는다면 HaveToRun이 false 상태로 됨.
					HaveToRun = true;
						
				}
				
			}
		}	
	}
	
	//4. 생성된 배열을 내림차순으로 정렬하는 함수
	public void setDescendingOrder()
	{	
		
		// HaveToRun 변수가 false가 될 때까지 while문이 실행함.
		boolean HaveToRun = true;
		while(HaveToRun)
		{
			HaveToRun = false;
			for(int j = 0; j < array.length-1; j++)
			{	
				
				//1.배열[index]끼리 크기를 비교하고 크기가 다르다면 배치를 바꾸고,
				//HaveToRun 변수를 true 상태로 만듬.
				if(array[j] < array[j+1])
				{
					temp[0] = array[j];
					temp[1] = array[j+1];
					array[j] = temp[1];
					array[j+1] = temp[0];
					
					//2.한번도 실행되지 않는다면 HaveToRun이 false 상태로 됨.
					HaveToRun = true;
				}
				
			}
		}	
	}
	
	//5. 오름차순 내림차순 함수 합치기
	public void SortArray(int code)
	{
//		code == 1 이면 오름차순 정렬 실행
		if(code == 1)
		{
			setAscendingOrder();
		}
//		code == 2이면 내림차순 정렬 실행
		else if(code ==2)
		{
			setDescendingOrder();
		}
		else
		{
			err = "내림오름input에는 1또는2만 들어갈 수 있습니다. 1: 오름차순 2: 내림차순";
		}
	}
	
	
	
	
	//6. 생성된 배열 상태 정보를 print해주는 함수
	public void printArrayInfo()
	{	
		System.err.println(err);
		
		System.out.println("array 상태 정보");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("array["+i+"]: "+array[i]);
		}
		
		System.err.println(err);
		

	}
	

}
