import java.io.*;
import java.util.*;

public class LinkedListLab_6th {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		ListItem item = new ListItem("hell", null);
		//System.out.println(item.data);
		ListItem head = new ListItem("hell", null);
		String fileName = "file.txt", data="hell";
		int pos=getPosFromUser(in);
		show(head);
		boolean b = writeToFile(head, fileName);
		System.out.println("Statement that file was saved successfully is: \u001b[33m\u001b[7m" + b + "\u001b[0m");
		head = delete(head, pos);
		head = add( head, data);
		head = insert(head, data, pos);
		int count = count(head);
		head = readFromFile(head, fileName);
	}

	private static int getPosFromUser(Scanner in) {
		System.out.println("\u001b[33m\u001b[7mEnter a pos number(where you want to place/read data to/from): \u001b[0m");
		return in.nextInt();
	}

	private static ListItem readFromFile(ListItem head, String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int count(ListItem head) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static ListItem insert(ListItem head, String data, int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	private static ListItem add(ListItem head, String data) {
		// TODO Auto-generated method stub
		return null;
	}

	private static ListItem delete(ListItem head, int pos) {
		if (pos==0 || head==null) return deleteFirst(head);
		head.next = delete(head.next, pos-=1);
		return head;
	}
	
	private static ListItem deleteFirst(ListItem head) {
		if (head!=null) return head.next;
		return null;
	}
	
	private static ListItem deleteLast(ListItem head) {
		if (head==null||head.next==null) return null;
		head.next = deleteLast(head.next);
		return head;
	}


	private static boolean writeToFile(ListItem head, String fileName) {
		try {
            PrintWriter file = new PrintWriter(new FileWriter(fileName));            
    		while (head != null) {
    			file.println(head.data);
    			head = head.next;
    		}
    		file.close();
            return true;
        }
        catch (IOException e) {
            return false;
        }
	}

	private static void show(ListItem head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
	
}

class ListItem{
	String data;
	ListItem next;
	ListItem(String data, ListItem next){
		this.data = data;
		this.next = next;
	}
}
