package day26_다운로드;

public class Main_다운로드 {
	
	
	
	

	
	
	
	
//	---------------------------------------------------------
	
	public static void main(String[] args) {
	
		
		//head가 null일 때 getLastNode 정상작동하는지 보기
		
		ListContainer list = new ListContainer();
		
		list.insertNode(new Node(1, "a") );
		list.insertNode(new Node(2, "ab") );
		list.insertNode(new Node(3, "abc") );
		list.insertNode(new Node(4, "abcd") );
		
		list.deleteNode(0);
		list.deleteNode(0);
		list.deleteNode(0);
		
		System.out.println(list.getNodeCount());
		
		System.out.println();list.toString();
		
		
	}

}
