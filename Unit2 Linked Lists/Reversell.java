// A complete working Java program to demonstrate all insertion methods
// on linked list
import java.util.*;
import java.io.*;
class LinkedList
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Inserts a new node after the given prev_node. */
	public void insertAfter(Node prev_node, int new_data)
	{
		/* 1. Check if the given Node is null */
		if (prev_node == null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}

		/* 2 & 3: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 4. Make next of new Node as next of prev_node */
		new_node.next = prev_node.next;

		/* 5. make next of prev_node as new_node */
		prev_node.next = new_node;
	}
	
	/* Appends a new node at the end. This method is 
	defined inside LinkedList class shown above */
	public void append(int new_data)
	{
		/* 1. Allocate the Node &
		2. Put in the data
		3. Set next as null */
		Node new_node = new Node(new_data);

		/* 4. If the Linked List is empty, then make the
			new node as head */
		if (head == null)
		{
			head = new Node(new_data);
			return;
		}

		/* 4. This new node is going to be the last node, so
			make next of it as null */
		new_node.next = null;

		/* 5. Else traverse till the last node */
		Node last = head; 
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;
		return;
	}

	/* This function prints contents of linked list starting from
		the given node */
	public void printList(Node node)
	{
		while (node != null)
		{
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public Node reversell(Node start)
	{
	    //BASE 
	    //Empty list
	    if(start==null)
	        return null;
	        
	 Node first=start;
	 Node rest =first.next;
    
	  //BASE CASE for recursion
	  /* List has only one node */
	   if (first.next==null)
	    return first;
	  
     Node reverseRest = reversell(rest);

    first.next.next=first;
    first.next=null;
    
    return reverseRest;
}

	/* Driver program to test above functions. Ideally this function
	should be in a separate user class. It is kept here to keep
	code compact */
	public static void main(String[] args)
	{
		/* Start with the empty list */
		LinkedList llist = new LinkedList();
		
		Scanner sc=new Scanner(System.in);
		int result=1;

    while(result>0)
    {
        result=sc.nextInt();
        
        if(result>0)
            llist.append(result);
    }
        llist.push(7);
        llist.push(1);
        llist.append(4);
        llist.insertAfter(llist.head.next, 8);
    
    	System.out.println("Given Linked list");
        llist.printList(llist.head);
        Node beg= llist.reversell(llist.head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        llist.printList(beg);
	}
}
// This code is contributed by Rajat Mishra
