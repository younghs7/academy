package day22_링크드리스트_개인DeleteNote구현;

public class MainMy2 {
	
	public static Node getLastNode(Node head)
	{
		Node lastNode = head;
		
		while( null != lastNode.getNext())
		{
			lastNode = lastNode.getNext();
		}
		
		return lastNode;
	}
	
	
	
	// 노드를 추가하는 함수.
	public static void InsertNode(Node head, Node newNode)
	{	
		Node lastNode = null;
		//1. 마지막 노드 참조값을 찾는다.
		lastNode = getLastNode(head);

		//2. 마지막 노드의 next에 새로운 노드 참조값을 저장한다.
		lastNode.setNext(newNode);
		
	}
	
	// index: 지울 대상의 인덱스
	public static void DeleteNode(Node head, int index)
	{
		//1. 타겟 노드와 전 노드의 참조값을 찾는다.
		Node targetNode = head;
		Node frontNode = head;
		
		
		//타겟 노드의 참조값을 찾는다.
		for(int i = 0; i < index; i++)
		{	
			targetNode = targetNode.getNext();
		}
		
		//전 노드의 참조값을 찾는다.
		for(int i = 0; i < index - 1; i++)
		{	
			frontNode = frontNode.getNext();
		}
		
		
		//2. 타겟 노드의 pointer를 전 노드에 대입한다.
		frontNode.setNext(targetNode.getNext());
		
		
	}
	
//	public static void printList(Node head)
//	{
//		Node nodePointer = head;
//		NodeData getedDate;
//		while(nodePointer.getNext() != null)
//		{
//			getedDate = nodePointer.getData();
//			
//			
//		}
//	}
	


	public static void main(String[] args) {
		
		//0번 노드는 메인에서 만든다.
		Node head = new Node(0, null);
		
		
		for (int i = 0; i < 10; i++)
		{
			InsertNode(head, new Node(i+1, null));
		}
		
		DeleteNode(head, 2);
		
		System.out.println("d");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
