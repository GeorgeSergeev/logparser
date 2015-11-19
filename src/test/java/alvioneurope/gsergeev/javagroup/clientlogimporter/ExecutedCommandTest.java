package alvioneurope.gsergeev.javagroup.clientlogimporter;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by kintaro18 on 19.11.2015.
 */
public class ExecutedCommandTest {
    private ExecutedCommand testExecutedCommand1;
    private ExecutedCommand testExecutedCommand2;
    private ExecutedCommand testExecutedCommand3;
    private ExecutedCommand testExecutedCommand4;

    @Before
    public void setUp(){
        testExecutedCommand1 = new ExecutedCommand("2015-11-10 11:37:33.495 Debug: CommandRunner::runCommand start  RequestId  \"19216805118520151110083733000000\"  commandId  67  commandName  \"UserAuthorization\"  timeout  -1  requestLength  400");
        testExecutedCommand2 = new ExecutedCommand("2015-11-10 11:37:41.044 Debug: CommandRunner::runCommand end  RequestId  \"19216805118520151110083740000004\"  commandId  560  commandName  \"OrgElementFlatGet\"  responseLength  359184  execTime  367 ");
        testExecutedCommand3 = new ExecutedCommand("2015-11-10 11:37:35.666 Debug: void UserCache::poolUser() ..\\mango_crm\\core\\usercache.cpp 12 Pool user list");
        testExecutedCommand4 = new ExecutedCommand("");
    }

    @Test
    public void testSplitString() throws Exception {
        assertTrue(testExecutedCommand1.getIsExecutedCommand());
        assertTrue(testExecutedCommand2.getIsExecutedCommand());
        assertFalse(testExecutedCommand3.getIsExecutedCommand());
        assertFalse(testExecutedCommand4.getIsExecutedCommand());
    }
}