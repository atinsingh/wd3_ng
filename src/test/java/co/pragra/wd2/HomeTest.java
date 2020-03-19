package co.pragra.wd2;

import org.testng.annotations.*;


public class HomeTest {

    @BeforeTest(groups = "regression")
    @Parameters({"browser"})

    public void setUp(String broswerName) {
        System.out.println(broswerName);
    }

    @Test(groups = {"smoke","regression"})
    @Parameters("abc")
    public void tc1(String abc){
        System.out.println( "Hometest -->   Test Case 1 "+ abc);
    }

    @Test(groups = {"smoke"})
    public void tc2(){
        System.out.println( "Hometest -->   Test Case 2");
    }

    @Test(groups = {"smoke","regression"})
    public void tc3(){
        System.out.println( "Hometest -->   Test Case 3");
    }
}
