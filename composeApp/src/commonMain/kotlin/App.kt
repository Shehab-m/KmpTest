import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dependencies.TestViewModel
import kmptest.composeapp.generated.resources.Res
import kmptest.composeapp.generated.resources.baseline_accessibility_24
import kmptest.composeapp.generated.resources.battery_level
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.context.KoinContext

@OptIn(KoinExperimentalAPI::class)
@Composable
@Preview
fun App(
    batteryManager: BatteryManager
) {
    MaterialTheme {
        KoinContext {
            NavHost(
                navController = rememberNavController(),
                startDestination = "home"
            ) {
                composable(route = "home") {
                    val viewModel = koinViewModel<TestViewModel>()
                    val text = viewModel.showHelloWorld()
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Column {
                            Image(
                                painter = painterResource(Res.drawable.baseline_accessibility_24),
                                null
                            )
//                Text("${stringResource(Res.string.battery_level)}${batteryManager.getBatteryLeve()}")
                            Text("$text: ${batteryManager.getBatteryLeve()}")
                        }
                    }
                }
            }
        }
//        var showContent by remember { mutableStateOf(false) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me!")
//            }
//            AnimatedVisibility(showContent) {
//                val greeting = remember { Greeting().greet() }
//                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Compose: $greeting")
//                }
//            }
//        }
    }
}