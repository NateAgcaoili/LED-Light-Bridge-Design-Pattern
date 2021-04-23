public abstract class RemoteControlButton {
    private LEDLightDevice lightDevice;

    public RemoteControlButton(LEDLightDevice lightDevice) {
        this.lightDevice = lightDevice;
    }

    public void buttonOnePressed() {
        lightDevice.buttonThreePressed();
    }

    public void buttonTwoPressed() {
        lightDevice.buttonTwoPressed();
    }

    public void lightFeedback() {
        lightDevice.lightFeedback();
    }

    public abstract void buttonFivePressed();
}
