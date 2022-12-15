package day55_수1_자바정리_문제1;

public class Array_test {

	public static void main(String[] args) {


		
		
		int[][] array = { {1, 2, 3}, {1, 2} };
		
		System.out.println(array);
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		int[] array2 = array[0]; 	// array[][]라고 정의해도 
		int[] array3 = array[1];	// elment 를 array[] 으로 불러 올 수 있다.
		
		
		
		
		// 이렇게도 되네!
		
		int[][] arr = new int[3][];     // 이렇게도 되네!
		
		int[] arr1 = {11, 12, 33};
		int[] arr2 = {11, 22};
		int[] arr3 = {11};
		
		arr[0] = arr1;
		arr[1] = arr2;
		arr[2] = arr3;
		

				
		
		for(int i = 0; i < arr.length; i++)
		{	
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("arr["+i+"]: " + arr[i]);
			
			for(int elem : arr[i])
			{
				System.out.println(elem);
				
			}
		}
		
		
		
		

	}

}
