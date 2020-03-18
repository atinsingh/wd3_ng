package co.pragra.wd2;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {
    static  int cnt = 0;
    @Test(dependsOnMethods = {"tc2"}, alwaysRun = true)
    public void tc1(){
        System.out.println( "LoginTest  ->  Test Case 1");
    }

    @Test(invocationCount = 5, successPercentage = 100)
    public void tc2(){
        cnt++;
        if(cnt==1 || cnt==4){
            Assert.fail();
        }
        System.out.println( "LoginTest  ->    Test Case 2");
    }

    @Test(expectedExceptions = {ArithmeticException.class})
    public void tc3(){
        System.out.println(10/0);
        System.out.println( "LoginTest  ->    Test Case 3");
    }



}
