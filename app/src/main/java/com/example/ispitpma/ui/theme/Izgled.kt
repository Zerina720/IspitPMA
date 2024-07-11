package com.example.ispitpma.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ispitpma.R

@Composable
fun ScreenIspit(modifier: Modifier = Modifier) {
    Column {
        Box(
            modifier = Modifier
                .padding(start = 60.dp, top = 70.dp)
                .size(width = 280.dp, height = 50.dp)
                .border(width = 2.dp, color = Color.LightGray, shape = RoundedCornerShape(28.dp))
                .background(color = Color.White, shape = RoundedCornerShape(28.dp))
        ) {
            Row(
            ) {
                    Icon(
                        imageVector = Icons.Default.Search, contentDescription = null,
                        modifier = Modifier
                            .padding(top = 10.dp, start = 20.dp)
                            .size(25.dp),
                        tint = Color.LightGray
                            
                    )
                Text(text = "Search product...",
                    modifier = Modifier
                        .padding(start = 10.dp,top = 10.dp ),
                    color = Color.LightGray,
                    fontSize = 20.sp)
                
            }
        }

        Row {
            Text(text = "Trending Auction",
                fontSize = 18.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(
                    top = 30.dp, start = 20.dp
                )
            )
            Icon(imageVector = Icons.Default.Star, contentDescription =null,
                tint = Color(0xffff9800),
                modifier = Modifier.padding(top = 30.dp, start = 5.dp))
            Text(text = "See All",
                fontSize = 18.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 30.dp, start = 120.dp))
        }
        Box(modifier = Modifier
            .size(height = 480.dp, width = 370.dp)
            .padding(start = 20.dp, top = 10.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp)
            )
            .shadow(elevation = 4.dp, shape = MaterialTheme.shapes.medium)
        ){
            Column {
            Image(painter = painterResource(id = R.drawable.proba2), contentDescription = null,
                modifier = Modifier
                    .padding(start = 25.dp, top = 20.dp)
                    .size(width = 300.dp, height = 320.dp)
                    .background(color = Color(0xFFE6D7FF), shape = RoundedCornerShape(10.dp))
//                    .clip(RoundedCornerShape(10.dp))
            )

                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray, contentColor = Color.White),
                    modifier = Modifier
                        .padding(start = 100.dp, end = 20.dp, top = 10.dp)
                        .size(width = 150.dp, height = 50.dp)
                        .offset(y = (-70).dp)
                ) {
                    Text(text = "Place Bid")
                }
                Text(text = "The Cube 021",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .padding(start = 25.dp)
                        .offset(y = (-40).dp))
                Row {
                    Text(text = "Current Bid",
                        color = Color.Gray,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .offset(y = (-30).dp))
                    Text(text = "End in",
                        color = Color.Gray,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 185.dp)
                            .offset(y = (-32).dp))
                }
                Row {
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = null,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .offset(y = (-15).dp))
                    Text(text = "15.2",
                        fontWeight = FontWeight.Black,
                        fontSize = 22.sp,
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .offset(y = -18.dp))
                    Text(text = "03h : 23m : 15s",
                        fontWeight = FontWeight.Black,
                        fontSize = 22.sp,
                        modifier = Modifier
                            .padding(start = 80.dp)
                            .offset(y = -18.dp))
                }
            }
        }
        Row {
            Text(
                text = "Top Collections",
                fontSize = 18.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(
                    top = 13.dp, start = 25.dp
                )
            )
            Text(text = "See All",
                fontSize = 18.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 10.dp, start = 150.dp))
        }
        Row {
            Text(text = "1",
                fontWeight = FontWeight.Black,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp))
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null,
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)
                    .size(width = 40.dp, height = 40.dp)
                )
             Column {
                 Row {
                     Text(text = "Sarafuru",
                         fontSize = 18.sp,
                         fontWeight = FontWeight.Black,
                         modifier = Modifier.padding(
                             top = 10.dp, start = 10.dp))
                     Icon(imageVector = Icons.Default.Check, contentDescription = null,
                         tint = Color.White,
                         modifier = Modifier.padding(
                             top = 11.dp, start = 10.dp)
                             .background(color = Color.Blue, shape = CircleShape))
                     Icon(imageVector = Icons.Default.LocationOn, contentDescription = null,
                         modifier = Modifier
                             .padding(start = 55.dp, top = 10.dp))
                     Text(text = "15,341.53",
                         fontWeight = FontWeight.Black,
                         fontSize = 22.sp,
                         modifier = Modifier
                             .padding(start = 5.dp,top = 10.dp))
                 }

             }
        }
Spacer(modifier = Modifier.height(15
    .dp))
        Row(
            modifier = Modifier
                .background(color = Color.White)
                .border(width = 0.1.dp, color = Color.LightGray)
                .fillMaxWidth()
                .height(70.dp),

//                    .padding(start = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Home ,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier
                    .padding(start = 30.dp)
                    .size(34.dp)
//                        .padding(start = 5.dp)
            )
            Icon(imageVector = Icons.Default.Search ,
                contentDescription = null,
                tint = Color(0xFFA99CC1),
                modifier = Modifier
                    .size(34.dp))
            Icon(imageVector = Icons.Default.Add ,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(50.dp)
                    .background(color = Color.Blue, shape = CircleShape))
            Icon(imageVector = Icons.Default.MailOutline ,
                contentDescription = null,
                tint = Color(0xFFA99CC1),
                modifier = Modifier
                    .size(34.dp))
            Icon(imageVector = Icons.Default.Person ,
                contentDescription = null,
                tint = Color(0xFFA99CC1),
                modifier = Modifier
                    .padding(end = 30.dp)
                    .size(34.dp))
        }
    }
}