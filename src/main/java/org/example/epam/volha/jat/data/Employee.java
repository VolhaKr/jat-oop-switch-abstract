package org.example.epam.volha.jat.data;

import org.example.epam.volha.jat.exceptions.InvalidEmployeeTypeException;

public abstract class Employee {
  private String name;
  private String type;

  public Money calculatePay(Employee employee) throws InvalidEmployeeTypeException {
    return null;
  }
  public Money calculateBonus(Employee employee) throws InvalidEmployeeTypeException {
    return null;
  }
}

