package by.rymtsov.command.impl;

import by.rymtsov.command.Command;
import by.rymtsov.command.model.Lamp;

public class LampOn implements Command {
    private final Lamp lamp;

    public LampOn(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }

    @Override
    public void undo() {
        lamp.turnOff();
    }
}
