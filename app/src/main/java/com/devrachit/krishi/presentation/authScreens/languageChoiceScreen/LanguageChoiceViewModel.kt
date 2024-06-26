package com.devrachit.krishi.presentation.authScreens.languageChoiceScreen

import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.preferencesKey
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devrachit.krishi.datastore.SaveToDataStore
import com.devrachit.krishi.datastore.readFromDataStore
import com.devrachit.krishi.domain.models.SharedViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LanguageChoiceViewModel @Inject constructor(

    val sharedViewModel: SharedViewModel,
    val dataStore: DataStore<Preferences>
):ViewModel() {

    fun setLanguage(language: String){
        sharedViewModel.setLanguage(language)
        viewModelScope.launch(Dispatchers.IO) {
            save("language",language)
            Log.d(readFromDataStore(dataStore,"language"),"Language")
        }
    }
    private suspend fun save (key:String , value:String){
        val dataStoreKey= preferencesKey<String>(key)
        dataStore.edit{temp ->
            temp[dataStoreKey]=value
        }
    }
}