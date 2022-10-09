package day13Sort_문제1;

public class Sort {
	
	//0. 클래스 private 변수 설정-----------------------------
	private int[] array = null; //생성된 배열 or 등록된 배열
	private int[] temp = new int[2]; //temp: temporary

	private String err = "정상 작동"; //error 상태 표시
	
	
//	--------------------------------------------------------
	
	//1-1. 배열 생성 함수
	public void genArray(int Array크기)
	{
		array = new int[Array크기];

	}
	//1-2. 배열 등록 함수
	public void registerArray(int[] array)
	{
		this.array = array;
	}
	
	//1-3. array 변수 getter
	public int[] getArayy()
	{
		return array;
	}
	
	
	//2. Class Sort 맴버인 array변수를 랜덤값으로 채우는 함수-----------------------------
	public void fillArrayWithRandom()
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random()*100)+1;
		}
	}
	
	
	//3. Class Sort 맴버인 array변수를 오름차순으로 정렬하는 함수-----------------------------
	public void changeArrayInAscendingOrder()
	{	
		
		
		
		boolean needLoop = true;
		//1. needLoop 변수가 false가 될 때까지 while문이 실행함.
		while(needLoop)
		{
			needLoop = false;
			for(int j = 0; j < array.length-1; j++)
			{	
				
				//2. if문: 배열[index]끼리 크기를 비교하고 크기가 다르다면 배치를 바꿈
				if(array[j] > array[j+1])
				{
					temp[0] = array[j];
					temp[1] = array[j+1];
					array[j] = temp[1];
					array[j+1] = temp[0];
					
					//3. if문이 한번도 실행되지 않는다면 needLoop가 false 상태로 됨.
					needLoop = true;
						
				}
				
			}
		}	
	}
	
//	실제로 쓴다면 이렇게 쓸 거 같은데
//	public void changeArrayInAscendingOrder(int[] array)
//	{	
//		this.array = array;
//		
//		boolean needLoop = true;
//		//1. needLoop 변수가 false가 될 때까지 while문이 실행함.
//		while(needLoop)
//		{
//			needLoop = false;
//			for(int j = 0; j < array.length-1; j++)
//			{	
//				
//				//2. if문: 배열[index]끼리 크기를 비교하고 크기가 다르다면 배치를 바꿈
//				if(array[j] > array[j+1])
//				{
//					temp[0] = array[j];
//					temp[1] = array[j+1];
//					array[j] = temp[1];
//					array[j+1] = temp[0];
//					
//					//3. if문이 한번도 실행되지 않는다면 needLoop가 false 상태로 됨.
//					needLoop = true;
//					
//						
//				}
//				
//			}
//		}	
//	}
	
	

	
	//4. Class Sort 맴버인 array변수를 내림차순으로 정렬하는 함수-----------------------------
	public void changeArrayInDescendingOrder()
	{	
		//배열 갯수-1 
		for(int i= 0; i < array.length-1; i++)
		{	
			//
			for(int j = 0; j < array.length-1-i; j++)
			{
				
				if(array[j] < array[j+1])
				{
					temp[0] = array[j];
					temp[1] = array[j+1];
					array[j] = temp[1];
					array[j+1] = temp[0];
				}
			}
		}
			
	}

//	실제로 쓴다면 이렇게 쓸 거 같은데
//	public void changeArrayInDescendingOrder(int[] array)
//	{	
//		this.array = array;
//		
//		//배열 갯수-1 
//		for(int i= 0; i < array.length-1; i++)
//		{	
//			//
//			for(int j = 0; j < array.length-1-i; j++)
//			{
//				
//				if(array[j] < array[j+1])
//				{
//					temp[0] = array[j];
//					temp[1] = array[j+1];
//					array[j] = temp[1];
//					array[j+1] = temp[0];
//				}
//			}
//		}
//			
//	}
	
	
	//5. 오름차순 내림차순 함수 합치기-----------------------------
	public void SortArray(int code)
	{
//		code == 1 이면 오름차순 정렬 실행
		if(code == 1)
		{
			changeArrayInAscendingOrder();
		}
//		code == 2이면 내림차순 정렬 실행
		else if(code ==2)
		{
			changeArrayInDescendingOrder();
		}
		else
		{
			err = "SortArray() ERR: 1또는2만 들어갈 수 있습니다. 1: 오름차순 2: 내림차순";
		}
	}
	
	
	
	
	//6. 생성된 배열 상태 정보를 print해주는 함수-----------------------------
	public void printArrayInfo()
	{	
		
		System.out.println("array 상태 정보");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("array["+i+"]: "+array[i]);
		}
		
		System.err.println(err);
		

	}
	

}
