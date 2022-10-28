package day26_과제;


public class ListContainer {
	private Node head;
		
	/*
	문제1
	insertNode 2번째버전. 구현
	insert index가 기존 카운트보다 크거나 같은 값인 경우 노드의 가장 뒤에
	index가 0보다 작은경우 처리하지 않는다.
	
	 */
	
	/*
	문제2
	deleteNodeByintValue(int intValue) 구현
	해당 데이터를 가진 노드를 삭제 
	 */
	
//	---------------------------------
	
	
	
	// 문제1. 노드를 삽입하는 함수
		public boolean insertNode(int index, Node newNode)
		{	
			//리스트 갯수 가져와.
			int listCount = getNodeCount();
			int maxIndex = listCount - 1;
			
			//1. index 크기에 따른 처리
			//1-1. index가 음수인 경우
			if(index < 0)
			{
				return false;
			}
			
			//1-2.  index > maxIndex 일 때
			if(index > maxIndex)
			{
				index = maxIndex;
			}
			
			
			//1-3.  0 <= index <= maxIndex인 경우
			
			//1-3-1. head가 null인 경우
			if(head == null)	
			{
				head = newNode;
				
				return true;
			}
			
			//1-3-2. head가 null이 아닌 경우
		
			
			
			Node frontNode =  head;
			
			
			for(int i = 0; i < index-1; i++)
			{
				frontNode = frontNode.getNext();
			}
			
			//frontNode.next 참조값을 newNode.next 변수에 담는다.
			newNode.setNext( frontNode.getNext() );
			
			//frontNode.next 참조 변수에 newNode의 참조값을 담는다.
			frontNode.setNext(newNode);
			
			return true;
			
		}
		
		
		//추가 구현
		public void printList()
		{	
			System.out.println("현재 리스트 갯수: " + getNodeCount());
			
			//현재 노드 참조값을 담는 변수
			Node pointerNode = head;
			
			//nodePointer의 위치의 노드 NodeData객체 참조값을 담는 변수
			NodeData pointerNodeData;
			
			int index = 0;
			//노드의 next가 null이 아니면 실행
			while(pointerNode.getNext() != null)
			{	
				
				pointerNodeData = pointerNode.getData();
				
				//pointerNodeData를 참조해서 그 안에 있는 IntValue, StrValue 출력해.
				System.out.print("[index :" +index+"]");
				System.out.print(", [IntValue: " + pointerNodeData.getIntValue()+"]");
				System.out.println(", [StrValue: " + pointerNodeData.getStrValue()+"]");
				
				
				
				//pointerNode가 다음 노드를 참조하도록 한다.
				pointerNode = pointerNode.getNext();
				
				index++;
			}
			
			if(pointerNode.getNext() == null)
			{
				pointerNodeData = pointerNode.getData();
				
				//pointerNodeData를 참조해서 그 안에 있는 IntValue, StrValue 출력해.
				System.out.print("[index :" +index+"]");
				System.out.print(", [IntValue: " + pointerNodeData.getIntValue()+"]");
				System.out.println(", [StrValue: " + pointerNodeData.getStrValue()+"]");
			}
			
			
		}
		
		
		/*
		문제2
		deleteNodeByintValue(int intValue) 구현
		해당 데이터를 가진 노드를 삭제 
		 */
		
		
		public boolean deleteNodeByintValue(int intValue)
		{
			Node targetNode;
			int countDelete = 0;
			int targetIndex = 0;
			
			
			//1. 해당 데이터가 담긴 노드를 찾는다.
			targetNode = head;
			while(targetNode.getNext() != null)
			{	
				//타켓노드의 intValue 와 파라미터 intValue가 동일하다면
				if(targetNode.getData().getIntValue() == intValue)
				{
					//해당 위치의 노드를 삭제한다.
					deleteNode(targetIndex);
					countDelete++;
					targetIndex--;
				}
				
				//다음 노드로 넘어감.
				targetNode = targetNode.getNext();
				targetIndex++;
				
			}
			
			if(targetNode.getNext() == null)
			{	
				//타켓노드 intValue 와 파라미터 intValue가 동일하다면
				if(targetNode.getData().getIntValue() == intValue)
				{
					//해당 위치의 노드를 삭제한다.
					deleteNode(targetIndex);
					countDelete++;
					targetIndex--;
				}
			}
			
			// 삭제한 게 없다면 false 리턴
			if(countDelete == 0)
				return false;
			
			
			return true;
			
			
			
	
		}
		
	
		
		
	
	public  int getNodeCount()
	{
		Node temp = head;
		int count = 1;
		
		if (head == null)
			return 0;
				
		while(null != temp.getNext())
		{
			temp = temp.getNext();
			count++;
		}
				
		return count;
	}
	
	
	
	
	
	
	
	
	public Node getLastNode()
	{
		Node lastNode = head;
		
		while(null != lastNode.getNext())
		{
			lastNode = lastNode.getNext();
			
		}
		
		return lastNode;
	}
	
	
	
	
	
	
	

	
	// 노드를 추가하는 함수.
	public void addNode(Node newNode)
	{
		Node lastNode = null;
		
		if (head == null)
		{
			head = newNode;
			
		}
		else
		{
			// 마지막노드를 찾고 그 위치에 새로운 노드를 저장한다.
			lastNode = getLastNode();		
			lastNode.setNext(newNode);		
			
		}
		
		
	}
	
	
	


	public boolean deleteNode(int index)
	{
		int count; 
		Node target = head; // 지울대상 노드
		Node before = null; // target의 이전노드
		
		count = getNodeCount();
		
		//	count = maxIndex + 1 
		//  index가 0~MaxIndex 범위가 아니라면 false 리턴
		if ((index >= count) || (index < 0))
			return false;
		
		
		// index 0이면 0번째 노드 제거
		if (index == 0)
		{
			head = head.getNext();
			
		}
		
		//목표 노드의 참조값 찾아 target 변수에 넣기
		//이전 노드의 참조값 찾아 before 변수에 넣기.
		for (int i = 0; i < index; i++)
		{
			before = target;
			target = target.getNext(); 
			
		}
		
		
		if (before == null)
		{
			return false;
						
		}
		else
		{	
			//타겟 노드 제거 하기
			before.setNext(target.getNext());
			
		}
		
		return true;
	
	}


}




