package Calculator

import Employee.IEmployee

class GratificationCalculator {
    var total: Double = 0.0

    fun register(employee: IEmployee) {
        total += employee.gratification
    }
}