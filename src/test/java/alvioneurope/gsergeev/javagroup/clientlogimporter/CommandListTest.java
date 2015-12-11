package alvioneurope.gsergeev.javagroup.clientlogimporter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kintaro18 on 18.11.2015.
 */
public class CommandListTest {
    private CommandList testCommandList;
    private Command testCommand1;
    private Command testCommand2;
    private Command testCommand3;

    @Before
    public void setUp(){
        testCommandList = new CommandList();
        testCommand1 = new Command(1,"Command1");
        testCommand2 = new Command(2,"Command2");
        testCommand3 = new Command(3, "Command3");
    }

    @Test
    public void testAddCommand() throws Exception {
        assertEquals(0, testCommandList.getCommandList().size());
        testCommandList.addCommand(testCommand1);
        assertEquals(1, testCommandList.getCommandList().size());
        testCommandList.addCommand(testCommand2);
        assertEquals(2, testCommandList.getCommandList().size());
        testCommandList.addCommand(testCommand1);
        assertEquals(2, testCommandList.getCommandList().size());
    }

    @Test
    public void testFindCommandById() throws Exception {
        testCommandList.addCommand(testCommand1);
        testCommandList.addCommand(testCommand2);
        assertNull(testCommandList.findCommandById(testCommand3.getCommandId()));
        assertEquals(testCommand1, testCommandList.findCommandById(testCommand1.getCommandId()));
        assertEquals(testCommand2, testCommandList.findCommandById(testCommand2.getCommandId()));
    }
}