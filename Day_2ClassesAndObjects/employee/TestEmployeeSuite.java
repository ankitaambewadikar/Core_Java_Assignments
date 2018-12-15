/*
 * Test suite class implemeted so as all the test cases ie test classes can be tested at a time
 */

package employee;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//here we have written the test class want to be tested at once
@SuiteClasses({TestJUnitForName.class,TestJUnitAnnualBasicSalary.class,TestJUnitForAnnualGrossSalary.class,
				TestJUnitForEmployeeId.class,TestJUnitForAnnualTakeHome.class,TestJUnitForMonthlyBasic.class,
				TestJUnitForMonthlyGrossSalary.class,TestJUnitForMonthlyTakeHome.class,TestJUnitMonthlyDeductations.class})
public class TestEmployeeSuite {

}
