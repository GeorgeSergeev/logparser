package alvioneurope.gsergeev.javagroup.clientlogimporter;

import java.util.*;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class CommandList {
    private List<Command> commandList;

    public CommandList() {
        commandList = new ArrayList<Command>();
    }

    public List<Command> getCommandList(){
        return commandList;
    }

    public void addCommand (Command command) {
        if (findCommandById(command.getCommandId()) == null)
            commandList.add(command);
    }

    public Command findCommandById(int id) {
        Command commandForSearch = new Command(id,"");
        try {
            return commandList.get(commandList.indexOf(commandForSearch));
        }
        catch (ArrayIndexOutOfBoundsException e){
            return null;
        }
    }
}