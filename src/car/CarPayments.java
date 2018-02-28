package car;

public class CarPayments {
	double carCost;
	double downPayment;
	double loanLength;
	double interestRate;
	
	public CarPayments(double a,double b,double c,double d) {
		carCost = a;
		downPayment = b;
		loanLength = c;
		interestRate = d;
	}
	
	public double monthlyPayment() {
		double initial = carCost - downPayment;
		double top = interestRate / 12.0 * initial;
		double bottom = 1.0 - Math.pow((1.0 + interestRate/12.0), (-1.0 * loanLength)); 
		return top / bottom;
	}
	
	public double totalInterest()
	{
		return monthlyPayment() * loanLength - (carCost - downPayment);
	}
	
	
	
}
