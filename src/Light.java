/**
 * Created by alex on 23.06.2015.
 *
 */

public class Light {
    boolean state;
    String name;

    public Light(String str) {
        name = str;
    }

    public void on() { state = true; status(); }
    public void off() { state = false; status(); }
    public void status() { System.out.println(name + " Light is " + (state ? "On" : "Off")); }
}
