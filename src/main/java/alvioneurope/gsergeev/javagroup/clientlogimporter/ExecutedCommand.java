package alvioneurope.gsergeev.javagroup.clientlogimporter;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class ExecutedCommand {
    private String requestId;
    private Command command;
    private int timeout;
    private  int requestLength;
    private String operationId;
    private int responseLength;
    private int execTime;
    
    public ExecutedCommand(String executedCommand){
    	int commandId = 0;
    	String commandName = null;
    	command = new Command(commandId,commandName);
    	String splitExecutedCommand[] = executedCommand.split("  ");
    	for (int i=0; i<splitExecutedCommand.length; i++){
    		if (splitExecutedCommand[i].compareTo("RequestId")== 0) requestId = splitExecutedCommand[i+1].replaceAll("\"", "");
    		if (splitExecutedCommand[i].compareTo("commandId")== 0) command.setCommandId(Integer.parseInt(splitExecutedCommand[i+1]));
    		if (splitExecutedCommand[i].compareTo("commandName")== 0) command.setCommandName(splitExecutedCommand[i+1].replaceAll("\"", ""));
    		if (splitExecutedCommand[i].compareTo("timeout")== 0) timeout = Integer.parseInt(splitExecutedCommand[i+1]);
    		if (splitExecutedCommand[i].compareTo("requestLength")== 0) requestLength = Integer.parseInt(splitExecutedCommand[i+1]);
    		if (splitExecutedCommand[i].compareTo("operationId")== 0) operationId = splitExecutedCommand[i+1].replaceAll("\"", "");
    		if (splitExecutedCommand[i].compareTo("responseLength")== 0) responseLength = Integer.parseInt(splitExecutedCommand[i+1]);
    		if (splitExecutedCommand[i].compareTo("execTime")== 0) execTime = Integer.parseInt(splitExecutedCommand[i+1].replaceAll(" ", ""));
    	}
    }
    public String getRequestId(){
    	return requestId;
    }
    
    public Command getCommand(){
    	return command;
    }
    
    public int getTimeout(){
    	return timeout;
    }
    
    public int getRequestLength(){
    	return requestLength;
    }
    
    public String getOperationId(){
    	return operationId;
    }
    
    public int getResponseLength(){
    	return responseLength;
    }
    
    public int getExecTime(){
    	return execTime;
    }
    
    public void setCommand(Command command){
    	this.command = command;
    }
    
    public void setRequestId(String requestId){
    	this.requestId = requestId;
    }
    
    public void setTimeout(int timeOut){
    	this.timeout = timeOut;
    }
    
    public void setRequestLength(int requestLength){
    	this.requestLength = requestLength;
    }
    
    public void setOperationId(String operationId){
    	this.operationId = operationId;
    }
    
    public void setResponseLength(int responseLength){
    	this.responseLength = responseLength;
    }
    
    public void setExecTime(int execTime){
    	this.execTime = execTime;
    }
}
