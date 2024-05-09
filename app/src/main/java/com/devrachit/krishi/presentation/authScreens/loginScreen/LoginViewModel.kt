package com.devrachit.krishi.presentation.authScreens.loginScreen

import androidx.compose.runtime.mutableStateOf
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.lifecycle.ViewModel
import com.devrachit.krishi.domain.models.SharedViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(

    val sharedViewModel: SharedViewModel,
    val dataStore: DataStore<Preferences>
): ViewModel(){
    val nameValid = mutableStateOf(true)
    val numberValid = mutableStateOf(true)
}