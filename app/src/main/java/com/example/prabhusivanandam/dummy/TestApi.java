package com.example.prabhusivanandam.dummy;

import org.json.JSONObject;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Prabhu Sivanandam on 03-May-17.
 */

public interface TestApi {
    @GET("/bins/huu31")
    public void getData(Callback<TestResponse> response);
}
