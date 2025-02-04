package by.rymtsov.command.impl;

import by.rymtsov.command.Command;
import by.rymtsov.command.model.Lamp;

public class LampOff implements Command {
    private final Lamp lamp;

    public LampOff(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }

    @Override
    public void undo() {
        lamp.turnOn();
    }
}
