package pkgMain;

public class Car {
	private double totalPrice;
	private double downPayment;
	private int loanLength; // The length of the loan in months
	private double interestRate;

	public Car(double totalPrice, double downPayment, int loanLength, double interestRate) {
		super();
		this.totalPrice = totalPrice;
		this.downPayment = downPayment;
		this.loanLength = loanLength;
		this.interestRate = interestRate;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public int getLoanLength() {
		return loanLength;
	}

	public void setLoanLength(int loanLength) {
		this.loanLength = loanLength;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double monthlyPay() {

		return (interestRate * (totalPrice - downPayment) / 12)
				/ (1 - Math.pow(1 + interestRate / 12, loanLength * -1));
	}

	public double totalInterest() {
		
		return monthlyPay()*loanLength - (totalPrice - downPayment);
	}
}
