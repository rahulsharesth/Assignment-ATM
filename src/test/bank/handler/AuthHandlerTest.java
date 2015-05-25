package test.bank.handler;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bank.constant.AuthenticationStatus;
import com.bank.constant.ChannelType;
import com.bank.handler.auth.AccountAuthHandler;
import com.bank.handler.auth.AuthHandler;
import com.bank.handler.auth.CardAuthHandler;

@RunWith(Parameterized.class)
public class AuthHandlerTest {

	private AuthHandler authHandler;
	private AuthenticationStatus authStatus;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ new AccountAuthHandler(ChannelType.ATM, 123456789l, 1234),
						AuthenticationStatus.SUCCESSFULL },
				{ new AccountAuthHandler(ChannelType.ATM, 12345678l, 2345),
						AuthenticationStatus.SUCCESSFULL },
				{ new CardAuthHandler(ChannelType.ATM, 12345678l, 3456),
						AuthenticationStatus.SUCCESSFULL },
				{ new CardAuthHandler(ChannelType.ATM, 1234567l, 4567),
						AuthenticationStatus.SUCCESSFULL } });
	}

	public AuthHandlerTest(AuthHandler authHandler, AuthenticationStatus status) {
		this.authStatus = status;
		this.authHandler = authHandler;
	}

	@Test
	public void testAuthenticateCustomer() {
		assertEquals(this.authStatus, authHandler.authenticateCustomer());
	}
}
