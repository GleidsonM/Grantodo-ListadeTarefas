package com.gleimonteiro.grantodo_listadetarefas.extensions

import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.annotation.RequiresApi
import com.google.android.material.textfield.TextInputLayout
import java.util.*

private val locale = Locale ("pt", "BR")

@RequiresApi(Build.VERSION_CODES.N)
fun Date.format() : String{
    return SimpleDateFormat("dd/MM/yyyy", locale).format(this)
}

var TextInputLayout.text : String
    get() = editText?.text?.toString() ?: ""
    set(value) {
        editText?.setText(value)
    }