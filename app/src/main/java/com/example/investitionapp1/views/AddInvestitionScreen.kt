package com.example.investitionapp1.views


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.investitionapp1.ui.theme.InvestitionApp1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(
    name:String,
    hint:String="",
    modifier: Modifier=Modifier
){
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text,
        onValueChange = {text = it},
        label = { Text(text = name)},
        modifier = modifier
            .padding(top = 5.dp, start = 10.dp, end = 10.dp)
            .fillMaxWidth()
    )
}

@Composable
fun CommitButton(
    text:String,
    icon:ImageVector = Icons.Default.Add,
    modifier: Modifier=Modifier
){
    Button(
        onClick = {},
        modifier = modifier
            .padding(top = 10.dp, start = 10.dp, end = 10.dp)
            .fillMaxWidth()
    ) {
        Icon(
            imageVector = icon,
            "add"
        )
        Text(text = text)
    }
}

@Composable
fun AddNewInvestitionScreen(
    modifier: Modifier=Modifier
){
    Surface(modifier = modifier) {
        Column {
            Text(
                "Dodaj nową inwestycję",
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
            )
            TextInput(name = "nazwa inwestycji")
            TextInput(name = "cena 1 sztuki inwestycji")
            TextInput(name = "liczba sztuk")
            TextInput(name = "data rozpoczęcia inwestycji")
            CommitButton(text = "DODAJ INWESTYCJĘ")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AddInvPreview() {
    InvestitionApp1Theme {
        AddNewInvestitionScreen()
    }
}