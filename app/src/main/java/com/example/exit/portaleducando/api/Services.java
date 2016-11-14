package com.example.exit.portaleducando.api;

import com.example.exit.portaleducando.model.Aluno;
import com.example.exit.portaleducando.model.Hospitalar;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Allef on 10/11/2016.
 */

public interface Services {

    @GET("login/{login}/{senha}")
    Call<Aluno> login(@Path("login") String login, @Path("senha") String senha);

    @GET("visualizarAluno/{id}")
    Call<Aluno> visualizarAluno(@Path("id") int id);

    @GET("procurarHospitalar/{id}")
    Call<Hospitalar> procurarHospitalar(@Path("id") int id);
}
