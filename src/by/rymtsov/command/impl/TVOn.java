package by.rymtsov.command.impl;

import by.rymtsov.command.Command;
import by.rymtsov.command.model.TV;

public class TVOn implements Command {
    private final TV tv;

    public TVOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}
