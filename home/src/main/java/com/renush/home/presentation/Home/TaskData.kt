package com.renush.home.presentation.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.renush.home.Models.TaskDataModel
import com.renush.home.R

@Composable
fun TaskData() {

    val data = getTaskData()

    LazyColumn {
        items(data) {
            ShowData(it)
        }
    }
}


@Composable
fun ShowData(taskDataModel: TaskDataModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(14.dp)
            .height(80.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(7.dp)
    ) {


        Row {

            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp))
                    .paint(
                        painter = painterResource(R.drawable.taskbg),
                        contentScale = ContentScale.FillBounds
                    ), contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.task),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(39.dp)
                )
            }

            Column(modifier = Modifier.padding(start = 14.dp, top = 8.dp)) {
                Text(
                    taskDataModel.taskName,
                    color = Color.Black,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(4.dp))
                Text(taskDataModel.taskSubmissionDate, color = Color.Black, fontSize = 13.sp)

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, end = 6.dp),
                horizontalArrangement = Arrangement.End
            ) { Text(taskDataModel.taskStatus, color = Color.Red, fontWeight = FontWeight.Bold) }

        }

    }
}


fun getTaskData(): List<TaskDataModel> {
    return listOf(
        TaskDataModel("Loading Page", "submission date 15 Nov,2024", "Pending"),
        TaskDataModel("Dashboard Design", "submission date 17 Nov,2024", "Pending"),
        TaskDataModel("Login/Sign Up Page", "submission date 19 Nov,2024", "Pending"),
        TaskDataModel("Mobile App Ui Design", "submission date 22 Nov,2024", "Pending")
    )
}

