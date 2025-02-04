package by.rymtsov.command;

import by.rymtsov.command.impl.*;
import by.rymtsov.command.model.Conditioner;
import by.rymtsov.command.model.Invoker;
import by.rymtsov.command.model.Lamp;
import by.rymtsov.command.model.TV;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        TV tv = new TV();
        Conditioner conditioner = new Conditioner();

        Command lampOn = new LampOn(lamp);
        Command lampOff = new LampOff(lamp);
        Command tvOn = new TVOn(tv);
        Command tvOff = new TVOff(tv);
        Command conditionerOn = new ConditionerOn(conditioner);
        Command conditionerOff = new ConditionerOff(conditioner);

        Invoker invoker = new Invoker();

        invoker.setCommand(lampOn);
        invoker.executeCommand();
        invoker.undoCommand();

        invoker.setCommand(tvOn);
        invoker.executeCommand();
        invoker.undoCommand();

        invoker.setCommand(conditionerOn);
        invoker.executeCommand();
        invoker.undoCommand();
    }
}
