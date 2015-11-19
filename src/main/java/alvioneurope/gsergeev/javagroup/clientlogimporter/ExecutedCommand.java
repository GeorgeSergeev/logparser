package alvioneurope.gsergeev.javagroup.clientlogimporter;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class ExecutedCommand {
    private String requestId;
    private Command command;
    private int timeout;
    private int requestLength;
    private String operationId;
    private int responseLength;
    private int execTime;

    public ExecutedCommand(String parse)
    {
    	String[] parseArray = parse.split("  ");
    	this.requestLength = 0;
    	this.responseLength = 0;
    	this.timeout = 0;
    	this.execTime = 0;
    	for (int i=0; i<parseArray.length-1; i++)
    	{
    		if (parseArray[i].compareTo("requestId") == 0)
    			this.requestId = parseArray[i+1];
    		else if (parseArray[i].compareTo("commandId") == 0)
    			this.command = new Command(Integer.parseInt(parseArray[i+1]),parseArray[i+3]);
    		else if (parseArray[i].compareTo("timeout") == 0)
    			this.timeout = Integer.parseInt(parseArray[i+1]);
    		else if (parseArray[i].compareTo("requestLength") == 0)
    			this.requestLength = Integer.parseInt(parseArray[i+1]);
    		else if (parseArray[i].compareTo("responseLength") == 0)
    			this.responseLength = Integer.parseInt(parseArray[i+1]);
    		else if (parseArray[i].compareTo("requestLength") == 0)
    			this.operationId = parseArray[i+1];
    		else if (parseArray[i].compareTo("execTime") == 0)
    			this.execTime = Integer.parseInt(parseArray[i+1]);
    		
    	}  	
    }
	public String getRequestId() {
		return requestId;
	}
	public Command getCommand() {
		return command;
	}
	public int getTimeout() {
		return timeout;
	}
	public int getRequestLength() {
		return requestLength;
	}
	public String getOperationId() {
		return operationId;
	}
	public int getResponseLength() {
		return responseLength;
	}
	public int getExecTime() {
		return execTime;
	}
    
}
