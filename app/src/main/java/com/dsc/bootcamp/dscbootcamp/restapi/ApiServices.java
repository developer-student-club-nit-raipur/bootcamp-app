package com.dsc.bootcamp.dscbootcamp.restapi;

import com.dsc.bootcamp.dscbootcamp.models.UserWrapper;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("v2/5c84deb63300000815f2ba59")
    Call<UserWrapper> getUserList();

}
