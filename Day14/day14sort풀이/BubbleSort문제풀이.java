package day14sort풀이;

// 1. int 배열을 받는 기능
// 2. sorting 기능
// 3. 오름차순 / 내림차순
// bs.bubbleSort(data, true);
public class BubbleSort문제풀이 {
	
	public boolean bubbleSort(int[] data, boolean isASC)
	{
		
		int temp;
		for(int i = 0; i < data.length-1; i++)
		{
			for(int k = 0; k < data.length-1-i; k++)
				
				if(isASC == true)
				{
					if(data[k] > data[k+1])
					{
						temp = data[k+1];
						data[k+1] = data[k];
						data[k] = temp;
								
					}
				}
				else
				{
					if(data[k] < data[k+1])
					{
						temp = data[k+1];
						data[k+1] = data[k];
						data[k] = temp;
								
					}
				}
				
		}
		
		return true;
	}
	
}
