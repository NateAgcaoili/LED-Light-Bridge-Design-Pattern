abstract class LEDLightDevice {
    public int colorModeState;
    public int maxSetting;
    public int brightnessLevel = 0;

    public abstract void buttonOnePressed();
    public abstract void buttonTwoPressed();

    public void lightFeedback() {
        if(colorModeState > maxSetting || colorModeState < 0) colorModeState = 0;
        System.out.println("On Color Mode State " + colorModeState);
    }

    public void buttonThreePressed() {
        brightnessLevel++;
        System.out.println("Brightness level: " + brightnessLevel);
    }

    public void buttonFourPressed() {
        brightnessLevel--;
        System.out.println("Brightness level: " + brightnessLevel);
    }
}

