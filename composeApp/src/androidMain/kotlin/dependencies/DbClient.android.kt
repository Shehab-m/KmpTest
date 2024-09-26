package dependencies

import android.content.Context

actual class DbClientImpl(private val context: Context) : DbClient {

    override fun showHelloWorld(): String {
        println("Helloooooo ${context.packageName}")
        return "Hello World!!"
    }

}