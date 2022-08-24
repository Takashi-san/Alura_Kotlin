package Calculator

import Employee.Employee

class GratificationCalculator {
    var total: Double = 0.0

    fun register(employee: Employee) {
        total += employee.gratification
    }
}