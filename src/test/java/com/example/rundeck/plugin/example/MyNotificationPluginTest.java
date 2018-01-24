package com.example.rundeck.plugin.example;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyNotificationPluginTest extends TestCase {
    //Some Possible trigger names
    public static final String TRIGGER_START = "start";
    public static final String TRIGGER_SUCCESS = "success";
    public static final String TRIGGER_FAILURE = "failure";

    Map createTestExecutionData() {
        HashMap<String, Object> map = new HashMap<>();


        map.put("id", "1");
        map.put("href", "http://example.com/dummy/execution/1");
        map.put("status", "succeeded");
        map.put("user", "rduser");
        map.put("dateStarted", new Date(0));
        map.put("dateStartedUnixtime", "0");
        map.put("dateStartedW3c", "1970-01-01T00:00:00Z");
        map.put("dateEnded", new Date(10000));
        map.put("dateEndedUnixtime", "10000");
        map.put("dateEndedW3c", "1970-01-01T00:00:10Z");
        map.put("description", "a job");
        map.put("argstring", "-opt1 value");
        map.put("project", "rdproject1");
        map.put("succeededNodeListString", "nodea,nodeb");
        map.put("succeededNodeList", Arrays.asList("nodea", "nodeb"));
        map.put("loglevel", "INFO");


        return map;
    }

    /**
     * A test when the notification returns true
     */
    public void testPostNotificationBasicSuccess() {
        String triggerType = TRIGGER_SUCCESS;
        MyNotificationPlugin myNotificationPlugin = new MyNotificationPlugin();
        //TODO: set additional properties for your plugin
        //TODO: add mock implementations of any objects which your plugin uses, such as HTTP clients, etc.


        HashMap<String, String> configMap = new HashMap<>();
        //TODO:

        assertTrue("should succeed", myNotificationPlugin.postNotification(triggerType, createTestExecutionData(), configMap));
    }


    /**
     * A test when the notification returns false
     */
    public void testPostNotificationBasicFailure() {

        //TODO: a test for a failure result
    }

}