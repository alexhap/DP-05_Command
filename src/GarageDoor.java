/**
 * Created by alex on 23.06.2015.
 *
 */

public class GarageDoor {
    boolean doorState;
    String name;

    public GarageDoor(String str) {
        name = str;
    }

    public void up() { doorState = true; status(); }
    public void down() { doorState = false; status(); }
    public void stop() { status(); }
    public void lightOn() { status(); }
    public void lightOff() { status(); }
    public void status() { System.out.println(name + " Garage Door is " + (doorState ? "Open" : "Closed")); }
}
