public class Time{
    public static void main(String[] args) {
        int hour = 1;
        int minute = 17;
        int second = 20;
        int secSinceMidnight = 3600 * hour + 60 * minute + second;
        System.out.println("\nCurrent Time: 0" + hour + ":" + minute + ":" + second);
        System.out.println("Seconds since midnight: " + secSinceMidnight);
        int secRemainingInDay = 24 * 3600 - secSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secRemainingInDay);
        double dayPassedPercentage = (secSinceMidnight + 0.0) / (secRemainingInDay + 0.0);
        System.out.printf("Percentage of day passed: %.2f", dayPassedPercentage * 100);
        System.out.println(" %");
    }
}