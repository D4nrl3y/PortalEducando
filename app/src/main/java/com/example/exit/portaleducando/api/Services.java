package com.example.exit.portaleducando.api;

import com.example.exit.portaleducando.model.Aluno;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Allef on 10/11/2016.
 */

public interface Services {

    @GET("login/{login}/{senha}")
    Call<Aluno> login(@Path("login") String login, @Path("senha") String senha);
}
