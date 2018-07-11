package com.example.gao.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by GAO on 2018/7/11.
 */

public class Provice extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return  id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setId(int id ){
        this.id=id;
    }
    public void setProvinceName(String name){
        this.provinceName=name;
    }
    public void setProvinceCode(int code){
        this.provinceCode=code;
    }
}
