package com.example.hw1busapp

import android.os.Bundle
import android.view.ContentInfo
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hw1busapp.ui.theme.Hw1BusAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hw1BusAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusApp()
                }
            }
        }
    }
}



@Composable
fun BusApp (modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Businees logo",
            modifier = Modifier
                .width(80.dp)
                .padding(top = 23.dp)
        )
        Text(
            text = stringResource(id = R.string.full_name),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(id = R.string.title),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        ) {
            Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            val email = painterResource(id = R.drawable.email)
            Image(
                painter = email, contentDescription = null, modifier = Modifier.padding(8.dp)
            )
            Text(
                text = stringResource(id = R.string.email),
                modifier = Modifier.padding(top = 16.dp),
                textAlign = TextAlign.Justify
            )
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            val email = painterResource(id = R.drawable.mobile)
            Image(
                painter = email, contentDescription = null, modifier = Modifier.padding(8.dp)
            )
            Text(
                text = stringResource(id = R.string.mobile),
                modifier = Modifier.padding(top = 16.dp),
                textAlign = TextAlign.Justify
            )
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            val email = painterResource(id = R.drawable.mobile)
            Image(
                painter = email, contentDescription = null, modifier = Modifier.padding(8.dp)
            )
            Text(
                text = stringResource(id = R.string.mobile),
                modifier = Modifier.padding(top = 16.dp),
                textAlign = TextAlign.Justify
            )
        }



        Image(
            painter = painterResource(id = R.drawable.androidparty), contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
    }


}

@Preview(
    showSystemUi = true,
    showBackground = true)
@Composable
fun BusCard() {
    Hw1BusAppTheme {
            BusApp()


    }
}