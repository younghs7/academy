package day26_다운로드;

public class ListContainer {
	private Node head;
		
	
//	---------------------------------
	
	
//	원래 day22 링크드리스트 예제에서 달라진 점.
//	--파라미터 head 제거만 함.--------
	
	public int getNodeCount()
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
	
	
	
	
	
	
	
//	원래 day22 링크드리스트 예제에서 달라진 점.
//	--파라미터 head 제거만 함.------------
	
	public Node getLastNode()
	{
		Node lastNode = head;
		
		while(null != lastNode.getNext())
		{
			lastNode = lastNode.getNext();
			
		}
		
		return lastNode;
	}
	
	
	
	
	
	
	
	
	
//	원래 day22 링크드리스트 예제에서 달라진 점.
//	--1. 파라미터 head 제거 -------------------
//	--2. 삽입 ------------------------------ 
//	if (head == null)
//	{
//		head = newNode;
//		
//	}
	
	// 노드를 추가하는 함수.
	public void insertNode(Node newNode)
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
	
	
	
	
	
	
	
	
//	원래 day22 링크드리스트 예제에서 달라진 점.
//	1. 파라미터 head 제거 ------------------------
//	2. index <= 0 을 <0으로 변경
//	3. 삽입 ------------------------------------
//	if (index == 0)
//	{
//		head = head.getNext();	
//		return true;
//		
//	}

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
			return true;
			
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
