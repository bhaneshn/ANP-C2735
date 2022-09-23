package com.starlite.model;

import java.util.Objects;

public class CustomerDetails {

private int customerId;
private String customerName;
//private int customerOrder;
private int customerContact;
private String customerAddress;

public CustomerDetails() {
	super();
	
}
public CustomerDetails(int customerId, String customerName, int customerContact,
		String customerAddress) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
//	this.customerOrder = customerOrder;
	this.customerContact = customerContact;
	this.customerAddress = customerAddress;
}
@Override
public String toString() {
	return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName  + ", customerContact=" + customerContact + ", customerAddress=" + customerAddress + "]";
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public int getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(int customerContact) {
	this.customerContact = customerContact;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
@Override
public int hashCode() {
	return Objects.hash(customerAddress, customerContact, customerId, customerName);
}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	CustomerDetails other = (CustomerDetails) obj;
//	return Objects.equals(customerAddress, other.customerAddress) && customerContact == other.customerContact
//			&& customerId == other.customerId && Objects.equals(customerName, other.customerName)
//			&& customerOrder ;
//}
	
	
	
}
