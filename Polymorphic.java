public class Polymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Income[] incomes = new Income[] {
				new Income(3000),
				new SalaryIncome(7500),
				new RoyaltyIncome(10000)
		};
		System.out.println(totalTax(incomes));
	}
	
	public static double totalTax(Income... incomes) {
		double total = 0;
		for(Income income:incomes) {
			total = total + income.getTax();
		}
		return total;
	}
}
class Income{
	protected double income;
	
	public Income(double income) {
		this.income=income;
	}
	public double getTax() {
		return income * 0.1;
	}
}
class SalaryIncome extends Income{
	public SalaryIncome(double income) {
		super(income);
	}
	@Override
	public double getTax() {
		if(income >= 5000) {
			return (income - 5000) * 0.2;
		}
		return 0;
	}
}
class RoyaltyIncome extends Income{
	public RoyaltyIncome(double income) {
		super(income);
	}
	@Override
	public double getTax() {
		if(income >= 4000) {
			return income * 0.8 * 0.2 * 0.7;
		}
		return (income - 800) * 0.2 * 0.7;
	}
}