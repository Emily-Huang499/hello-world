public class Interface {
	public static void main(String[] args) {
	Income[] incomes = new Income[] { 
			new BaseIncome(3000), 
			new SalaryIncome(7500), 
			new RoyaltyIncome(10000)
			};
	System.out.println(totalTax(incomes));
	}
	public static double totalTax(Income...incomes) {
	double total = 0;
	for(Income income:incomes) {
		total = total + income.getTax();
	}
	return total;
	}
}
interface Income { 
	double getTax();
}
class BaseIncome implements Income {
	private double income;
	public BaseIncome(double income) {
		this.income = income;
	}
	@Override
	public double getTax() {
		return income * 0.1;
	}
}
class SalaryIncome implements Income {
	private double income;
	public SalaryIncome(double income){
		this.income = income;
	}
	@Override
	public double getTax() {
	if(income >= 5000) {
		return (income - 5000) * 0.2;
	}
	return 0;
	}
}
class RoyaltyIncome implements Income {
	private double income;
	public RoyaltyIncome(double income){
		this.income = income;
	}
	@Override
	public double getTax() {
		if (income >= 4000) {
			return income * 0.8 *0.2 * 0.7;
		}
		return (income - 800) *0.2 * 0.7;
	}
}