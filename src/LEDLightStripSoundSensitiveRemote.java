public class LEDLightStripSoundSensitiveRemote extends RemoteControlButton {

    public LEDLightStripSoundSensitiveRemote(LEDLightDevice lightDevice) {
        super(lightDevice);
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Sound Sensitivity Mode Activated");
    }
}
