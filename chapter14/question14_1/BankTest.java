package question14_1;

import static org.junit.Assert.*;

import org.junit.Test;


public class BankTest {
	// (1) 正常系：「ミヤビ」をセットできるか
	@Test public void setName() {
		Bank b = new Bank();
		b.setName("ミヤビ");
	}
	// (2) 異常系:nullをセットしようとしたら例外が起きるべき
	@Test public void setNameWithNull() {
		try {
			Bank b = new Bank();
			b.setName(null);
		} catch(NullPointerException e) {
			return;
		}
		fail();
	}
	// (3) 異常系：2文字をセットしようとしたら例外が起きるべき
	@Test(expected = IllegalArgumentException.class) public void throwsExceptionWithTwoCharName() {
		Bank b = new Bank();
		b.setName("ミヤ");
	}
}
