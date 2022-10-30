package day26_링크드리스트_과제_insertNode_deleteNodeWithIntValue구현;

public class Main_과제_my {
	
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
	

	
//	---------------------------------------------------------
	
	public static void main(String[] args) {
	
		
		

		
		//head가 null일 때 getLastNode 정상작동하는지 보기
		
		ListContainer list = new ListContainer();
		
		ListContainer list2 = new ListContainer();
		
		boolean bResult = false; 	
	
		System.out.println(list);
		
		System.out.println(""
				
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(2, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		+list.insertNode(99, new Node(1, null))
		
		
		);
		
		bResult = list.insertNode(99, new Node(1, null));
		bResult = list.insertNode(99, new Node(1, null));
		bResult = list.insertNode(99, new Node(1, null));
		bResult = list.insertNode(99, new Node(1, null));
		bResult = list.insertNode(99, new Node(1, null));
		
		
		
	
//		System.out.println(list.toString());
		
		bResult = list.deleteNodeByintValue(10);
		
		
		list.printList();
		
		
		
		
	}

}
