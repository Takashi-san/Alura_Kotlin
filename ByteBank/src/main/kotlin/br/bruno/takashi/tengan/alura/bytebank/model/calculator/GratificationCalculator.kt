package br.bruno.takashi.tengan.alura.bytebank.model.calculator

import br.bruno.takashi.tengan.alura.bytebank.model.employee.Employee

class GratificationCalculator {
    var total: Double = 0.0

    fun register(employee: Employee) {
        total += employee.gratification
    }
}