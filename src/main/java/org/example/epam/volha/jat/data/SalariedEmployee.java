package org.example.epam.volha.jat.data;

import org.example.epam.volha.jat.exceptions.InvalidEmployeeTypeException;

public class SalariedEmployee extends Employee {

  @Override
  public Money calculatePay(Employee employee) throws InvalidEmployeeTypeException {
    return calculateSalariedPay(employee);
  }

  @Override
  public Money calculateBonus(Employee employee) throws InvalidEmployeeTypeException {
    return calculateSalariedBonus(employee);
  }

  private Money calculateSalariedBonus(Employee employee) {
    return new Money("Salaried bonus calculated");
  }

  private Money calculateSalariedPay(Employee employee) {
    return new Money("Salaried payment calculated");
  }
}
