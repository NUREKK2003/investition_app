package com.example.investitionapp1.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.investitionapp1.ui.theme.InvestitionApp1Theme

@Composable
fun EndedInvestitionsListScreen(
    modifier: Modifier=Modifier
){
    Surface(modifier = modifier) {
        LazyColumn(){
            item{
                Row() {
                    Text(
                        text = "Lista zakończonych inwestycji",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .padding(5.dp)
                    )
                }
            }
            items(exampleInvList){record->
                InvestitionRecord(title = record.investitionName, info = record.investitionSubtitle)
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun EndedInvestitionsPreview() {
    InvestitionApp1Theme {
        EndedInvestitionsListScreen()
    }
}