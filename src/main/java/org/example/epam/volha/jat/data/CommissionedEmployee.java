package org.example.epam.volha.jat.data;

import org.example.epam.volha.jat.exceptions.InvalidEmployeeTypeException;

public class CommissionedEmployee extends Employee{

  @Override
  public Money calculatePay(Employee employee) throws InvalidEmployeeTypeException {
    return calculateCommissionedPay(employee);
  }

  @Override
  public Money calculateBonus(Employee employee) throws InvalidEmployeeTypeException {
    return calculateCommissionedBonus (employee);
  }

  private Money calculateCommissionedBonus(Employee employee) {
    return new Money("Commissioned bonus calculated");
  }

  private Money calculateCommissionedPay (Employee employee){
    return new Money("Commissioned payment calculated");
  }
}
