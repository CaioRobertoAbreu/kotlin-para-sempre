package com.kotlin.cadastrotasks

import android.graphics.Bitmap

class Tarefa (
    var foto: Bitmap?=null,
    var descricao: String,
    var prioridade: Prioridade,
    var perfil: Perfil,
    var urgente: Boolean
)