package alvioneurope.gsergeev.javagroup.clientlogimporter;

import java.util.*;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class CommandMap {
    private Map<Integer,String> commandMap;

    public CommandMap() {
        commandMap = new TreeMap<Integer, String>();
    }

    public Map<Integer,String> getCommandMap(){
        return commandMap;
    }

    public void addCommand (Command command) {
        commandMap.put(command.getCommandId(),command.getCommandName());
    }

    public String findCommandById(int id) {
        if (commandMap.containsKey(id)){
            return commandMap.get(id);
        }
        else
            return null;
    }
}