package day14sort풀이최적화문제;

	// 2. sorting 기능
	// 3. 오름차순 / 내림차순
	// bs.bubbleSort(data, true);
	public class BubbleSort최적화풀이 {
		
		public boolean bubbleSort(int[] data, boolean isASC)
		{
			boolean swapFlag = false;
			
			int temp;
			for(int i = 0; i < data.length-1; i++)
			{
				for(int k = 0; k < data.length-1-i; k++)
				{	
					
					if(isASC == true)
					{
						if(data[k] > data[k+1])
						{
							temp = data[k+1];
							data[k+1] = data[k];
							data[k] = temp;
							
							 swapFlag = true;
									
						}
					}
					else
					{
						if(data[k] < data[k+1])
						{
							temp = data[k+1];
							data[k+1] = data[k];
							data[k] = temp;
									
							swapFlag = true;
						}
					}
				}	
			
			
				if (swapFlag == true)
				{
					// 소팅이 완료되지 않았다
					swapFlag = false;
				}
				else
				{
					//소팅이 완료되었다.
					break;
				}
			}
			
			return true;
		}
		
	}
