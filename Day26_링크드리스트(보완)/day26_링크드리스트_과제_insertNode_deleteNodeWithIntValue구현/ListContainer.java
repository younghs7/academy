package day26_링크드리스트_과제_insertNode_deleteNodeWithIntValue구현;


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
	
	
	
	/*
	문제1
	insertNode 2번째버전. 구현
	조건
	1. index가 0보다 작은경우 처리하지 않는다.
	2. insert index가 기존 카운트보다 크거나 같은 값인 경우 노드의 가장 뒤에 삽입한다.
	
	 */
	
		//수정판
		public boolean insertNode(int targetIndex, Node newNode)
		{	
			// 파라미터에 대한 처리 ----------------------------------
			//조건 1. index가 0보다 작은경우 처리하지 않는다.
			if(targetIndex < 0)
				return false;
			
			
			// ---------------------------------------------------
			//노드가 없는 경우
			if(head == null)
			{
				head = newNode;
				return true;
			}
			
			//노드가 있는 경우---------------------------------------------------
			
			final int NODE_COUNT = getNodeCount();         //리스트 갯수
			final int LAST_INDEX = NODE_COUNT-1;           //마지막 인덱스 위치
			
			//맨 앞 삽입
			if(0 == targetIndex)
			{	
				newNode.setNext(head.getNext());
				head = newNode;
				
				return true;
				
			}
			//중간 삽입 ( 1 <= targetIndex <= LAST_INDEX)
			else if( (1 <= targetIndex) && (targetIndex <= LAST_INDEX) )
			{
				Node targetNode = head;
				Node frontNode = head;
				
				//targetNode 찾기
				for(int i = 0; i < targetIndex; i++)
				{
					targetNode = targetNode.getNext();
				}
				
				//frontNode 찾기
				for(int i = 0; i < targetIndex-1; i++)
				{
					frontNode = frontNode.getNext();
				}
				
				frontNode.setNext(newNode);              //frontNode가 newNode를 가르키게 함.
				newNode.setNext(targetNode.getNext());   //newNode가 원래 기존 노드를 가르키게 함.
				
				return true;
			
			}
			//마지막에 삽입
			else if(targetIndex > LAST_INDEX)
			{
				//조건 2. insert index가 기존 카운트보다 크거나 같은 값인 경우 노드의 가장 뒤에 삽입한다.
				addNode(newNode);
				
				return true;
			}
			
			// 상정 외
			return false;
		}
			
			
		
		
		//추가 구현
		public void printList()
		{	
			System.out.println("현재 리스트 갯수: " + getNodeCount());
			
			Node tempNodePointer = head;   //현재 노드 참조값을 가르킴.
			
			int index = 0;
			//처음부터 마지막 전 노드까지 반복 출력한다.
			while(tempNodePointer.getNext() != null)
			{	
				//pointerNodeData를 참조해서 그 안에 있는 IntValue, StrValue 출력해.
				System.out.print("[index :" +index+"]");
				System.out.print(", [IntValue: " + tempNodePointer.getData().getIntValue()+"]");
				System.out.println(", [StrValue: " + tempNodePointer.getData().getStrValue()+"]");
				
				
				tempNodePointer = tempNodePointer.getNext();   //pointerNode가 다음 노드를 참조하도록 한다.
				index++;
			}
			
			//마지막 노드 정보 출력을 한다.
			if(tempNodePointer.getNext() == null)
			{
				//pointerNodeData를 참조해서 그 안에 있는 IntValue, StrValue 출력해.
				System.out.print("[index :" +index+"]");
				System.out.print(", [IntValue: " + tempNodePointer.getData().getIntValue()+"]");
				System.out.println(", [StrValue: " + tempNodePointer.getData().getStrValue()+"]");
			}
			
			
		}
		
		
		/*
		문제2
		deleteNodeByintValue(int intValue) 구현
		해당 데이터를 가진 노드를 삭제 
		
		 느낀 점 요약:
		1.while문과 for문을 선택할 때 먼저 반복횟수를 미리 알 수 있는 방법이 있나를 먼저 생각해보고 코드를 작성해라.
		2. 기존에 있는 변수로 주물덕거리기보다는 차라리 변수를 하나 더 추가해서 인간의 논리 흐름에 맞게 작성해라.
		 
		 */
		
		
		public boolean deleteNodeByintValue(int intValue)
		{
			
			//1 수정한 후 버젼
			
			//노드가 없는 경우 걸러줌.
			if(head == null)
			{
				return false;
			}
			
			//노드가 있는 경우
			Node targetNode = head;     
			int targetIndex = 0;          //검색, 삭제할 대상 인덱스
			int deleteCount = 0;
			final int NODE_COUNT = getNodeCount();
			// 노드 갯수 만큼 데이터 검색 반복
			for(int i = 0; i < NODE_COUNT; i++)
			{	
				boolean isDeleted = false;
				
				
				
				//해당 위치에 데이터가 일치한다면 삭제 (필요 요소: 해당 위치 인덱스)
				if(targetNode.getData().getIntValue() == intValue) // 해당 노드가 파라미터 intValue를 가졌다면
				{
					deleteNode(targetIndex);
					deleteCount++;
					isDeleted =true;
					
				}
				
				
				if(isDeleted == false)         // 삭제하지 않았으면 인덱스 증가 (삭제한 경우는 줄이 땡겨져서 인덱스 증가시킬 필요가 없음)
				{
					targetIndex++;
					
				}
				
				targetNode = targetNode.getNext();      // 다음 노드로 위치 이동
				
				
				
			}
			
			if(deleteCount == 0)                //삭제한 게 없다면
				return false;
			
			return true;
		
		
		
		
//		2. 수정 하기 전 버젼
//			Node targetNode;
//			int countDelete = 0;
//			int targetIndex = 0;
//			
//			
//
//			targetNode = head;
//			//처음 노드부터 마지막 노드 바로 전까지 반복
//			while(targetNode.getNext() != null)
//			{	
//				//타켓노드의 intValue 와 파라미터 intValue가 동일하다면
//				if(targetNode.getData().getIntValue() == intValue)
//				{
//					//해당 위치의 노드를 삭제한다.
//					deleteNode(targetIndex);
//					countDelete++;
//					targetIndex--;
//				}
//				
//				//다음 노드로 넘어감.
//				targetNode = targetNode.getNext();
//				targetIndex++;
//				
//			}
//			
//			// 마지막 노드 검색 및 삭제
//			if(targetNode.getNext() == null)
//			{	
//				//타켓노드 intValue 와 파라미터 intValue가 동일하다면
//				if(targetNode.getData().getIntValue() == intValue)
//				{
//					//해당 위치의 노드를 삭제한다.
//					deleteNode(targetIndex);
//					countDelete++;
//					targetIndex--;
//				}
//			}
//			
//			// 삭제한 게 없다면 false 리턴
//			if(countDelete == 0)
//				return false;
//			
//			
//			return true;
			
			
		}

			
			
		
	
		
		
	
	public  int getNodeCount()
	{
		// 노드가 없을 때
		if (head == null)
			return 0;
		
		// 노드가 한 개 이상 있을 때
		Node temp = head;
		int count = 1;
		
		//다음 노드가 있으면 반복
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
	
	
	


	public boolean deleteNode(int targetIndex)
	{
		
		if(null == head)         // 노드가 없다면
			return false;
		
		// 노드 한 개 이상인 경우만 남음.
		
		final int NODE_COUNT = getNodeCount();
		final int LAST_INDEX = NODE_COUNT -1;
		Node target = head;                // 지울대상 노드
		Node before = null;                // target의 이전노드
		
		if ((targetIndex > LAST_INDEX) || (targetIndex < 0))  //  0 <= targetindex <= LAST_INDEX 범위가 아니라면
			return false;
		
		// 0 <= targetindex <= LAST_INDEX 범위인 경우만 남음. 
		
		
		// targetIndex가 0이면 0번째 노드 제거
		if (targetIndex == 0)
		{
			head = head.getNext();
			
			return true;
		}
		
		
		// targetIndex가 1 이상인 경우
		
		//타겟 노드, 타겟 이전 노드 찾기
		target = head;
		before = null;
		for (int i = 0; i < targetIndex; i++)
		{
			before = target;                
			target = target.getNext();      
			
		}
	
			before.setNext(target.getNext());      //타겟 노드 제거 하기
			
		return true;
	
	}


}




