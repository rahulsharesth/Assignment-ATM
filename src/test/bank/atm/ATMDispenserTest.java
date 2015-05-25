package test.bank.atm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bank.atm.ATMDispenser;
import com.bank.exception.InsufficientFundsException;

@RunWith(Parameterized.class)
public class ATMDispenserTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ true, new BigDecimal(1000), new BigDecimal(500) },
				{ true, new BigDecimal(5000), new BigDecimal(2000) },
				{ true, new BigDecimal(3000), new BigDecimal(3000) } });
	}

	private BigDecimal atmAmt;
	private BigDecimal reqAmt;
	private Boolean fCheck;

	public ATMDispenserTest(Boolean fCheck, BigDecimal atmAmt, BigDecimal reqAmt) {
		this.atmAmt = atmAmt;
		this.reqAmt = reqAmt;
		this.fCheck = fCheck;
		ATMDispenser.getInstance().setAmount(atmAmt);
	}

	@Test
	public void testCheckAvailability() {
		assertEquals(fCheck,
				ATMDispenser.getInstance().checkAvailability(reqAmt));
	}

	public void testDispense() {
		try {
			ATMDispenser.getInstance().dispense(reqAmt);
		} catch (InsufficientFundsException e) {
			fail(" testDispense failed - Can not dispense " + e.getAmount());
			e.printStackTrace();
		}
	}

	@Test
	public void testDispenseRollback() {

		testDispense();
		BigDecimal currentAtmAmt = this.atmAmt;
		ATMDispenser.getInstance().dispenseRollback(reqAmt);

		assertEquals(atmAmt, currentAtmAmt);
	}

}
