package day22_수업;

public class Tmain {
	
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
	public static void InsertNode(Node head, Node newNode)
	{
		Node lastNode = null;		
		//1. 마지막노드를 찾는다.
		lastNode = getLastNode(head);		
		
		//2. 마지막노드의 next에 새로운노드를 저장한다.
		lastNode.setNext(newNode);		
		
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
	
	
	
	public static void main(String[] args) {
		
		// 0번 노드는 메인서 만든다.
		Node head = new Node(0, null);
		
		for (int i = 0; i < 10; i++)
		{
			InsertNode(head, new Node(i + 1, null));
		}

		deleteNode(head, 1);
		
		
	}

}
