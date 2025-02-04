package by.rymtsov.command.impl;

import by.rymtsov.command.Command;
import by.rymtsov.command.model.TV;

public class TVOff implements Command {
    private final TV tv;

    public TVOff(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}
