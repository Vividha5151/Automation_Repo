package assignment_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class list_to_queue {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "B", "C"); 
		  
	        Queue<String> Queue = new LinkedList<>(list); 
	  
	        System.out.print("Queue elements: "); 
	  
	        while (!Queue.isEmpty()) { 
	            System.out.print(Queue.poll()+", "); 
	        } 
	    } 
	} 

	
