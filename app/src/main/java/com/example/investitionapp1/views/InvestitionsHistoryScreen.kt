package com.example.investitionapp1.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.investitionapp1.data.structures.InvestitionRowRecord
import com.example.investitionapp1.ui.theme.InvestitionApp1Theme

@Composable
fun InvestitionsHistoryScreen(
    modifier: Modifier=Modifier
){

    Surface(modifier = modifier) {
        Column {
            Text(
                "Historia Inwestycji",
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
            )
            StatisticsColumn()
        }
    }
}
@Composable
fun StatisticsColumn(
    modifier: Modifier=Modifier
){
    Surface(modifier = modifier) {
        Column {
            Text(
                "statystyki",
                textAlign = TextAlign.Start,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )
            InformationLine(text = "najzyskowniejsza inwestycja")
            InvestitionRecord(title = "złoto", info = "123,55zł +0,45%/24h")
            InformationLine(text = "największa strata")
            InvestitionRecord(title = "Orlen", info = "-12,55zł -0,45%/24h")
            InformationLine(text = "łączny bilans:")
            InformationLine(text = "średni dzienny zysk:")
            InformationLine(text = "średni miesięczny zysk:")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StatsPreview() {
    InvestitionApp1Theme {
        InvestitionsHistoryScreen()
    }
}
