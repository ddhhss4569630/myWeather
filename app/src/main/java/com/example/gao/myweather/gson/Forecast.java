package com.example.gao.myweather.gson;

import com.bumptech.glide.load.resource.SimpleResource;
import com.google.gson.annotations.SerializedName;

/**
 * Created by GAO on 2018/7/13.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
