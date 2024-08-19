package grouptest;

import org.testng.annotations.Test;

public class grpTest1 {
  @Test(groups ="sanity")
  public void demo1() {
	  System.out.println("Demo 1");
  }
  
  @Test(groups ="sanity")
  public void demo2() {
	  System.out.println("Demo 2");
  }
  
  @Test(groups ="sanity")
  public void demo3() {
	  System.out.println("Demo 3");
  }
  
  @Test(groups ="smoke")
  public void demo4() {
	  System.out.println("Demo 4");
  }
  
  @Test(groups ="smoke", dependsOnGroups="sanity")
  public void demo5() {
	  System.out.println("Demo 5");
  }
}
