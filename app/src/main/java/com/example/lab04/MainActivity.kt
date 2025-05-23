package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        Greeting("Android")
    }
}

@Composable
fun LazyColumnDemo() {
    LazyColumn {
        items(5) { index ->
            Text(text = "Ítem #$index", modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun FloatingActionButtonDemo() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /* acción */ }) {
                Icon(Icons.Default.Add, contentDescription = "Agregar")
            }
        },
        content = { padding ->
            Text("Contenido principal", modifier = Modifier.padding(padding))
        }
    )
}

@Composable
fun OutlinedTextFieldDemo() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Nombre") },
        modifier = Modifier.padding(16.dp)
    )
}

fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWith()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeigh.Bold
        )
        Spacer(modifier = Modifier.heigh(16.dp))
        Text(
            text = "Hello, Student!",
            fontSize = 20.xD

    }
}
