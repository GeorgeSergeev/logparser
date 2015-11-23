package alvioneurope.gsergeev.javagroup.clientlogimporter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kintaro18 on 18.11.2015.
 */
public class CommandMapTest {
    private CommandMap testCommandMap;
    private Command testCommand1;
    private Command testCommand2;
    private Command testCommand3;

    @Before
    public void setUp(){
        testCommandMap = new CommandMap();
        testCommand1 = new Command(1,"Command1");
        testCommand2 = new Command(2,"Command2");
        testCommand3 = new Command(3, "Command3");
    }

    @Test
    public void testAddCommand() throws Exception {
        assertEquals(0, testCommandMap.getCommandMap().size());
        testCommandMap.addCommand(testCommand1);
        assertEquals(1, testCommandMap.getCommandMap().size());
        testCommandMap.addCommand(testCommand2);
        assertEquals(2, testCommandMap.getCommandMap().size());
        testCommandMap.addCommand(testCommand1);
        assertEquals(2, testCommandMap.getCommandMap().size());
    }

    @Test
    public void testFindCommandById() throws Exception {
        testCommandMap.addCommand(testCommand1);
        testCommandMap.addCommand(testCommand2);
        assertNull(testCommandMap.findCommandById(testCommand3.getCommandId()));
        assertEquals(testCommand1.getCommandName(), testCommandMap.findCommandById(testCommand1.getCommandId()));
        assertEquals(testCommand2.getCommandName(), testCommandMap.findCommandById(testCommand2.getCommandId()));
    }
}