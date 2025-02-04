package by.rymtsov.command.impl;

import by.rymtsov.command.Command;
import by.rymtsov.command.model.Conditioner;

public class ConditionerOn implements Command {
    private final Conditioner conditioner;

    public ConditionerOn(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public void execute() {
        conditioner.turnOn();
    }

    @Override
    public void undo() {
        conditioner.turnOff();
    }
}
