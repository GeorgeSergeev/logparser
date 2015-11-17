package alvioneurope.gsergeev.javagroup.clientlogimporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class CommandList {
    private List <Command> commandList;
    public List<Command> getCommandList(){
    	return commandList;
    }
    
    public void setCommandList(List<Command> commandList){
    	this.commandList = commandList;
    }
    
    public CommandList () {
    	commandList = new ArrayList<Command>();
    }
    
    public void addCommand (Command command) {
    	commandList.add(command);
    }

    public Command findCommandById(int id) {
    	Command foundCommand = null;
    	for (Command command : commandList){
    		if (command.getCommandId()==id)
    	        foundCommand = command;
    	}
    	return foundCommand;
    }
}
