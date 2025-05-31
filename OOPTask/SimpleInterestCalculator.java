package Lesson5Task.OOPTask;

class SimpleInterestCalculator {
    private int principalAmount;
    private int durationYears;
    private double annualInterestRate;

    public void setPrincipalAmount(int principal) {
        this.principalAmount = principal;
    }

    public void setDurationYears(int years) {
        this.durationYears = years;
    }

    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    public int getPrincipalAmount() {
        return principalAmount;
    }

    public int getDurationYears() {
        return durationYears;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        calculator.setPrincipalAmount(1000);
        calculator.setDurationYears(2);
        calculator.setAnnualInterestRate(5.5);

        System.out.println("Principal Amount: " + calculator.getPrincipalAmount());
        System.out.println("Duration (years): " + calculator.getDurationYears());
        System.out.println("Interest Rate (%): " + calculator.getAnnualInterestRate());
    }
}
