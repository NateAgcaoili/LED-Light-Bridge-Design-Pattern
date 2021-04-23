public class LEDLightBulbRemote extends RemoteControlButton {

    public LEDLightBulbRemote(LEDLightDevice lightDevice) {
        super(lightDevice);
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Strobe Mode Activated");
    }
}
