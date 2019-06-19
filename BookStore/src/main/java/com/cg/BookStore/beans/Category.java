package com.cg.BookStore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer categoryId;
	private String categoryName;
	@OneToMany(mappedBy="category")
	private Book book;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Category(Integer categoryId, String categoryName, Book book) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.book = book;
	}
	public Category() {
	}
	public Category(Integer categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public Integer getcategoryId() {
		return categoryId;
	}
	public void setcategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
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
		Category other = (Category) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", book=" + book + "]";
	}
	

}
