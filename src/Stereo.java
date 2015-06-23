/**
 * Created by alex on 23.06.2015.
 *
 */

public class Stereo {
    boolean state;
    boolean cdIn;
    int volume;
    String name;

    public Stereo(String str) {
        state = false;
        cdIn = false;
        volume = 0;
        name = str;
    }

    public void on() { state = true; status(); }
    public void off() { state = false; status(); }
    public void setCD() { cdIn = true; status(); }
    public void ejectCD() { cdIn = false; status(); }
    public void setVolume(int vol) { volume = vol; status(); }

    public void status() { System.out.println(name + " Stereo System is " + (state ? "On" : "Off")
            + "\t CD is " + (cdIn ? "" : "not ") + "loaded"
            + "\t Volume is at level " + volume); }
}
