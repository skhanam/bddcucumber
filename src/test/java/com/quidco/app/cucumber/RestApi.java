package com.quidco.app.cucumber;

import com.google.gson.Gson;
import com.quidco.app.utility.Api.QuidcoError;
import com.quidco.app.utility.Api.Token;
import com.quidco.app.utility.Api.User;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashishmohindroo on 3/17/17.
 */
public class RestApi {
    public static final MediaType JSON
            = MediaType.parse("application/json");
    public static final MediaType URL_ENCODED
            = MediaType.parse("application/x-www-form-urlencoded");


    public String token = "";
    OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        String json = "{\n" +
                "  \"username\": \"mobile.quidco+1@gmail.com\",\n" +
                "  \"password\": \"testpass1\"\n" +
                "}";
        String url = "https://ml.cashbacksrv.com/auth/login?token=true";

        List<String> headersList = new ArrayList<>();
        Headers.Builder builder = new Headers.Builder();
        builder.add("QP-Site-Token", "7be59c50895f2950");

        RestApi api = new RestApi();
        String response = api.postWithJSON(url, json, builder.build());

        Token tokenObj = gson.fromJson(response, Token.class);
        api.token = tokenObj.getToken();
        builder.add("Q-Auth-Token", api.token);

        Response resp = api.postWithURLEncoded("https://ml.cashbacksrv.com/auth/register-user", builder.build());

        String responseJson = resp.body().string();
        switch (resp.code()) {
            case 200:
                User user = gson.fromJson(responseJson, User.class);
                System.out.println(user.getUserId());
                break;
            case 409:
                System.out.println(resp.toString());
                QuidcoError err = gson.fromJson(responseJson, QuidcoError.class);
                if (err.getErrors().get(0).getCode() == 1005) {
                    System.out.println("User Already existing");
                }
                break;
            default:

        }

    }


    public String postWithJSON(String url, String json, Headers headers) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .headers(headers)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();

    }

    public Response postWithURLEncoded(String url, Headers headers) throws IOException {

        RequestBody formbody = new FormBody.Builder().add("email", "e333r3dfd3334ere@gmail.com").add("password", "testpass")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .headers(headers)
                .post(formbody)
                .build();

        Response response = client.newCall(request).execute();
        return response;


    }
}
