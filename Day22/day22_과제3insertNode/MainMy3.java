package day22_과제3insertNode;

public class MainMy3 {
	
	public static Node getLastNode(Node head)
	{
		Node lastNode = head;
		
		while(null != lastNode.getNext())
		{
			lastNode = lastNode.getNext();
			
		}
		
		return lastNode;
	}
	
	
	// 노드를 추가하는 함수.
	public static boolean InsertNode(Node head, int index, Node newNode)
	{
		if(index <= 0)
		{
			return false;
		}
		
		//리스트 갯수 가져와.
		int listCount = getNodeCount(head);
		
		//인덱스가 노드 갯수보다 크면 인덱스를 마지막 인덱스로 변경해.
		if(index > listCount)
		{
			index = listCount;
		}
		
		
		//타겟 인덱스 이전 노드 참조값을 찾는다.
		Node frontNode =  head;
		for(int i = 0; i < index - 1; i++)
		{
			frontNode = frontNode.getNext();
		}
		
		//이전 노드의 next 참조값을 새로 삽입하는 노드의 next 변수에 담는다.
		newNode.setNext( frontNode.getNext() );
		
		//이전 노드의 next변수에 새로 삽입하는 노드의 참조값으로 변경한다.
		frontNode.setNext(newNode);
		
		
		return true;
		
	}
	
	public static int getNodeCount(Node head)
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
	
	
	// index : 지울 대상의 인덱스
	public static boolean deleteNode(Node head, int index)
	{
		int count;
		Node target = head; // 지울대상 노드
		Node before = null; // target의 이전노드
		
		count = getNodeCount(head);
		
		if ((index >= count) || (index <= 0))
			return false;
		
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
			before.setNext(target.getNext());
			
		}
		
		return true;
	
	}
	
	
	
	public static void printList(Node head)
	{	
		//현재 노드 참조값을 담는 변수
		Node nodePointer = head;
		
		//nodePointer의 위치의 노드 Data객체 참조값을 담는 변수
		NodeData tempNodeData;
		
		
		//노드의 next가 null이 아니면 실행
		while(nodePointer.getNext() != null)
		{	
			
			//현재 노드의 데이터 참조값을 tempNodeData에 담아.
			tempNodeData = nodePointer.getData();
		
			//담은 tempNodeData를 참조해서 그 안에 있는 IntValue, StrValue 출력해.
			System.out.println(tempNodeData.getIntValue());
			System.out.println(tempNodeData.getStrValue());
			
			//nodePointer가 다음 노드를 참조하도록 한다.
			nodePointer = nodePointer.getNext();
		}
		
		
		//노드 next가 null일 때는 여기서 출력해.
		if(nodePointer.getNext() == null)
		{
			System.out.println( (nodePointer.getData()) .getIntValue() );
			
			System.out.println( (nodePointer.getData()) .getStrValue() );
			//임시변수 안 만들고 바로 뽑는 게 훨씬 가독성 좋네.
		}
		
		
		
		/*
		 아 무조건 주석부터 달고 시작해야겠다.
		 그냥 코드 먼저 시작하고 주석다니까. 엄청 나게 헷갈린다.
		 */
		
	}
	
	
	public static void main(String[] args) {
		
		// 0번 노드는 메인서 만든다.
		Node head = new Node(0, null);
		
		for (int i = 0; i < 10; i++)
		{
			InsertNode(head, i, new Node(i + 1, null));
		}
		
		InsertNode(head, 99, new Node(99, null) );
		
//		deleteNode(head, 1);
		
		printList(head);
		
		
		
	}

}
