public class RemoteTester {

    public static void main(String[] args) {
        RemoteControlButton soundSensitiveLightStrip = new LEDLightStripSoundSensitiveRemote(new LEDLightStrip(1, 25));
        RemoteControlButton regularLightStrip = new LEDLightStripRainbowRemote(new LEDLightStrip(1, 25));
        RemoteControlButton lightBulb = new LEDLightBulbRemote(new LEDLightBulb(1, 10));

        System.out.println("Testing Light Sensitive LED Light Strip");
        soundSensitiveLightStrip.buttonOnePressed();
        soundSensitiveLightStrip.buttonTwoPressed();
        soundSensitiveLightStrip.buttonFivePressed();

        System.out.println("--------------------------------------");

        System.out.println("Testing Regular LED Light Strip");
        regularLightStrip.buttonOnePressed();
        regularLightStrip.buttonTwoPressed();
        regularLightStrip.buttonFivePressed();

        System.out.println("--------------------------------------");

        System.out.println("Testing Light Bulb");
        lightBulb.buttonOnePressed();
        lightBulb.buttonTwoPressed();
        lightBulb.buttonFivePressed();
    }

}
