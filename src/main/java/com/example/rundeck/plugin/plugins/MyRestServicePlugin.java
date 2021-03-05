package com.example.rundeck.plugin.plugins;

import com.dtolabs.rundeck.core.plugins.Plugin;
import com.dtolabs.rundeck.plugins.descriptions.PluginDescription;
import com.example.rundeck.plugin.utils.GenerateJSON;
import com.example.rundeck.plugin.ws.RestManager;
import com.example.rundeck.plugin.ws.RestPlugin;
import com.google.gson.JsonObject;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;


@Plugin(service="RestRequest",name="my-plugin")
@PluginDescription(title="Rest Plugin", description="Execute any REST request")
public class MyRestServicePlugin implements RestPlugin {
    Response<ResponseBody> response;
    JsonObject jsonObjectData;
    public MyRestServicePlugin(){
        jsonObjectData = GenerateJSON.returnJsonData();
        response = null;
    }

    /**
     * Method to create a GET REST request
     * @param endPoint
     * @param restManager
     * @return
     * @throws IOException
     */
    @Override
    public Response<ResponseBody> getNotification(String endPoint, RestManager restManager) throws IOException {
        Call<ResponseBody> callGet = restManager.getRequest(endPoint);
        response = callGet.execute();
        return response;

    }

    /**
     * Method to create a POST REST request
     * @param endPoint
     * @param restManager
     * @return
     * @throws IOException
     */
    @Override
    public Response<ResponseBody> postNotification(String endPoint, RestManager restManager) throws IOException {
        Call<ResponseBody> callPost = restManager.postRequest(jsonObjectData, endPoint);
        response = callPost.execute();
        return response;
    }

    /**
     * Method to create a PUT REST request
     * @param endPoint
     * @param restManager
     * @return
     * @throws IOException
     */
    @Override
    public Response<ResponseBody> putNotification(String endPoint, RestManager restManager) throws IOException {
        Call<ResponseBody> callPut = restManager.putRequest(jsonObjectData, endPoint);
        response = callPut.execute();
        return response;
    }

    /**
     * Method to create a DELETE REST request
     * @param endPoint
     * @param restManager
     * @return
     * @throws IOException
     */
    @Override
    public Response<ResponseBody> deleteNotification(String endPoint, RestManager restManager) throws IOException {
        Call<ResponseBody> callDelete = restManager.deleteRequest(endPoint);
        response = callDelete.execute();
        return response;
    }

}