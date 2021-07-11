package com.kotlin.queryprofilegh.domain

import com.kotlin.queryprofilegh.data.model.userGithub
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("{login}")
    suspend fun buscarUsuarioGithub(
        @Path("login") login: String
    ) : Response<userGithub>
}