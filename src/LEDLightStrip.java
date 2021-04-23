public class LEDLightStrip extends LEDLightDevice {

    public LEDLightStrip(int colorModeState, int maxSetting) {
        this.colorModeState = colorModeState;
        this.maxSetting = maxSetting;
    }

    @Override
    public void buttonOnePressed() {
        System.out.println("Light Theme Value Decrease");
        colorModeState--;
    }

    @Override
    public void buttonTwoPressed() {
        System.out.println("Light Theme Value Increase");
        colorModeState++;
    }
}

