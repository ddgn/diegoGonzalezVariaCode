package com.example.rundeck.plugin.utils;

import com.google.gson.JsonObject;

public class GenerateJSON {
    private static JsonObject jsonObject;

    /**
     * Method to create dummy data
     * @return JsonObject
     */
    public static JsonObject returnJsonData(){
        jsonObject = new JsonObject();
        jsonObject.addProperty("title", "foo");
        jsonObject.addProperty("body", "bar");
        jsonObject.addProperty("userId", 20);

        return jsonObject;
    }
}
