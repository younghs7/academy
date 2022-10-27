package day22_링크드리스트_과제1_addNode구현;

public class Main_My {
	
	
	// 노드를 추가하는 함수.
	public static void addNode(Node head, Node newNode)
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
			addNode(head, new Node(i+1, null)); // Node(int ㅁ, String ㅁ)
		}
		
	
		
		
		

		
		
		
		
		
		
		
	}

}
