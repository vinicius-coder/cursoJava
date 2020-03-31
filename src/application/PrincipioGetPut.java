package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipioGetPut {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		copy(myDoubles, myObjs);
		
		System.out.println(myObjs);

	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {

		for (Number number : source) {
			destiny.add(number);
		}

	}

}
