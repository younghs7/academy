package day14sort풀이최적화문제;


// 1. int 배열을 받는 기능
// 2. sorting 기능
// 3. 오름차순 / 내림차순
// bs.bubbleSort(data, true);
public class BubbleSort {
	
	public boolean bubbleSort(int[] data, boolean isASC)
	{
		
		int temp;
		
		boolean needLoop = true;
		while(needLoop)
		{
			needLoop = false;
			int i = 0;
			
			for(int k = 0; k < data.length-1-i; k++)
				
				if(isASC == true)
				{
					if(data[k] > data[k+1])
					{
						temp = data[k+1];
						data[k+1] = data[k];
						data[k] = temp;
						
						needLoop = true;
						i++;
					}
				}
				else
				{
					if(data[k] < data[k+1])
					{
						temp = data[k+1];
						data[k+1] = data[k];
						data[k] = temp;
						
						needLoop = true;
						i++;
					}
				}
				
		}
		
		return true;
	}
	
}
