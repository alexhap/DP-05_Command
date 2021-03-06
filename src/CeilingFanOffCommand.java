/**
 * Created by alex on 23.06.2015.
 *
 */

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
        prevSpeed = FanSpeedEnum.OFF.ordinal();
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.setSpeed(FanSpeedEnum.OFF);
    }

    @Override
    public void undo() {
        ceilingFan.setSpeed(FanSpeedEnum.values()[prevSpeed]);
    }
}
