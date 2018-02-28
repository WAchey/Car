package pkgMain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		Car myCar = new Car(35000, 0, 60, .1);
		
		assertEquals(9618.79, Math.round(myCar.totalInterest() * 100.0) / 100.0); 
		
		myCar.setDownPayment(100);
		assertEquals(100, myCar.getDownPayment());
		
		myCar.setInterestRate(.2);
		assertEquals(.2, myCar.getInterestRate());
		
		myCar.setLoanLength(80);
		assertEquals(80, myCar.getLoanLength());
		
		myCar.setTotalPrice(40100);
		assertEquals(40100, myCar.getTotalPrice());
		
		assertEquals(908.9, Math.round(myCar.monthlyPay() * 100.0) / 100.0);
	}

}
