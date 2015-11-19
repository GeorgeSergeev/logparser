package alvioneurope.gsergeev.javagroup.clientlogimporter;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class CommandList {
    private List <Command> commandList;

    public CommandList () {
        commandList = new ArrayList<Command>();
    }

    public List<Command> getCommandList(){
        return commandList;
    }

    public void addCommand (Command command) {
        if (findCommandById(command.getCommandId()) == null) {
            commandList.add(command);
        }
    }

    public Command findCommandById(int id) {
        Command foundCommand = null;
        for (Command command : commandList){
            if (command.getCommandId()==id) {
                foundCommand = command;
                break;
            }
        }
        return foundCommand;
    }
}
