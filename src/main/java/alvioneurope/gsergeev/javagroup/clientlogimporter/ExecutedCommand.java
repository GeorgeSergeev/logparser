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

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
