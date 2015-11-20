package alvioneurope.gsergeev.javagroup.clientlogimporter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kintaro18 on 19.11.2015.
 */
public class ExecutedCommandTest {
    private ExecutedCommand testExecutedCommand1;
    private ExecutedCommand testExecutedCommand2;
    private ExecutedCommand testExecutedCommand3;
    private ExecutedCommand testExecutedCommand4;
    private ExecutedCommand testExecutedCommand5;
    private ExecutedCommand testExecutedCommand6;

    @Before
    public void setUp(){
        testExecutedCommand1 = new ExecutedCommand("2015-11-10 11:37:35.666 Debug: void UserCache::poolUser() ..\\mango_crm\\core\\usercache.cpp 12 Pool user list");
        testExecutedCommand2 = new ExecutedCommand("2015-11-10 11:37:33.495 Debug: CommandRunner::runCommand start  RequestId  \"19216805118520151110083733000000\"  commandId  67  commandName  \"UserAuthorization\"  timeout  -1  requestLength  400");
        testExecutedCommand3 = new ExecutedCommand("2015-11-10 11:37:41.044 Debug: CommandRunner::runCommand end  RequestId  \"19216805118520151110083740000004\"  commandId");
        testExecutedCommand4 = new ExecutedCommand("2015-11-10 11:37:41.044 Debug: CommandRunner::runCommand end  RequestId  \"19216805118520151110083740000004\"  commandId  abcde  commandName  \"OrgElementFlatGet\"");
        testExecutedCommand5 = new ExecutedCommand("2015-11-10 11:37:33.495 Debug: CommandRunner::runCommand end  RequestId  \"19216805118520151110083733000000\"  commandId  67  commandName  \"UserAuthorization\"  timeout  -1  responseLength  asfasf  execTime - ");
        testExecutedCommand6 = new ExecutedCommand("This is an executedCommand");
    }

    @Test
    public void testSplitString() throws Exception {
        assertFalse(testExecutedCommand1.isExecutedCommand());
        assertTrue(testExecutedCommand2.isExecutedCommand());
        assertTrue(testExecutedCommand3.isExecutedCommand());
        assertTrue(testExecutedCommand4.isExecutedCommand());
        assertTrue(testExecutedCommand5.isExecutedCommand());
        assertFalse(testExecutedCommand6.isExecutedCommand());
    }
}