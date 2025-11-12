class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;
}
}
class SingleList{
Node head=null;
void insertAtEnd(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
			head=newnode;
		else{
			Node temp;
			for(temp=head;temp.next!=null;temp=temp.next);
			temp.next=newnode;
		}
}
void display(){
			Node temp;
			for(temp=head;temp!=null;temp=temp.next)
			System.out.print(temp.data+"-->");


	}
public static void main(String args[]){
SingleList sl=new SingleList();
sl.insertAtEnd(10);
sl.insertAtEnd(20);
sl.insertAtEnd(30);
sl.display();
}
}
