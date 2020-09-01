package firstc;

public class EnumSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekday day = Weekday.FRI;
		switch(day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("Today is " + day + ". Work at office!");
			break;
		case SAT:
		case SUN:
			System.out.println("Today is " + day + ". Work at home!");
			break;
			default:
				throw new RuntimeException("cannot process " + day);
		}
	}

}
enum Weekday {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}
