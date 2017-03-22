package com.quidco.app.utility.Api;

import com.google.gson.Gson;
import com.quidco.app.helper.Constants;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashishmohindroo on 3/17/17.
 */
public class QuidcoApi {
    public static final MediaType JSON
            = MediaType.parse("application/json");
    public static final MediaType URL_ENCODED
            = MediaType.parse("application/x-www-form-urlencoded");

    private Response response = null;

    private String token = "";

    public static Gson gson = new Gson();

    public static List<String> headersList = new ArrayList<>();
    public static Headers.Builder builder = new Headers.Builder();

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public QuidcoApi() throws IOException {
        setTokenForFurtherQueries();
    }

    OkHttpClient client = new OkHttpClient();

    public void createUser(String email, String pwd) {
        try {
            setResponse(postWithURLEncoded(Constants.JOIN_US_URL, builder.build(),email,pwd).getResponse());
        String responseJson = null;
        responseJson = getResponse().body().string();
        switch (getResponse().code()) {
            case 200:
                System.out.println("User Created");
                break;
            case 409:
                QuidcoError err = gson.fromJson(responseJson, QuidcoError.class);
                if (err.getErrors().get(0).getCode() == 1005) {
                    System.out.println("User Already Present. Skipping");
                    break;
                }
            default:
        }
        } catch (IOException e) {
            System.out.println(e.getStackTrace().toString());
        }
    }

    private void setTokenForFurtherQueries() throws IOException {
        String resp = null;
        String credentialsJson = gson.toJson(new Credentials());
        builder.add("QP-Site-Token", "7be59c50895f2950");
        resp = postWithJSON(Constants.SIGN_IN_URL,builder.build(),credentialsJson).getResponse().body().string();
        Token tokenObj = gson.fromJson(resp, Token.class);
        setToken(tokenObj.getToken());
    }

    private QuidcoApi postWithJSON(String url,Headers headers, String json) throws IOException {

        if (getToken() != null || !getToken().isEmpty()) {

            builder.add("Q-Auth-Token", getToken());
            RequestBody body = RequestBody.create(JSON, json);
            Request request = new Request.Builder()
                    .url(url)
                    .headers(headers)
                    .post(body)
                    .build();
            Response response = client.newCall(request).execute();
            setResponse(response);
            return this;
        } else {
            System.out.println("Please set the token first with relevant endpoint");
            System.exit(1);
        }

        return null;
    }

    private QuidcoApi postWithURLEncoded(String url, Headers headers,String email, String password) throws IOException {

        RequestBody formbody = new FormBody.Builder().add("email", email).add("password",password)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .headers(headers)
                .post(formbody)
                .build();

        Response response = client.newCall(request).execute();
        setResponse(response);
        return this;
    }
}
