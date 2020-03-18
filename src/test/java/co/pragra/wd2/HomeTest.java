package co.pragra.wd2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class HomeTest {


    @Test(groups = {"smoke","regression"} ,dependsOnGroups = "sanity")
    public void tc1(){
        System.out.println( "Hometest -->   Test Case 1");
    }

    @Test(groups = {"smoke"})
    public void tc2(){
        System.out.println( "Hometest -->   Test Case 2");
    }

    @Test(groups = {"smoke","regression"}, dependsOnGroups = "sanity")
    public void tc3(){
        System.out.println( "Hometest -->   Test Case 3");
    }
}
