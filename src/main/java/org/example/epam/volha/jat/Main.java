package org.example.epam.volha.jat;

import org.example.epam.volha.jat.data.Employee;
import org.example.epam.volha.jat.data.HourlyEmployee;
import org.example.epam.volha.jat.exceptions.InvalidEmployeeTypeException;

public class Main {

  public static void main(String[] args) throws InvalidEmployeeTypeException {
    System.out.println("Begin calculation");
    Employee employee = new HourlyEmployee();
    System.out.println(employee.calculateBonus(employee).getOutputDescription());
    System.out.println(employee.calculatePay(employee).getOutputDescription());
  }
}