package day26_과제;

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
		
		list.addNode(new Node(1, "a") );
		list.addNode(new Node(2, "ab") );
		list.addNode(new Node(3, "abc") );
		list.addNode(new Node(4, "abcd") );
		
		list.insertNode(9, new Node(5, "abcd"));
		list.insertNode(9, new Node(6, "abcde"));
		list.insertNode(9, new Node(7, "abcdef"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		list.insertNode(9, new Node(10, "abcdefg"));
		
//		System.out.println(list.toString());
		
//		list.deleteNodeByintValue(10);
		
		
		list.printList();
		
		
	}

}
