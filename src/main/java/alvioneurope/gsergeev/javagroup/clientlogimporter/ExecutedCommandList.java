package alvioneurope.gsergeev.javagroup.clientlogimporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class ExecutedCommandList {

    private List<ExecutedCommand> executedCommandList;

    public ExecutedCommandList() {
        executedCommandList = new ArrayList<ExecutedCommand>();
    }

    public List<ExecutedCommand> getExecutedCommandList() {
        return executedCommandList;
    }

    public void addCommand (ExecutedCommand executedCommand) {
        executedCommandList.add(executedCommand);
    }

    public ExecutedCommand findCommandByRequestId (String requestId) {
        ExecutedCommand foundExecutedCommand = null;
        for (ExecutedCommand executedCommand: executedCommandList) {
            if (executedCommand.getRequestId().compareTo(requestId)==0){
                foundExecutedCommand = executedCommand;
                break;
            }
        }
        return foundExecutedCommand;
    }

}
