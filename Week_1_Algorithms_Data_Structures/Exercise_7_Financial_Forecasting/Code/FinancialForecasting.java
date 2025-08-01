public class FinancialForecasting {

    public static double calculateFutureValueRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return calculateFutureValueRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 10000;       // starting amount
        double growthRate = 0.08;          // 8% annual growth
        int years = 5;                     // forecast for 5 years

        double futureValue = calculateFutureValueRecursive(initialValue, growthRate, years);
        System.out.printf("Predicted value after %d years: %.2f", years, futureValue);
    }
}
