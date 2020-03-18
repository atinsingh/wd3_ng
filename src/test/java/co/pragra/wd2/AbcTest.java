package co.pragra.wd2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AbcTest {
    @Test(groups = "sanity")
    public void tcx(){
        System.out.println("SANITY ONE");
    }
    @Test(groups = "sanity")
    public void tcy(){
        System.out.println("SANITY TWO");
    }

    @Test(priority = 2)
    public void tc1(){
        System.out.println("TC1");
    }
    @Test(priority = 1)
    public void tc2(){
        System.out.println("TC2");
    }
}
