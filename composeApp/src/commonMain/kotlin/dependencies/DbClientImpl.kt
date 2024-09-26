package dependencies

interface DbClient {
    fun showHelloWorld(): String
}

expect class DbClientImpl: DbClient