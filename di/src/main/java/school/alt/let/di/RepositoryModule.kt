package school.alt.let.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import school.alt.let.network.auth.AuthApiRepositoryImpl
import school.alt.let.network.auth.AuthRepository
import school.alt.let.network.user.UserApiRepositoryImpl
import school.alt.let.network.user.UserRepository


import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAuthRepository(authApiRepositoryImpl: AuthApiRepositoryImpl): AuthRepository =
        authApiRepositoryImpl

    @Provides
    @Singleton
    fun provideUserRepository(userApiRepositoryImpl: UserApiRepositoryImpl): UserRepository =
        userApiRepositoryImpl

}