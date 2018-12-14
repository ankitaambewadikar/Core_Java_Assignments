package employee;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestJUnitForName.class,TestJUnitAnnualBasicSalary.class,TestJUnitForAnnualGrossSalary.class,
				TestJUnitForEmployeeId.class,TestJUnitForAnnualTakeHome.class,TestJUnitForMonthlyBasic.class,
				TestJUnitForMonthlyGrossSalary.class,TestJUnitForMonthlyTakeHome.class,TestJUnitMonthlyDeductations.class})
public class TestEmployeeSuite {

}
