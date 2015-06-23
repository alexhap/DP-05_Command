/**
 * Created by alex on 23.06.2015.
 *
 */

public class CeilingFanMediumCommand implements Command {

    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
        prevSpeed = FanSpeedEnum.OFF.ordinal();
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.setSpeed(FanSpeedEnum.MEDIUM);
    }

    @Override
    public void undo() {
        ceilingFan.setSpeed(FanSpeedEnum.values()[prevSpeed]);
    }
}
