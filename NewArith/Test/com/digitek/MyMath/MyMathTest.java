package com.digitek.MyMath;
import org.junit.Assert;
import org.junit.Test;

//import com.digitek.Mymath.MathOperatorsNew;

public class MyMathTest {
	@Test 
	public  void MyMathTest_test (){
		MathOperatorsNew mo = new MathOperatorsNew ();
		int  actualResult = mo.addNumbers(10,20);
		Assert.assertEquals(30,actualResult);



}
	

}
