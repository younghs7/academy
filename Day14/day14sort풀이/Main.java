package day14sort풀이;

public class Main {

	public static void main(String[] args) {
		
//	 	버블 소트를 먼저 짜는 게 아니라 어떻게 짤 지를 먼저 구상해놓고 짜야한다.
//		user는 나빼고 다라고 생각해야한다.
//		main도 사용자다.
		
		
//★		제작하기 전에 외부에서 사용하는 모습을 먼저 그려보고 짜야한다.
//		(외부에서 main에서)껍데기를 먼저 코딩 후에 해야한다.
		int[] data = new int[] {34, 26, 33, 0, 9};
		
		BubbleSort문제풀이 bs = new BubbleSort문제풀이();
		
		bs.bubbleSort(data, false);
		
		for(int i = 0; i<data.length; i++)
		System.out.println(data[i]);
		
		
		
		
		
	}

}
