package model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Customer {
  private long id;
  private String firstName;
  private String lastName;
  private String address;
  private boolean active;

  public Customer() {
  }

  public Customer(long id, String firstName, String lastName, String address, boolean active) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.active = active;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }

  @Override
  public boolean equals(Object other) {
    return Pojomatic.equals(this, other);
  }

  @Override
  public int hashCode() {
    return Pojomatic.hashCode(this);
  }
}
