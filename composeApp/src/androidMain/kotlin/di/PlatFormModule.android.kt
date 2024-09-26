package di

import dependencies.DbClient
import dependencies.DbClientImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

actual val platFormModule = module {
    singleOf(::DbClientImpl).bind<DbClient>()
}