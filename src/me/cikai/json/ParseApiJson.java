package me.cikai.json;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class ParseApiJson {
  public static void sendRequestWithHttpClient() {
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          HttpClient httpClient = new DefaultHttpClient();
          HttpGet httpGet = new HttpGet(
              "your json url");
          HttpResponse httpResponse = httpClient.execute(httpGet);
          if (httpResponse.getStatusLine().getStatusCode() == 200) {
            HttpEntity entity = httpResponse.getEntity();
            String response = EntityUtils.toString(entity, "utf-8");
            setData(response);
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }).start();
  }

  public static void setData(String response) {
    Gson gson = new Gson();
    DataModel dataModel = gson.fromJson(response, DataModel.class);
    System.out.println(dataModel.getRspcode());
    System.out.println(dataModel.getCityname());
  }

  public static void main(String[] args) {
    sendRequestWithHttpClient();
  }
}
