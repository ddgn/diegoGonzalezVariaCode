package com.example.rundeck.plugin.ws;

import com.google.gson.JsonObject;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * RestManager class that handles all the API exposed methods
 */
public interface RestManager {
    @GET("{getEndPoint}")
    Call<ResponseBody> getRequest(@Path(value = "getEndPoint") String endPoint);

    @POST("{postEndPoint}")
    Call<ResponseBody> postRequest(@Body JsonObject body, @Path(value = "postEndPoint") String endPoint);

    @PUT("{putEndPoint}")
    Call<ResponseBody> putRequest(@Body JsonObject body, @Path(value = "putEndPoint") String endPoint);

    @DELETE("{deleteEndPoint}")
    Call<ResponseBody> deleteRequest(@Path(value = "deleteEndPoint") String endPoint);

}
