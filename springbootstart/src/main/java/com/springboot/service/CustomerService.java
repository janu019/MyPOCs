package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import model.Customer;

@Service
public class CustomerService {
  // This is for test - never have state in the service
  private static List<Customer> customers = new ArrayList<>();
  private static int idSequence = 1;

  public CustomerService() {
    customers.add(new Customer(idSequence++, "James", "Bryner", "Overstock main branch, Midvale", true));
    customers.add(new Customer(idSequence++, "James", "Watts", "Overstock main branch, Midvale", true));
    customers.add(new Customer(idSequence++, "David", "Burdick", "Overstock main branch, Midvale", false));
    customers.add(new Customer(idSequence++, "Matt", "Ritter", "Overstock main branch, Midvale", false));
    customers.add(new Customer(idSequence++, "Jeff", "Meier", "Overstock main branch, Midvale", true));
    customers.add(new Customer(idSequence++, "Art", "Fed", "Overstock main branch, Midvale", true));
    customers.add(new Customer(idSequence++, "Jana", "Madam", "Overstock main branch, Midvale", true));
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public List<Customer> getCustomersByActive(boolean active) {
    return customers.stream().filter(s -> active == s.isActive()).collect(Collectors.toList());
  }

  public void addCustomer(Customer customer) {
    customers.add(customer);
  }

  public void deleteCustomer(long customerId) {
    for(Customer customer : customers) {
      if(customer.getId() == customerId) {
        customers.remove(customer);
        break;
      }
    }
  }
}
