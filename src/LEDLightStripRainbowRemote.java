public class LEDLightStripRainbowRemote extends RemoteControlButton{

    public LEDLightStripRainbowRemote(LEDLightDevice lightDevice) {
        super(lightDevice);
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Rainbow Mode Activated");
    }
}
