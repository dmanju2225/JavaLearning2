package Linkedlist;

public class LinkedList
{
	private ListNode head;
	private ListNode tail;
	private int size;
	LinkedList()
	{
		this.size = 0;
		this.head = this.tail = null;
	}
	void insertAtHead(int d)
	{
		ListNode newNode = new ListNode(d);
		if(head == null)
		{
			head = tail = newNode;
		}
		/*
		 * make this newNode head
		 */
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	void insertAtTail(int d)
	{
		ListNode newNode = new ListNode(d);
		if(head == null)
		{
			head = tail = newNode;
		}
		/*
		 * make this newNode head
		 */
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	
	

}
