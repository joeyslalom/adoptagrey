/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                Detail(pokemonData[1])
            }
        }
    }
}

@Preview("Light Theme Detail", widthDp = 360, heightDp = 640)
@Composable
fun LightDetail() {
    MyTheme {
        Detail(pokemonData[4])
    }
}

@Preview("Dark Theme Detail", widthDp = 360, heightDp = 640)
@Composable
fun DarkDetail() {
    MyTheme(darkTheme = true) {
        Detail(pokemonData[3])
    }
}

@Composable
fun Detail(pokemon: Pokemon) {
    Surface(
        color = MaterialTheme.colors.primary,
        contentColor = contentColorFor(MaterialTheme.colors.primary),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = pokemon.drawableId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .clip(shape = RoundedCornerShape(2.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(pokemon.name)
                Text(pokemon.location)
            }
            Spacer(Modifier.height(8.dp))
            Text(pokemon.description)

            Spacer(Modifier.height(8.dp))
            Text("If you would like to adopt ${pokemon.name}, please contact our adoption specialist.")

            Spacer(Modifier.height(8.dp))
            Text("Please visit our website to learn about or adoption process and what to expect: https://www.example.com")
        }
    }
}
