package com.example.investitionapp1.views

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.investitionapp1.Greeting
import com.example.investitionapp1.data.structures.InvestitionRowRecord
import com.example.investitionapp1.ui.theme.InvestitionApp1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier=Modifier
){
    NavDrawerExample()
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDemo(){
    val ctx =LocalContext.current
    //val scaffoldState = rememberScaffoldState()
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                Toast.makeText(ctx,"TEST1",Toast.LENGTH_SHORT).show()
            }) {

                Icon(
                    Icons.Filled.Add,""
                )
            }
        },
        content = {
            Column {
                WelcomeInfo(text = "witaj, XYZ!", saldo = "2132,12zł")
                WelcomeInformations()
                InvestitionsColumn(investitionsList = exampleInvList)
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavDrawerExample() {
    ModalNavigationDrawer(
        drawerContent = {
            Column {
                // Add items to the navigation drawer
                // Example:
                Text("Home")
                Text("Settings")
                Text("About")
            }
        },
        content = {
            ScaffoldDemo()
        }
    )
}

@Composable
fun WelcomeInfo(
    text:String,
    saldo:String,
    modifier: Modifier=Modifier
){
    Column() {
        Text(
            text = text,
            textAlign = TextAlign.Right,
            style = MaterialTheme.typography.headlineMedium
                .copy(
                    fontWeight = FontWeight(700)
                ),
            modifier = modifier
                .fillMaxWidth()
                .padding(5.dp)
        )
        Text(
            text = saldo,
            textAlign = TextAlign.Right,
            style = MaterialTheme.typography.headlineLarge
                .copy(
                    fontSize = 50.sp,
                    fontWeight = FontWeight(800)
                ),
            modifier = modifier
                .fillMaxWidth()
                .padding(end = 5.dp)
        )
    }
}
@Composable
fun InformationLine(
    text:String,
    modifier: Modifier=Modifier
){
    Text(
        text = text,
        style = MaterialTheme.typography.labelMedium,
        modifier=modifier
    )
}
@Composable
fun WelcomeInformations(
    modifier: Modifier=Modifier
){
    Column {
        InformationLine(
            text = "bilans ostatnich 24h: +8,75%",
            Modifier.padding(5.dp)
        )
        InformationLine(
            text = "bilans ostatnich 30 dni: -0,75%",
            Modifier.padding(5.dp)
        )
    }
}

@Composable
fun InvestitionsColumn(
    investitionsList:List<InvestitionRowRecord>,
    modifier: Modifier=Modifier
){
    Surface() {
        LazyColumn(){
            item{
                Row() {
                    Text(
                        text = "Lista Inwestycji",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .padding(5.dp)
                    )
                }
            }
            items(investitionsList){record->
                InvestitionRecord(title = record.investitionName, info = record.investitionSubtitle)
            }

        }
    }
}


@Composable
fun InvestitionRecord(
    title:String,
    info:String,
    modifier: Modifier = Modifier
        .fillMaxWidth()
){
    Card(
        colors = CardDefaults.cardColors(
            containerColor =  MaterialTheme.colorScheme.surfaceVariant,
        ),
        shape = RoundedCornerShape(2.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = modifier
            .padding(5.dp)
    ){
        Column(
            modifier = Modifier
                .padding(5.dp)
        ) {
            Text(text = title)
            Text(
                text = info,
                fontSize = 10.sp
            )
        }

    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InvestitionApp1Theme {
        InvestitionRecord(title = "złoto", info = "123,55zł +0,45%/24h")
    }
}

val exampleInvList:List<InvestitionRowRecord> = listOf(
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
    InvestitionRowRecord("złoto","123,55zł +0,45%/24h"),
)

@Preview(showBackground = true)
@Composable
fun DefaultColumnPreview() {
    InvestitionApp1Theme {
        ScaffoldDemo()
    }
}





