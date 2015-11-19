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
    private boolean isExecutedCommand;

    public ExecutedCommand(String executedCommand){
        if (splitString(executedCommand))
            isExecutedCommand = true;
        else isExecutedCommand = false;
    }

    public boolean splitString(String str){
        if (str.indexOf("runCommand") == -1) return false;
        else{
            int commandId = 0;
            String commandName = null;
            String splitStr[] = str.split("  ");
            for (int i=0; i<splitStr.length; i++){
                if (splitStr[i].compareTo("RequestId")== 0) requestId = splitStr[i+1].replaceAll("\"", "");
                if (splitStr[i].compareTo("commandId")== 0) commandId = (Integer.parseInt(splitStr[i+1]));
                if (splitStr[i].compareTo("commandName")== 0) commandName = (splitStr[i+1].replaceAll("\"", ""));
                if (splitStr[i].compareTo("timeout")== 0) timeout = Integer.parseInt(splitStr[i+1]);
                if (splitStr[i].compareTo("requestLength")== 0) requestLength = Integer.parseInt(splitStr[i+1]);
                if (splitStr[i].compareTo("operationId")== 0) operationId = splitStr[i+1].replaceAll("\"", "");
                if (splitStr[i].compareTo("responseLength")== 0) responseLength = Integer.parseInt(splitStr[i+1]);
                if (splitStr[i].compareTo("execTime")== 0) execTime = Integer.parseInt(splitStr[i+1].replaceAll(" ", ""));
            }
            if (commandId != 0 && commandName!= null)
                command = new Command(commandId,commandName);
            return true;
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

    public boolean getIsExecutedCommand() {
        return isExecutedCommand;
    }
}
