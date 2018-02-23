public class VendingMachine {

    private final int ONE_GRAM = 1;
    private final int ONE_MILLIMETER = 1;
    private final int TWO_GRAMS = 2;
    private final int TWO_MILLIMETERS = 2;
    private final int THREE_GRAMS = 3;
    private final int THREE_MILLIMETERS = 3;

    double coinValue = 0;
    double totalAmountDeposited = 0;
    double coinReturnAmount;


    public String getStateMessage() {
        return "INSERT COIN";
    }

    public double determineCoinValueBasedOnWeightAndSizeByDiameter(int weight, int diameter) {
        if (weight == ONE_GRAM && diameter == ONE_MILLIMETER) {
            coinValue = 0.25;
            incrementTotalAmountDepositedByCoinValue();
            return  coinValue;
        }
        else if (weight == TWO_GRAMS && diameter == TWO_MILLIMETERS) {
            coinValue = 0.10;
            incrementTotalAmountDepositedByCoinValue();
            return coinValue;
        }
        else if (weight == THREE_GRAMS && diameter == THREE_MILLIMETERS) {
            coinValue = 0.05;
            incrementTotalAmountDepositedByCoinValue();
            return coinValue;
        }
        else
            coinValue = .01;
            coinReturnAmount += coinValue;
            return coinValue;

    }

    private void incrementTotalAmountDepositedByCoinValue() {
        totalAmountDeposited += coinValue;
    }

    public double getCoinReturnAmount() {
        return this.coinReturnAmount;
    }

    public double getTotalAmountDeposited() {
        return this.totalAmountDeposited;
    }
}
