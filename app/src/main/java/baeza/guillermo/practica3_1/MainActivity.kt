package baeza.guillermo.practica3_1

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import baeza.guillermo.practica3_1.ui.theme.Practica3_1Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica3_1Theme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    TextField1()
                    Spacer(modifier = Modifier.padding(15.dp))
                    TextField2()
                    Spacer(modifier = Modifier.padding(15.dp))
                    TextField3()
                    Spacer(modifier = Modifier.padding(15.dp))
                    Text1()
                    Spacer(modifier = Modifier.padding(15.dp))
                    Text2()
                }
            }
        }
    }
}

@Composable
fun TextField1() {
    val textState = remember{ mutableStateOf(TextFieldValue()) }
    TextField(
        value = textState.value,
        onValueChange = {textState.value = it},
        modifier = Modifier
            .height(50.dp)
            .width(300.dp)
            .shadow(10.dp)
            .border(2.dp, Color.Black, RectangleShape)
            .background(Color.White),
        placeholder = {Text("TextField1")}
    )
}

@Composable
fun TextField2() {
    val textState = remember{ mutableStateOf(TextFieldValue()) }
    TextField(
        value = textState.value,
        onValueChange = {textState.value = it},
        modifier = Modifier
            .height(50.dp)
            .width(300.dp)
            .shadow(10.dp, RoundedCornerShape(10.dp))
            .border(2.dp, Color.Blue, RoundedCornerShape(10.dp))
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Yellow),
        placeholder = {Text("TextField2")}
    )
}

@Composable
fun TextField3() {
    val textState = remember{ mutableStateOf(TextFieldValue()) }
    TextField(
        value = textState.value,
        onValueChange = {textState.value = it},
        modifier = Modifier
            .height(50.dp)
            .width(300.dp)
            .shadow(10.dp, CutCornerShape(10.dp))
            .border(2.dp, Color(255, 128, 0), CutCornerShape(10.dp))
            .background(Color.LightGray)
            .clip(CutCornerShape(10.dp)),
        placeholder = {Text("TextField3")}
    )
}

@Composable
fun Text1() {
    Text(
        text = "Text 1",
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
        color = Color.Magenta,
        modifier = Modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun Text2() {
    Text(
        text = "Text 2",
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        modifier = Modifier
            .rotate(90f)
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}