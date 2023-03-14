package org.example.epam.volha.jat.data;

import org.example.epam.volha.jat.exceptions.InvalidEmployeeTypeException;

public class HourlyEmployee extends Employee{

  @Override
  public Money calculatePay(Employee employee) throws InvalidEmployeeTypeException {
    return calculateHourlyPay(employee);
  }

  @Override
  public Money calculateBonus(Employee employee) throws InvalidEmployeeTypeException {
    return calculateHourlyBonus (employee);
  }

  private Money calculateHourlyBonus(Employee employee) {
    return new Money("Hourly bonus calculated");
  }

  private Money calculateHourlyPay (Employee employee){
    return new Money("Hourly payment calculated");
  }
}
