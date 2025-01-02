package com.renush.home.presentation.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.renush.home.R

@Composable
fun DrawerContent(){

    Column (modifier = Modifier.fillMaxHeight() .width(250.dp).background(Color.LightGray), horizontalAlignment = Alignment.CenterHorizontally){


        Column (modifier = Modifier.fillMaxWidth().clip(
            RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp, bottomStart = 0.dp, bottomEnd = 30.dp)
        ) .height(200.dp).paint(painter = painterResource(R.drawable.taskbg), contentScale = ContentScale.FillBounds),){

            Column(modifier = Modifier.padding(top = 30.dp)) {

                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null, tint = Color.White,  modifier = Modifier.size(100.dp))
                Text("Jhone Doe",  color = Color.White , fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 12.dp))
                Text("jhondoe@gmai.com",  color = Color.White , fontWeight = FontWeight.Bold,modifier = Modifier.padding(start = 12.dp))

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(modifier = Modifier.fillMaxSize().padding(12.dp)) {

            Row (modifier = Modifier.padding(6.dp)){
                Icon(imageVector = Icons.Outlined.Person, contentDescription = null)
                Text("  My Profile", modifier = Modifier.padding(3.dp))
            }

            Spacer(modifier = Modifier.height(14.dp))

            Row (modifier = Modifier.padding(6.dp)){
                Icon(painter = painterResource(R.drawable.task), contentDescription = null, modifier = Modifier.size(20.dp).padding(top = 2.dp) )
                Text("  Dashboard", modifier = Modifier.padding(3.dp))
            }

            Spacer(modifier = Modifier.height(14.dp))
            Row (modifier = Modifier.padding(6.dp)){
                Icon(painter = painterResource(R.drawable.certificate), contentDescription = null, modifier = Modifier.size(22.dp).padding(top = 6.dp))
                Text("  Certificate", modifier = Modifier.padding(3.dp))
            }
            Spacer(modifier = Modifier.height(14.dp))
            Row (modifier = Modifier.padding(6.dp)){
                Icon(imageVector = Icons.Outlined.Settings, contentDescription = null)
                Text("  Settings", modifier = Modifier.padding(3.dp))
            }
            Spacer(modifier = Modifier.height(14.dp))
            Row (modifier = Modifier.padding(6.dp)){
                Icon(imageVector = Icons.Default.Warning, contentDescription = null)
                Text("  Help", modifier = Modifier.padding(3.dp))
            }

            Column (modifier = Modifier.fillMaxSize().padding(bottom = 20.dp), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally){

                Row (modifier = Modifier.padding(6.dp)){
                   Image(painter = painterResource(R.drawable.logout), contentDescription = null, modifier = Modifier.size(84.dp))
                }

            }

        }
    }

}