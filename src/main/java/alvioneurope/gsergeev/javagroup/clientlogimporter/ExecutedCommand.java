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
    private boolean executedCommand;

    public ExecutedCommand(String executedCommand){
        this.executedCommand = splitString(executedCommand);
    }

    public boolean isStringInteger(String string) {
        return string!=null && string.matches("^-?\\d+$");
    }

    public boolean splitString(String str){
        if (!str.contains("runCommand")) return false;
        else{
            int commandId = 0;
            String commandName = null;
            String splitStr[] = str.split("  ");
            for (int i=0; i<splitStr.length; i++){
                if (splitStr.length > (i+1) && splitStr[i].compareTo("RequestId")== 0) requestId = splitStr[i+1].replaceAll("\"", "");
                if (splitStr.length > (i+1) && splitStr[i].compareTo("commandId")== 0 && isStringInteger(splitStr[i+1])) commandId = (Integer.parseInt(splitStr[i+1]));
                if (splitStr.length > (i+1) && splitStr[i].compareTo("commandName")== 0) commandName = (splitStr[i+1].replaceAll("\"", ""));
                if (splitStr.length > (i+1) && splitStr[i].compareTo("timeout")== 0 && isStringInteger(splitStr[i+1])) timeout = Integer.parseInt(splitStr[i+1]);
                if (splitStr.length > (i+1) && splitStr[i].compareTo("requestLength")== 0 && isStringInteger(splitStr[i+1])) requestLength = Integer.parseInt(splitStr[i+1]);
                if (splitStr.length > (i+1) && splitStr[i].compareTo("operationId")== 0) operationId = splitStr[i+1].replaceAll("\"", "");
                if (splitStr.length > (i+1) && splitStr[i].compareTo("responseLength")== 0 && isStringInteger(splitStr[i+1])) responseLength = Integer.parseInt(splitStr[i+1]);
                if (splitStr.length > (i+1) && splitStr[i].compareTo("execTime")== 0 && isStringInteger(splitStr[i+1])) execTime = Integer.parseInt(splitStr[i+1].replaceAll(" ", ""));
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

    public boolean isExecutedCommand() {
        return executedCommand;
    }
}
