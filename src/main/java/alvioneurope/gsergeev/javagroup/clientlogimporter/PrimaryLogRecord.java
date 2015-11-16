package alvioneurope.gsergeev.javagroup.clientlogimporter;

import java.util.Date;


/**
 * Created by GSergeev on 11/16/2015.
 */
public class PrimaryLogRecord {
    private Date recordDateTime;
    private LogLevel logLevel;
    private MethodInfo methodInfo;
    private String information;
    private AssociationType associationType;
    private Object association;

    public PrimaryLogRecord(String sourceString) {

    }

}
