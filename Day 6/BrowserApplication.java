package collection_framework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

class Browser{
	Stack <String> history=new Stack<>();
	void visit(String url) {
		history.push(url);
	}
	void back() {
		if(history.isEmpty()) {
			System.out.println("History is empty");
			return;
		}else {
			history.pop();
		}
	}
	String getCurrentPage() {
		if(history.isEmpty()) {
			System.out.println("History is empty");
			return null;
		}
			return history.peek();
	}
	void showAllHistory() {
		if(history.isEmpty()) {
			System.out.println("History is empty");
			return ;
		}else{
//			for(String s:history) {
//				System.out.println(s);
//			}
			ListIterator<String> it=history.listIterator(history.size());
			while(it.hasPrevious()) {
				System.out.println(it.previous());   
			}
//			for(String s:history) {
//				System.out.println(s);
//			}
		}
	}
}

public class BrowserApplication {

	public static void main(String[] args) {
		Browser obj=new Browser();
		obj.visit("home page");
		obj.visit("google page");
		obj.visit("gmail page");
		obj.showAllHistory();
		obj.back();
		obj.getCurrentPage();
		System.out.println("Current Page: " + obj.getCurrentPage()); 
		obj.showAllHistory();
	}
}
