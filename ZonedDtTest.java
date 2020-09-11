package eighth;

import java.time.*;

public class ZonedDtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime departureAtBeijing = LocalDateTime.of(2020, 9, 11, 20, 0, 0);
        int hours = 20;
        int minutes = 10;
        LocalDateTime arrivalAtNewYork = calculateArrivalAtNY(departureAtBeijing, hours, minutes);
        System.out.println(departureAtBeijing + " -> " + arrivalAtNewYork);
        
        if (!LocalDateTime.of(2020, 10, 11, 20, 10, 0).equals(calculateArrivalAtNY(LocalDateTime.of(2019, 10, 15, 13, 0, 0), 13, 20))) {
            System.err.println("测试失败!");
        } 
        else if (!LocalDateTime.of(2020, 11, 11, 20, 10, 0).equals(calculateArrivalAtNY(LocalDateTime.of(2019, 11, 15, 13, 0, 0), 13, 20))) {
            System.err.println("测试失败!");
        }
    }

    static LocalDateTime calculateArrivalAtNY(LocalDateTime bj, int h, int m) {
        return bj;
    }
}
