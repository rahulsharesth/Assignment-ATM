/**
 * 
 */
package test.bank.handler;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bank.atm.ATMDispenser;
import com.bank.constant.ChannelType;
import com.bank.constant.TransactionStatus;
import com.bank.handler.BankingHandler;

/**
 * @author RSharest
 * 
 */
@RunWith(Parameterized.class)
public class BankingHandlerTest {

	private BankingHandler handler;
	private TransactionStatus withdrawStatus;
	private TransactionStatus depositStatus;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays
				.asList(new Object[][] {
						{
								new BankingHandler(ChannelType.ATM, 123456789l,
										new BigDecimal(1000)),
								TransactionStatus.SUCCEED,
								TransactionStatus.SUCCEED },
						{
								new BankingHandler(ChannelType.ATM, 12345678l,
										new BigDecimal(2000)),
								TransactionStatus.SUCCEED,
								TransactionStatus.SUCCEED },
						{
								new BankingHandler(ChannelType.ATM, 12345678l,
										new BigDecimal(3000)),
								TransactionStatus.SUCCEED,
								TransactionStatus.SUCCEED },
						{
								new BankingHandler(ChannelType.ATM, 1234567l,
										new BigDecimal(4000)),
								TransactionStatus.FAILED,
								TransactionStatus.SUCCEED } });
	}

	public BankingHandlerTest(BankingHandler handler,
			TransactionStatus wStatus, TransactionStatus dStatus) {
		this.handler = handler;
		this.withdrawStatus = wStatus;
		this.depositStatus = dStatus;
		ATMDispenser.getInstance().setAmount(new BigDecimal(3000));
	}

	@Test
	public void testWithdrawRequest() {

		assertEquals(this.withdrawStatus, this.handler.withdrawRequest());
	}

	@Test
	public void testDepositRequest() {

		assertEquals(this.depositStatus, this.handler.depositRequest());
	}

}
