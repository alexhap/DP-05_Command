/**
 * Created by alex on 23.06.2015.
 *
 */

public class CeilingFan {
    String name;
    int speed;

    public CeilingFan(String str) {
        name = str;
        speed = FanSpeedEnum.OFF.ordinal();
    }

    public void setSpeed(FanSpeedEnum sp) {
        speed = sp.ordinal();
        status();
    }
    public int getSpeed() { return speed; }
    public void status() { System.out.println(name + " Ceiling Fan is " + FanSpeedEnum.values()[speed] + (speed > 0 ? " flowing" : "")); }
}
