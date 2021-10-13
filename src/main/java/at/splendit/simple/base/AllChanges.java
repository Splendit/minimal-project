package at.splendit.simple.base;

import java.util.ArrayList;
import java.util.List;

public class AllChanges {

	// Code Formatter
	public int a( int i ) { i *= 2; return i; }

	// Arithmetic Assignment
	public int arithmeticAssignment(int i) {
		i = i + 3;
		return i;
	}
	
	// DiamondOperator
	public List<String> sampleGenericReturnTypeMethod() {
		List<String> stringList = new ArrayList<String>();
		return stringList;
	}

	// Lambda to Method Reference
	public void lambdaRule(List<String> stringList) {
		stringList.forEach(x -> x.toString());
	}
}
