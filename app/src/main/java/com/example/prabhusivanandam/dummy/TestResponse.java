package com.example.prabhusivanandam.dummy;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Prabhu Sivanandam on 03-May-17.
 */

public class TestResponse {
    Cricket cricket;
    Cricket football;
    Cricket Hockey;

    public Cricket getFootball() {
        return football;
    }

    public void setFootball(Cricket football) {
        this.football = football;
    }

    public Cricket getHockey() {
        return Hockey;
    }

    public void setHockey(Cricket hockey) {
        Hockey = hockey;
    }

    public Cricket getCricket() {
        return cricket;
    }

    public void setCricket(Cricket cricket) {
        this.cricket = cricket;
    }

}

