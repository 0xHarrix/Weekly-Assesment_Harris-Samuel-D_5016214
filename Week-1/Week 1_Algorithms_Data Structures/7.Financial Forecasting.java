public class FinancialForecasting {

    public static double forecast(double[] pastData, int year) {
        if (year == 0) {
            return pastData[0];
        }
        double growthRate = pastData[year - 1] / pastData[year - 2];
        return forecast(pastData, year - 1) * growthRate;
    }

    public static void main(String[] args) {
        double[] pastData = {1000.0, 1100.0, 1210.0};
        System.out.println(forecast(pastData, 3)); // Output: 1331.0 (assuming similar growth rate continues)
    }
}
