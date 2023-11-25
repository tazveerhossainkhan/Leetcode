package Math;

public class AngleBetweenHands_of_a_Clock {
    public static void main(String[] args) {
        System.out.println(angleClock(3, 15));
    }

    static double angleClock(int hour, int minutes) {
        double per_hr_degree = 360.0 / 12; // 30 deg
        double per_min_degree = 360.0 / 60; // 6 deg
        double deg1 = (hour % 12) * per_hr_degree + (per_hr_degree * minutes) / 60;
        double deg2 = per_min_degree * minutes;
        double angle = Math.abs(deg1 - deg2);

        return Math.min(angle, 360 - angle);
    }
}
