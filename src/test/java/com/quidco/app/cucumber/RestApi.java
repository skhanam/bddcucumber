package com.quidco.app.cucumber;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashishmohindroo on 3/17/17.
 */
public class RestApi {
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        String json = "{\n" +
                "  \"username\": \"mobile.quidco+1@gmail.com\",\n" +
                "  \"password\": \"testpass1\"\n" +
                "}";
        String url  = "https://ml.cashbacksrv.com/auth/login?token=true";

        List<String> headersList = new ArrayList<>();
        Headers.Builder builder = new Headers.Builder();
        builder.add("QP-Site-Token","7be59c50895f2950");

        RestApi api  = new RestApi();
        String response = api.post(url,json,builder.build());
        System.out.println(response);

        Token tokenObj = gson.fromJson(response,Token.class);
        System.out.println(tokenObj.getToken());

    }

   public  String post(String url , String json,Headers headers) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .headers(headers)
                .post(body)
                .build();
       System.out.println(request.header("QP-Site-Token"));
        Response response = client.newCall(request).execute();
        return response.body().string();

    }

    static class Token {
        private String token;
        private long expiresIn;
        private int userID;

        public Token(){

        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public long getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(long expiresIn) {
            this.expiresIn = expiresIn;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }
    }

}
