package com.coolweather_copy.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 泰扁扁 on 2017/7/18.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weaterId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeaterId() {
        return weaterId;
    }

    public void setWeaterId(String weaterId) {
        this.weaterId = weaterId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
