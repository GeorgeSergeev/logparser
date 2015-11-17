package alvioneurope.gsergeev.javagroup.clientlogimporter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class ExecutedCommandList {
    private List<ExecutedCommand> executedCommandList;
    
    public List<ExecutedCommand> getExecutedCommandList(){
    	return executedCommandList;
    }
    
    public void setExecutedCommandList(List<ExecutedCommand> executedCommandList){
    	this.executedCommandList = executedCommandList;
    }
    
    public ExecutedCommandList() {
    	executedCommandList = new ArrayList<ExecutedCommand>();
    };
    
    public void addCommand (ExecutedCommand executedCommand) {
    	executedCommandList.add(executedCommand);
    };

    public ExecutedCommand findCommandByRequestId (String requestId) {
    	ExecutedCommand foundCommand = null;
    	for(Iterator<ExecutedCommand> iterator = executedCommandList.iterator(); iterator.hasNext();){
    		if (iterator.next().getRequestId().compareTo(requestId)==0) {
    			foundCommand = iterator.next();
    		}
    	}
		return foundCommand;
    };

}
