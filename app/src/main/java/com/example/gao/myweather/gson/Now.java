package com.example.gao.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GAO on 2018/7/13.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
