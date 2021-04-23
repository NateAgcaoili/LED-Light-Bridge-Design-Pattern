public class LEDLightBulb extends LEDLightDevice {

    public LEDLightBulb(int colorModeState, int maxSetting) {
        this.colorModeState = colorModeState;
        this.maxSetting = maxSetting;
    }

    @Override
    public void buttonOnePressed() {
        System.out.println("Light Color Value Decrease");
        colorModeState--;
    }

    @Override
    public void buttonTwoPressed() {
        System.out.println("Light Color Value Increase");
        colorModeState++;
    }
}

