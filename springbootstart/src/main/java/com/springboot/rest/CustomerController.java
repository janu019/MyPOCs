package com.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.CustomerService;

import model.Customer;

@RestController
public class CustomerController {

  @Autowired
  CustomerService customerService;

  //http://localhost:8080/customers
  @RequestMapping(method = RequestMethod.GET, value = "/customers")
  public List<Customer> getCustomers() {
    return customerService.getCustomers();
  }

  //http://localhost:8080/customersByActive?active=true
  @RequestMapping(method = RequestMethod.GET, value = "/customersByActive")
  public List<Customer> getCustomersByActive(@RequestParam(value = "active", defaultValue = "true") boolean active) {
    return customerService.getCustomersByActive(active);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/customers/add")
  public void addCustomer(@RequestBody Customer customer) {
    System.out.println(customer);
    customerService.addCustomer(customer);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/customers/delete/{customerId}")
  public void deleteCustomer(@PathVariable long customerId) {
    customerService.deleteCustomer(customerId);
  }
}
