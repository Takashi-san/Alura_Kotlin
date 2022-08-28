package br.bruno.takashi.tengan.alura.bytebank.model.util

import br.bruno.takashi.tengan.alura.bytebank.logField

interface ILoggable {
    fun log() {
        logHead()
        logBody()
        logTail()
    }

    private fun logHead() {
        print("/* ")
        logField("Class", this::class.simpleName ?: "-")
    }
    fun logBody()
    private fun logTail() {
        println("*/")
    }
}