package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface IQueue{
	public void enQueue(String data); //넣기
	public String deQueue(); //빼기
	public void printAll(); //출력
}


public class MyListQueue extends MyLinkedList implements IQueue{

	MyListNode front;
	MyListNode rear;

	public MyListQueue() {
		front = null;
		rear = null;

	}
	
	@Override
	public void enQueue(String data) {

		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");


	}

	@Override
	public String deQueue() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData(); //가져오기
		front = front.next;
		if( front == null ){  // 마지막 항목
			rear = null;
		}
		return data;

	}

	@Override
	public void printAll() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		MyListNode temp = front;
		while(temp!= null){
			System.out.print(temp.getData() + ",");
			temp = temp.next;
		}
		System.out.println();

	}
	
}
