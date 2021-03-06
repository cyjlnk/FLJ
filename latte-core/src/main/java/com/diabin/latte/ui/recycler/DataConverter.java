package com.diabin.latte.ui.recycler;

import java.util.ArrayList;

/**
 * Created by fei on 2017/8/3.
 */

public abstract class DataConverter {

    protected final ArrayList<MultipleItemEntity> ENTITIES=new ArrayList<>();
    private String mJsonData=null;

    public abstract ArrayList<MultipleItemEntity> convert();

    public DataConverter setJsonData(String json){
        this.mJsonData=json;
        return this;
    }

    public String getJsonData(){
        if(mJsonData==null || mJsonData.isEmpty()){
            throw new NullPointerException("DATA IS NULL!");
        }
        return mJsonData;
    }

}
