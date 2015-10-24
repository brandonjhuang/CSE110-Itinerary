import java.util.*;
public class Runner{
	public static void main(String[] args){
		Event myEvent = new Event(new Date(0),new Date(10), "First");
		Event otherEvent = new Event(new Date(16),new Date(20), "Second");
		Event yetAnotherEvent = new Event(new Date(31),new Date(40), "third");
		
		Calendar myCalendar = new Calendar();
		myCalendar.insert(myEvent);
		myCalendar.insert(otherEvent);
		myCalendar.insert(yetAnotherEvent);
		myCalendar.sort();
		myCalendar.print();
		Event filler = myCalendar.findTime(5, new Date(90000000), "Insertion One");
		if(filler == null)
			System.out.println("welp");
		else	myCalendar.insert(filler);
		myCalendar.sort();
		myCalendar.print();




		filler = myCalendar.findTime(10, new Date(910000000), "Insertion Two");
		if(filler == null)
			System.out.println("welp");
		else myCalendar.insert(filler);
		myCalendar.sort();
		myCalendar.print();

		
		filler = myCalendar.findTime(40, new Date(910000000), "Insertion Three");
		if(filler == null)
			System.out.println("welp");
		else myCalendar.insert(filler);
		myCalendar.sort();
		myCalendar.print();







		//myEvent = new Event(new Date(40),new Date(60), "First");
		//otherEvent = new Event(new Date(0),new Date(5), "Second");
		//System.out.println("Unit Test");
		//for(int i = 0; i< 50; i++){
		//	System.out.print(5*i +","+(5*(i+1))+": ");
		//	otherEvent = new Event(new Date(5*i),new Date(5*(i+1)), "Second");
		//	if(myEvent.intersects(otherEvent))System.out.println("Intersects");
		//	else System.out.println("Does Not intersect");
		//}

		
	}
}
