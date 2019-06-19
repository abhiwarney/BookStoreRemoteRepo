package com.cg.BookStore.beans;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="custOrder")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderId;
	private String recipientName;
	private Long recipientNumber;
	private String streetAddress;
	private String city;
	private String country;
	private Integer zipcode;
	@OneToMany
	private List<Book>books;
	private Integer quantity;
	private Float subtotal;
	private Float total;
	private String orderStatus;
	private String paymentMethod;
	private Date  orderDate;
	public Order() {}
	
	public Order(String recipientName, Long recipientNumber, String streetAddress, String city, String country,
			Integer zipcode, List<Book> books, Integer quantity, Float subtotal, Float total, String orderStatus,
			String paymentMethod, Date orderDate) {
		super();
		this.recipientName = recipientName;
		this.recipientNumber = recipientNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.books = books;
		this.quantity = quantity;
		this.subtotal = subtotal;
		this.total = total;
		this.orderStatus = orderStatus;
		this.paymentMethod = paymentMethod;
		this.orderDate = orderDate;
	}
	public Order(Integer orderId, String recipientName, Long recipientNumber, String streetAddress, String city,
			String country, Integer zipcode, List<Book> books, Integer quantity, Float subtotal, Float total,
			String orderStatus, String paymentMethod, Date orderDate) {
		super();
		this.orderId = orderId;
		this.recipientName = recipientName;
		this.recipientNumber = recipientNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.books = books;
		this.quantity = quantity;
		this.subtotal = subtotal;
		this.total = total;
		this.orderStatus = orderStatus;
		this.paymentMethod = paymentMethod;
		this.orderDate = orderDate;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public Long getRecipientNumber() {
		return recipientNumber;
	}
	public void setRecipientNumber(Long recipientNumber) {
		this.recipientNumber = recipientNumber;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((paymentMethod == null) ? 0 : paymentMethod.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((recipientName == null) ? 0 : recipientName.hashCode());
		result = prime * result + ((recipientNumber == null) ? 0 : recipientNumber.hashCode());
		result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
		result = prime * result + ((subtotal == null) ? 0 : subtotal.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (paymentMethod == null) {
			if (other.paymentMethod != null)
				return false;
		} else if (!paymentMethod.equals(other.paymentMethod))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (recipientName == null) {
			if (other.recipientName != null)
				return false;
		} else if (!recipientName.equals(other.recipientName))
			return false;
		if (recipientNumber == null) {
			if (other.recipientNumber != null)
				return false;
		} else if (!recipientNumber.equals(other.recipientNumber))
			return false;
		if (streetAddress == null) {
			if (other.streetAddress != null)
				return false;
		} else if (!streetAddress.equals(other.streetAddress))
			return false;
		if (subtotal == null) {
			if (other.subtotal != null)
				return false;
		} else if (!subtotal.equals(other.subtotal))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", recipientName=" + recipientName + ", recipientNumber=" + recipientNumber
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", country=" + country + ", zipcode="
				+ zipcode + ", books=" + books + ", quantity=" + quantity + ", subtotal=" + subtotal + ", total="
				+ total + ", orderStatus=" + orderStatus + ", paymentMethod=" + paymentMethod + ", orderDate="
				+ orderDate + "]";
	}
	
	

}
