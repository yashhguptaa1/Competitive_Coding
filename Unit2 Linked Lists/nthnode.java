/*
Given a linked list, the task is to find the n'th node from the end.
It is needed to complete a method that takes two argument, head of linked list and an integer n.

Example:
Input:
2
9 2
1 2 3 4 5 6 7 8 9
4 5
10 5 100 5 1
 

Output:
8
-1
*/

import java.util.*;
import java.io.*;

class NthNode
{
    Scanner scan=new Scanner(System.in);
	
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}
	
	Node head; 
    
    //Func for printing LinkedList
	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	
	//Func for creating a LinkedList using array of int inputs
	public void createLL()
	{
	    int size_ar=scan.nextInt();
		int arr[]=new int[size_ar];
		
		for(int j=0;j<size_ar;j++)
		{
		    arr[j]=scan.nextInt();
		}
	    
	    head=new Node(arr[0]);
	    
	    Node prev_node=head;
	    
	    for (int i=1;i<arr.length;i++)
	    {
	       if(prev_node==null)
	       return;
	       
	       Node new_node=new Node(arr[i]);
	       new_node.next=prev_node.next;
	       prev_node.next=new_node;
		
           prev_node=prev_node.next;
	    }
	 
	}
	//Func to find nth node from last
	public int nthnode(Node start,int nth)
	{
	    Node temp=start;
	    Node req=start;
	    
	    //Move first ptr n nodes from start
	    for(int i=1;i<nth;i++)
	    {
	        temp=temp.next;
	        //if n is greater than size of LL
	        if(temp==null)
	        {
	            return -1;
	        }
	        
	    }
	    
	    //Traverse the whole LL
	    while(temp.next!=null)// Since temp was initilialized from start
	    {
	        //Since temp will move (length-n) times
            //the req ptr will reach (lenght-n)th node from beginning
            //or nth node from last
	        req=req.next;
	        temp=temp.next;
	    }
	    return req.data;
	 }
	public static void main(String[] args)
	{
		/* Start with the empty list */
		NthNode llist = new NthNode();
		
        //Give array size 
        //and array of numbers as input
		llist.createLL();
		System.out.println("\nCreated Linked list is: ");

		llist.printList();
		
		int nth_data=llist.nthnode(llist.head,6);
		
		System.out.println("Data in Nth node is "+nth_data);
		

    }
}

//TC :O(n)
//SC :O(1)
