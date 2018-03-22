package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CT on 2018/3/21.
 */

public class Forecast {
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
