package com.ucb.app.di

import com.ucb.app.github.data.datasource.GithubRemoteDataSource
import com.ucb.app.github.data.repository.GithubRepositoryImpl
import com.ucb.app.github.data.service.GitHubApiService
import com.ucb.app.github.domain.repository.GithubRepository
import com.ucb.app.movie.data.datasource.MovieRemoteDatasource
import com.ucb.app.movie.data.repository.MovieRepositoryImpl
import com.ucb.app.movie.data.service.MovieService
import com.ucb.app.movie.domain.repository.MovieRepository
import com.ucb.app.profile.data.datasource.UserLocalDatasource
import com.ucb.app.profile.data.repository.ProfileRepositoryImpl
import com.ucb.app.profile.data.service.UserDbService
import com.ucb.app.profile.domain.repository.ProfileRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val dataModule = module {
    singleOf(::GitHubApiService).bind<GithubRemoteDataSource>()
    singleOf(::GithubRepositoryImpl).bind<GithubRepository>()
    singleOf(::MovieRepositoryImpl).bind<MovieRepository>()
    singleOf(::MovieService).bind<MovieRemoteDatasource>()
    singleOf(::ProfileRepositoryImpl).bind<ProfileRepository>()
    singleOf(::UserDbService).bind<UserLocalDatasource>()
}