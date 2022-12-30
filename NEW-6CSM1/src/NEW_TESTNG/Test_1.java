package NEW_TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_1 extends SupportingAnnotations1 {
  @Test (groups = "smoke")
  public void userReg() {
	  Reporter.log("user Registered",true);
  }
  
  @Test (groups = "ft")
  public void userLogin() {
	  Reporter.log("user Login",true);
  }
  
  @Test(groups = "reg")
  public void userdeleted() {
	  Reporter.log("user deleted",true);
  }
  
  @Test (groups = "smoke")
  public void CustReg() {
	  Reporter.log("Cust Registered",true);
  }
  
  @Test (groups = "ft")
  public void CustLogin() {
	  Reporter.log("Cust Login",true);
  }
  
  @Test(groups = "reg")
  public void CustDeleted() {
	  Reporter.log("Cust Deleted",true);
  }
}
