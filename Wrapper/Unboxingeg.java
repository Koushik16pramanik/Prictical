package Wrapper;
 import java.util.ArrayList;
 
public class Unboxingeg {
	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<Integer>();
		// autoboxing
		a1.add(5);
		a1.add(2);
		System.out.println("ArreyList: "+a1);
		// unboxing
		int a= a1.get(0);   // 5 Integer convert to int 
		System.out.println("Value of index 0: "+a);
		}}