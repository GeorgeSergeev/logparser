package alvioneurope.gsergeev.javagroup.clientlogimporter;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class Command {
    private int commandId;
    private String commandName;

    public Command(int commandId, String commandName) {
        this.commandId = commandId;
        this.commandName = commandName;
    }

    public int getCommandId() {
        return commandId;
    }

    public String getCommandName() {
        return commandName;
    }
}
