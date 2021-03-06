//  Created by James DuBois on 2/21/18.
//  Copyright © 2018 VendingMachineKata. All rights reserved.

package components;

import helpers.Helper;
import helpers.Constants;

public class DisplayHandler {

    private String stateMessage = Constants.INSERT_COIN;

    private ButtonHandler btnHandler;
    private MoneyHandler moneyHandler;

    public DisplayHandler(ButtonHandler btnHandler, MoneyHandler moneyHandler) {
        this.btnHandler = btnHandler;
        this.moneyHandler = moneyHandler;
    }

    public String getStateMessage() {
        if (this.btnHandler.wasChipButtonPressed()) {
            return this.stateMessage;
        } else if (this.btnHandler.wasColaButtonPressed()) {
            return this.stateMessage;
        } else if (this.btnHandler.wasCandyButtonPressed()) {
            return this.stateMessage;
        } else if (this.btnHandler.wasReturnButtonPressed()) {
            return this.stateMessage;
        } else if (this.moneyHandler.enoughMoneyInMachineForChange()) {
            this.setStateMessage(Constants.EXACT_CHANGE);
            return this.stateMessage;
        } else if (this.moneyHandler.getTotalAmountDeposited() > 0) {
            return Helper.convertDoubleToString(this.moneyHandler.getTotalAmountDeposited());
        }
        return this.stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public void displayItemPrice(double itemPrice) {
        this.setStateMessage(Constants.PRICE + Helper.convertDoubleToString(itemPrice));
    }

}
