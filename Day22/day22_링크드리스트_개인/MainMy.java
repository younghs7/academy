package day22_링크드리스트_개인;

public class MainMy {
	
	
	// 노드를 추가하는 함수.
	public static void InsertNode(Node head, Node newNode)
	{	
		
		
		Node temp;
		temp = head;
		
		//1. 마지막 노드의 참조값을 찾는다.
		while(temp.getNext() != null)
		{
			{	
				temp = temp.getNext();
			}
		}

		//2. newNode를 마지막 노드의 next에 저장한다.
		temp.setNext(newNode);
		
	}

	public static void main(String[] args) {
		
		//0번 노드는 메인에서 만든다.
		Node head = new Node(0, null);
	
		for (int i = 0; i < 10; i++)
		{
			InsertNode(head, new Node(i+1, null));
		}
		
	
		
		
		

		
		
		
		
		
		
		
	}

}
