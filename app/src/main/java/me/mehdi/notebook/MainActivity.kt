package me.mehdi.notebook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import me.mehdi.notebook.ui.NotebookTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotebookTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    HomeUi()
                }
            }
        }
    }
}


@Preview
@Composable
fun HomeUi(){
    val img = imageResource(R.drawable.note)
    val typography = MaterialTheme.typography
    Column (modifier = Modifier.padding(8.dp)) {
        Image(img, modifier = Modifier.clip(RoundedCornerShape(8.dp)))
        Text("Note App", modifier = Modifier.padding(8.dp), style = typography.h4)
        Text("September 10, 2020", modifier = Modifier.padding(8.dp), style = typography.caption)
        Text("Jetpack Compose is an awesome UI Toolkit. I love it.", modifier = Modifier.padding(8.dp), style = typography.body1)
    }
}

