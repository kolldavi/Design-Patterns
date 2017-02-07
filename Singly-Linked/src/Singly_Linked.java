
public class Singly_Linked<T> {
	private int length = 0;
	Node<T> head;
	public Singly_Linked(){
		length = 0;
	}
	public synchronized Node<T> getHead(){
		return head;
	}
	
	public synchronized void insertAtBeginning(Node<T> node){
		if(head == null){
			
			head =node;
			return;
		}
		
		node.setNext(head);
		head = node;
		length++;
	}
	public synchronized void insertAtEnd(Node<T> node){
		if (head ==null){
			head =  node;
		}else{
			Node<T> p;
			p = head;
			while(p.getNext()!=null) 
				p=p.getNext();
			p.setNext(node);
			
		}
		length++;
	}
	
	
	public void insert(T data, int position){
		
		if(position < 0){
			position = 0;
	
		}
		if(position >length){
			position = length;
		}
		
		if (head ==null){
			head =  new Node<T>(data);
		}else if(position ==0){
			Node<T> temp = new Node<T>(data);
			temp.setNext(head);
			head = temp;
		}else{
			Node<T> temp = head;
			for(int i=1;i<position;i++){
				temp = temp.getNext();
			}
			Node<T> newNode = new Node<T>(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		length++;
	}
	
	public synchronized Node<T> removeFromBeginning(){
		Node<T> node  = head;
		if(head!=null){
			head = node.getNext();
			length--;
		}
		
		return node;
	}
	public synchronized Node<T> removeFromEnd(){
		
		if(head==null){
			
			return null;
		}
	     Node<T> temp = head;
	     Node<T> next = head.getNext();
	      while(next.getNext() != null) {
	          temp = next;
	          next = next.getNext();
	      }

	      temp.setNext( next.getNext());

		    length--;
	      return temp;
	}
	public synchronized void removeNode(Node<T> node){
		
		if(head == null){
			return;
		}
		if(node.equals(head)){
			head = head.getNext();
			 length--;
		}else{
			Node<T> temp = head.getNext(), p=head;
			
			while(temp!=null){
				
				if(node.equals(temp)){
					p.setNext(temp.getNext());
					 length--;
				}
				p= temp;
				temp = temp.getNext();
			}
			
		
		}
	}
	public void remove(int position){
		if(position < 0){
			position = 0;
		}
		
		if(position >= length){
			position = length-1;
		}
		if(head == null){
			return;
		}
		
		if(position ==0){
			head =  head.getNext();
		}else{
			Node<T> temp = head;
			for(int i=1;i<position;i++){
				temp = temp.getNext();
			}
			temp.setNext( temp.getNext().getNext());
		}
		length -=1;
	}
	
	public int getPos(T data){
		Node<T> temp = head;
		
		int pos =0;
		while(temp!=null){
			if(temp.getData()==data){
				return pos;
			}
			pos ++;
			temp = temp.getNext();
		}
		
		return Integer.MIN_VALUE;
	}
	public String toString(){
		String result ="[";
		if(head==null){
			return result + "]";
		}else{
			result += head.getData();
			Node<T> temp = head.getNext();
			
			while(temp!=null){
				result += "," + temp.getData();
				temp = temp.getNext();
			}
		}
		
		return result + "]";
	}
	
	


public static void main(String[] args) {
	Singly_Linked<Integer> linkedList = new Singly_Linked<Integer>(); // creation of Linked List

	
	for(int i=0;i< 10; i++){
		Node<Integer> n = new Node<Integer>(i);
		linkedList.insertAtEnd(n);
	}




//	linkedList.removeFromEnd();

	Node<Integer> n4 = new Node<Integer>(4);
	linkedList.insertAtBeginning(n4);
	linkedList.insert(130, 7);

		System.out.println(linkedList.getHead().getData());
		System.out.println(linkedList.length);
		System.out.println(linkedList.toString());
		linkedList.removeNode(n4);
		linkedList.remove(1);
		linkedList.getPos(5);
	//	linkedList.remove(9);
		System.out.println(linkedList.length);
		System.out.println(linkedList.toString());

}
}
