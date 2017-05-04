package com.example.prabhusivanandam.dummy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Request;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {


    private TextView tvText;
    String URL="https://api.myjson.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = (TextView) findViewById(R.id.tvText);
        RestAdapter restAdapter=new RestAdapter.Builder().setEndpoint(URL).build();
        TestApi api=restAdapter.create(TestApi.class);
       api.getData(new Callback<TestResponse>() {
           @Override
           public void success(TestResponse testResponse, Response response) {
               Toast.makeText(MainActivity.this,""+testResponse.getCricket().getName()+" "+testResponse.getFootball().getName(),Toast.LENGTH_LONG).show();
           }

           @Override
           public void failure(RetrofitError error) {
                finish();
           }
       });
    }
}
