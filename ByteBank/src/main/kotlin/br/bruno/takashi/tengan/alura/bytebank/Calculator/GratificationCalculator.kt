package br.bruno.takashi.tengan.alura.bytebank.Calculator

import br.bruno.takashi.tengan.alura.bytebank.Employee.Employee

class GratificationCalculator {
    var total: Double = 0.0

    fun register(employee: Employee) {
        total += employee.gratification
    }
}