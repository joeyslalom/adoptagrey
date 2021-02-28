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

import androidx.annotation.DrawableRes

data class Pokemon(
    val name: String,
    val location: String,
    val description: String,
    @DrawableRes val drawableId: Int
)

val pokemonData = listOf(
    Pokemon(
        "Alice Granger", "Seattle, WA",
        "Alice loves people. She is very affectionate and loves snuggling on a warm couch.",
        R.drawable.alice_granger
    ),
    Pokemon(
        "Bob Spears", "Portland, OR",
        "Bob is sweet and very active! He is always ready for a hike or a trip to the dog park.",
        R.drawable.bob_spears
    ),
    Pokemon(
        "Charles Chen", "Tacoma, WA",
        "Charles is a retired racer.  He wants to spend his retirement watching TV on the couch with you!",
        R.drawable.charles_chen
    ),
    Pokemon(
        "Denise Tan", "Tacoma, WA",
        "Denise will be a great companion.  Although she is a little shy, once she becomes part of your household she'll never leave your side.",
        R.drawable.denise_tan
    ),
    Pokemon(
        "Eric Potter", "Olympia, WA",
        "Eric is very social and playful.  He would love going to a home with other four-legged friends.",
        R.drawable.eric_potter
    ),
    Pokemon(
        "Felicia Arnolds", "Vancouver, WA",
        "Felicia is fun and active! She needs a home without cats or small dogs. She is a happy doggo!",
        R.drawable.felicia_arnolds
    ),
)
