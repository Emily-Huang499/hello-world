package firstc;

public class EnumOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekday day = Weekday.FRI;
		if (day.dayValue == 6 || day.dayValue == 0) {
			System.out.println("Today is" + day + ". Work at home!");
		}
		else {
			System.out.println("Today is " + day + ". Work at office!");
		}
	}
}
enum Weekday{
	MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");
	
	public final int dayValue;
	private final String Chinese;
	
	private Weekday(int dayValue, String Chinese) {
		this.dayValue = dayValue;
		this.Chinese = Chinese;
	}
	
	@Override
	public String toString() {
		return this.Chinese;
	}
}