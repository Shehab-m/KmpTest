package di

import dependencies.TestRepository
import dependencies.TestRepositoryImpl
import dependencies.TestViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val dbClientModule: Module

val sharedModule = module {
    singleOf(::TestRepositoryImpl).bind<TestRepository>()
    viewModelOf(::TestViewModel)
}