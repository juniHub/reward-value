public class RewardValue {
    private double cashValue;
    private int milesValue;

    public static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_RATE);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method that returns the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method that returns how many miles the RewardValue is worth
    public int getMilesValue() {
        return milesValue;
    }
}
