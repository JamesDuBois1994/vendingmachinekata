//  Created by James DuBois on 2/21/18.
//  Copyright © 2018 VendingMachineKata. All rights reserved.

package components;

public class ButtonHandler {

    private boolean wasChipButtonPressed = false;
    private boolean wasColaButtonPressed = false;
    private boolean wasCandyButtonPressed = false;
    private boolean wasReturnButtonPressed = false;

    private int soldOutButtonCounter = 0;

    public boolean wasChipButtonPressed() {
        return this.wasChipButtonPressed;
    }

    public void setWasChipButtonPressed(boolean wasChipButtonPressed) {
        this.wasChipButtonPressed = wasChipButtonPressed;
    }

    public boolean wasColaButtonPressed() {
        return this.wasColaButtonPressed;
    }

    public void setWasColaButtonPressed(boolean wasColaButtonPressed) {
        this.wasColaButtonPressed = wasColaButtonPressed;
    }

    public boolean wasCandyButtonPressed() {
        return this.wasCandyButtonPressed;
    }

    public void setWasCandyButtonPressed(boolean wasCandyButtonPressed) {
        this.wasCandyButtonPressed = wasCandyButtonPressed;
    }

    public boolean wasReturnButtonPressed() {
        return this.wasReturnButtonPressed;
    }

    public void setWasReturnButtonPressed(boolean wasReturnButtonPressed) {
        this.wasReturnButtonPressed = wasReturnButtonPressed;
    }

    public int getSoldOutButtonCounter() {
        return this.soldOutButtonCounter;
    }

    private void setSoldOutButtonCounter(int soldOutButtonCounter) {
        this.soldOutButtonCounter = soldOutButtonCounter;
    }

    public void incrementButtonCounter() {
        this.soldOutButtonCounter++;
    }

    public void resetButtonCounter() {
        this.setSoldOutButtonCounter(0);
    }
}
