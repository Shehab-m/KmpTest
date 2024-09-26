package dependencies

interface TestRepository {
    fun showHelloWorld(): String
}

class TestRepositoryImpl(
    private val dbClient: DbClient
) : TestRepository {
    override fun showHelloWorld(): String {
        return dbClient.showHelloWorld()
    }

}