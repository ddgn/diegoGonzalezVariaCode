package com.example.rundeck.plugin.ws;

import okhttp3.ResponseBody;
import retrofit2.Response;

import java.io.IOException;

public interface RestPlugin {
    public Response<ResponseBody> getNotification(String endPoint, RestManager restManager) throws IOException;
    public Response<ResponseBody> postNotification(String endPoint, RestManager restManager) throws IOException;
    public Response<ResponseBody> putNotification(String endPoint, RestManager restManager) throws IOException;
    public Response<ResponseBody> deleteNotification(String endPoint, RestManager restManager) throws IOException;
}
