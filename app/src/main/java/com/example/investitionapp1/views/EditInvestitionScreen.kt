package com.example.investitionapp1.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.investitionapp1.ui.theme.InvestitionApp1Theme

@Composable
fun EditInvestitionScreen(
    modifier: Modifier=Modifier
){
    Surface(modifier = modifier) {
        Column {
            Text(
                "Edytuj inwestycję",
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
            )
            TextInput(name = "aktualna wartośc 1 sztuki inwestycji")
            TextInput(name = "liczba sztuk")
            CommitButton(text = "SPRZEDAJ CAŁĄ INWESTYCJĘ", Icons.Default.Delete)
            CommitButton(text = "EDYTUJ INWESTYCJĘ", Icons.Default.Edit)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun EditInvPreview() {
    InvestitionApp1Theme {
        EditInvestitionScreen()
    }
}