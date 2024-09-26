package dependencies

import androidx.lifecycle.ViewModel

class TestViewModel(
    private val repository: TestRepository
) : ViewModel() {

    fun showHelloWorld(): String {
        return repository.showHelloWorld()
    }

}