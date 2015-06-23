/**
 * Created by alex on 23.06.2015.
 *
 */

public class Light {
    boolean state;

    public void on() { state = true; status(); }
    public void off() { state = false; status(); }
    public void status() { System.out.println("Light is " + (state ? "on" : "off")); }
}
