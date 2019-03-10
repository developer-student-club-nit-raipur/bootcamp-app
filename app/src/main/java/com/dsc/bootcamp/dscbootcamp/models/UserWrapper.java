package com.dsc.bootcamp.dscbootcamp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class UserWrapper implements Serializable {

   @SerializedName("datalist")
   @Expose
   private List<RecyclerViewData> recyclerViewData;

    public List<RecyclerViewData> getRecyclerViewData() {
        return recyclerViewData;
    }

    public void setRecyclerViewData(List<RecyclerViewData> recyclerViewData) {
        this.recyclerViewData = recyclerViewData;
    }
}
