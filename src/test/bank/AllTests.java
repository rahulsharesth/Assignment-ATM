package test.bank;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.bank.atm.ATMDispenserTest;
import test.bank.handler.AuthHandlerTest;
import test.bank.handler.BankingHandlerTest;

@RunWith(Suite.class)
@SuiteClasses({ ATMDispenserTest.class, AuthHandlerTest.class,
		BankingHandlerTest.class })
public class AllTests {

	
	System.out.println("   sds");
}
