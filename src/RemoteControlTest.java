/**
 * Created by alex on 23.06.2015.
 *
 */

public class RemoteControlTest {

    public static void main(String args[]) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        GarageDoor garageDoor = new GarageDoor("");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.puttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.puttonWasPressed();
    }
}
