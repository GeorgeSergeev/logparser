package alvioneurope.gsergeev.javagroup.clientlogimporter;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class Command {
    private int commandId;
    private String commandName;

    public int getCommandId(){
    	return commandId;
    }
    
    public String getCommandName(){
    	return commandName;
    }
    
    public void setCommandId(int commandId){
    	this.commandId = commandId;
    }
    
    public void setCommandName(String commandName){
    	this.commandName = commandName;
    }

    public Command (int commandId, String commandName) {
    	this.commandId = commandId;
    	this.commandName = commandName;
    }
}
