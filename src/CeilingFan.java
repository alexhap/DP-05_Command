/**
 * Created by alex on 23.06.2015.
 *
 */

public class CeilingFan {
    boolean state;
    String name;

    public CeilingFan(String str) {
        name = str;
    }

    public void on() { state = true; status(); }
    public void off() { state = false; status(); }
    public void status() { System.out.println(name + " Ceiling Fan is " + (state ? "On" : "Off")); }
}
