package top.leetech.scripture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import top.leetech.scripture.data.ScriptureList
import top.leetech.scripture.ui.theme.ScriptureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScriptureTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                ) { innerPadding ->
                    ScriptureApp(
                        modifier = Modifier
                            .consumeWindowInsets(innerPadding)
                            .padding(24.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ScriptureApp(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        items(ScriptureList.scriptures) {
            ScriptureListItem(it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScriptureTheme {
        ScriptureApp()
    }
}