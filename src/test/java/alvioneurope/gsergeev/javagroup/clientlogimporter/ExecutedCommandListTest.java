package alvioneurope.gsergeev.javagroup.clientlogimporter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kintaro18 on 23.11.2015.
 */
public class ExecutedCommandListTest {
    private ExecutedCommandList testExecutedCommandList;
    private ExecutedCommand testExecutedCommand1;
    private ExecutedCommand testExecutedCommand2;
    private ExecutedCommand testExecutedCommand3;

    @Before
    public void setUp() throws Exception {
        testExecutedCommandList = new ExecutedCommandList();
        testExecutedCommand1 = new ExecutedCommand();
        testExecutedCommand2 = new ExecutedCommand();
        testExecutedCommand3 = new ExecutedCommand();
        testExecutedCommand1.setRequestId("1");
        testExecutedCommand2.setRequestId("2");
        testExecutedCommand3.setRequestId("3");
    }

    @Test
    public void testAddCommand() throws Exception {
        assertEquals(0,testExecutedCommandList.getExecutedCommandList().size());
        testExecutedCommandList.addCommand(testExecutedCommand1);
        assertEquals(1,testExecutedCommandList.getExecutedCommandList().size());
        testExecutedCommandList.addCommand(testExecutedCommand2);
        assertEquals(2,testExecutedCommandList.getExecutedCommandList().size());
        testExecutedCommandList.addCommand(testExecutedCommand2);
        assertEquals(3,testExecutedCommandList.getExecutedCommandList().size());
    }

    @Test
    public void testFindCommandByRequestId() throws Exception {
        testExecutedCommandList.addCommand(testExecutedCommand1);
        testExecutedCommandList.addCommand(testExecutedCommand2);
        assertNull(testExecutedCommandList.findCommandByRequestId(testExecutedCommand3.getRequestId()));
        assertEquals(testExecutedCommand1, testExecutedCommandList.findCommandByRequestId(testExecutedCommand1.getRequestId()));
        assertEquals(testExecutedCommand2, testExecutedCommandList.findCommandByRequestId(testExecutedCommand2.getRequestId()));
    }
}