package com.example.gao.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GAO on 2018/7/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Updata updata;
    public class Updata{
        @SerializedName("loc")
        public String updataTime;
    }
}
