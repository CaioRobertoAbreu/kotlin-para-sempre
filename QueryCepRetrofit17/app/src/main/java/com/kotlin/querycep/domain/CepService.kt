package com.kotlin.querycep.domain

import com.kotlin.querycep.data.model.Cep
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

//Responsável por montar a URL final
//ex. apiexemplo.com/v1/ é minha base url
//para eu acessar uma lista de usuarios é a url apiexemplo.com/v1/getUsuarios
//então o service vai juntar o getUsuario (final da url) com a minha base
interface CepService {

    //POST
    //Requisições HTTP

    //viacep.com.br/ws/11060002/json/
    @GET("{cepInserido}/json/")
    suspend fun buscarCEP(
        @Path("cepInserido") cep: String
    ) : Response<Cep>
}