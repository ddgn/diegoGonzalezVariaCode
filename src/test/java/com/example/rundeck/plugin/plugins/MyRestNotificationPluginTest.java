package com.example.rundeck.plugin.plugins;

import com.example.rundeck.plugin.constants.Constants;
import com.example.rundeck.plugin.ws.RestController;
import com.example.rundeck.plugin.ws.RestManager;
import junit.framework.TestCase;
import okhttp3.ResponseBody;
import retrofit2.Response;

import java.io.IOException;

public class MyRestNotificationPluginTest extends TestCase {

    private MyRestServicePlugin myRestServicePlugin = new MyRestServicePlugin();
    private RestManager restManager = RestController.getClient(Constants.BASE_URL).create(RestManager.class);
    private RestManager restManagerExtra = RestController.getClient(Constants.BASE_URL_EXTRA).create(RestManager.class);
    private Response<ResponseBody> response;

    /**
     * Test a GET request verifying 200 http code
     * @throws IOException
     */
    public void testGetRestNotification() throws IOException {
        response = myRestServicePlugin.getNotification(Constants.GET_ENDPOINT, restManager);
        assertEquals("GET request successfull" ,200, response.code());
    }

    /**
     * Test a POST request verifying 201 http code
     * @throws IOException
     */
    public void testPostRestNotification() throws IOException {
       response = myRestServicePlugin.postNotification(Constants.POST_ENDPOINT, restManager);
       assertEquals("POST request successfull" ,201, response.code());
    }

    /**
     * Test a PUT request verifying 200 http code
     * @throws IOException
     */
    public void testPutRestNotification() throws IOException {
        response = myRestServicePlugin.putNotification(Constants.PUT_ENDPOINT, restManagerExtra);
        assertEquals("PUT request successfull" ,200, response.code());
    }

    /**
     * Test a DELETE request verifying 200 http code
     * @throws IOException
     */
    public void testDeleteRestNotification() throws IOException {
        response = myRestServicePlugin.deleteNotification(Constants.DELETE_ENDPOINT, restManagerExtra);
        assertEquals("DELETE request successfull" ,200, response.code());
    }
}
