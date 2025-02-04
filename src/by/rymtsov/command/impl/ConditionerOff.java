package by.rymtsov.command.impl;

import by.rymtsov.command.Command;
import by.rymtsov.command.model.Conditioner;

public class ConditionerOff implements Command {
    private final Conditioner conditioner;

    public ConditionerOff(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public void execute() {
        conditioner.turnOff();
    }

    @Override
    public void undo() {
        conditioner.turnOn();
    }
}
