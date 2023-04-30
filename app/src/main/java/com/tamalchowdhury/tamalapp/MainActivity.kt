package com.tamalchowdhury.tamalapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tamalchowdhury.tamalapp.ui.theme.PracticeComposeBasicsTheme
import java.util.Calendar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page()
                }
            }
        }
    }
}

@Composable
fun Page() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            val image = painterResource(id = R.drawable.bg_compose_background)
            Image(
                painter = image,
                contentDescription = null)
        }
        // Title
        Box {
            Text(
                text = stringResource(R.string.article_title),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)

            )
        }
        // First Paragraph
        Box {
            TextParagraph(text = stringResource(R.string.first_paragraph))
        }
        Box {
            TextParagraph(text = stringResource(R.string.second_paragraph))
        }
        Box {
            TextParagraph(text = stringResource(R.string.third_paragraph))
        }
        Box {
            TextParagraph(text = stringResource(R.string.under_const_text))
        }
        Box {
            val name = stringResource(R.string.author_name)
            val year = Calendar.getInstance().get(Calendar.YEAR)
            Text(
                text = "© $year $name",
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun TextParagraph(text: String) {
    Text(
        text,
        fontSize = 16.sp,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
        textAlign = TextAlign.Left
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticeComposeBasicsTheme {
        Page()
    }
}