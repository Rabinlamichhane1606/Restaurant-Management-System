package project1;
import java.util.Scanner;
import java.awt.Rectangle;
import javax.swing.JFrame;
public class Main {
public static void main(String args[])
{
	JFrame window=new JFrame();
	window.setSize(640,580);
	window.setTitle("RESTAURANT MANAGEMENT SYSTEM");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);
	drawingComponents dc=new drawingComponents();
	window.add(dc);
	System.out.println("1.Customer"
			+ "2.Employee"
			+ "3.Manager");
	System.out.println("Enter your choice:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch( a)
	{
	case 1:
	{
		Customer c1=new Customer();
		System.out.println("Enter your Name:");
		String c=sc.next();
		c1.setName(c);
		System.out.println("Enter your Address:");
		String ad=sc.next();
		c1.setAddress(ad);
		System.out.println("Enter your Choice:+");
	}
	}
}
}
