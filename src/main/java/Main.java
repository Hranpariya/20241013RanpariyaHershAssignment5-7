public class Main {
    public static void main(String[] args) {
        double currentTuition = 10000;
        double annualIncrease = 1.05;
        for (int year = 1; year <= 10; year++) {
            currentTuition *= annualIncrease;
        }
        double tuitionInTenYears = currentTuition;
        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            totalCost += currentTuition;
            currentTuition *= annualIncrease;
        }
        System.out.printf("Tuition in 10 years: $%.2f%n", tuitionInTenYears);
        System.out.printf("Total cost for four years after 10 years: $%.2f%n", totalCost);
    }
}