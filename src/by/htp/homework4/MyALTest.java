package by.htp.homework4;

public class MyALTest {

	public static void main(String[] args) {
		MyAL x = new MyAL(20);
		MyAL y = new MyAL();
		x.fillWithInt();
		x.printmyAL();
		System.out.println("Print size of MyAL: " + x.myALsize());
		System.out.println("Print is it empty for x: " + x.myALEmpty());
		System.out.println("Print is it empty for y:" + y.myALEmpty());
		System.out.println("Print index of 20: "+x.myALindexOF(20));
		System.out.println("Print is it contain 20: "+x.myALContains(20));
		System.out.println("Print index of 20: "+x.myALlastIndexOF(20));
		System.out.println("Print get of 5: "+x.myALget(20));
		x.myALset(10, 5);
		System.out.println("Set 5 in index 10");
		x.printmyAL();
		x.myALadd(100);
		System.out.println("Add 100");
		x.printmyAL();
		x.myALadd(5, 100);
		System.out.println("Add 100 in index 5");
		x.printmyAL();
		x.myALremoveByIndex(5);
		System.out.println("Remobe by insex 5 from previos myAL");
		x.printmyAL();
		System.out.println("Remove by value 20");
		x.myALremoveByValue(20);
		x.printmyAL();
		System.out.println("Clear myAL");
		x.myALclear();
		x.printmyAL();
		x.setLength(20);
		x.fillWithInt();
		System.out.println("I fill myAL for further tests");
		x.printmyAL();
		System.out.println("Remove all elements with range from 3 to 6");
		x.myALremoveRange(3, 6);
		x.printmyAL();
		x.sortALAscend();
		System.out.println("Sort ascend");
		x.printmyAL();
		System.out.println("Sort descend");
		x.sortALDescend();
		x.printmyAL();
		System.out.println("Swap myAL");
		x.swapmyAL();
		x.printmyAL();
		System.out.println("Return odd residual: "+ x.returnOddResidual());
		System.out.println("Return odd number: "+x.oddNumber());
		System.out.println("Return even number: "+x.evenNumber());
		System.out.println("Return even max "+x.evenMax()+" Return even min "+x.evenMin());
		System.out.println("Return odd max "+x.oddMax()+" Return odd min "+x.oddMin());
		x.printmyAL();
		x.myALremoveByDevisible(3);
		System.out.println("myAL with remuved elements divisible by 3");
		x.printmyAL();
		
	}

}
