import static org.junit.Assert.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.junit.Before;
import org.junit.Test;

import main.Account;

public class AccountTest 
{
	private Account account;

	@Test
	public void testAccount() throws Exception
	{
		
	}

	@Before
	public void setup() {
		account = new Account(10000);
	}
	
	@Test
	public void testGetBalance() throws Exception 
	{		
		assertEquals(10000, account.getBalance());
			
		account = new Account(1000);
		assertEquals(1000, account.getBalance());
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
		
	}
	
	@Test
	public void testDeposit() throws Exception 
	{
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}
	
	@Test
	public void testWithdraw() throws Exception 
	{
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}
	
}
