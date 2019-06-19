package com.cg.BookStore.beans;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String bookId;
	@ManyToOne
	private Category category;
	private String title;
	private String author;
	private String description;
	private Integer ISDNnumber;
	private String thumbnailImage;
	private Float price;
	private Date publishDate;
	private Time updateTime;
	private Integer quantity;
	@OneToMany(mappedBy="book")
	private List<Review> reviews;
	public Book() {
		super();
	}
	
	public Book(Category category, String title, String author, String description, Integer iSDNnumber,
			String thumbnailImage, Float price, Date publishDate, Time updateTime, Integer quantity,
			List<Review> reviews) {
		super();
		this.category = category;
		this.title = title;
		this.author = author;
		this.description = description;
		ISDNnumber = iSDNnumber;
		this.thumbnailImage = thumbnailImage;
		this.price = price;
		this.publishDate = publishDate;
		this.updateTime = updateTime;
		this.quantity = quantity;
		this.reviews = reviews;
	}

	public Book(String bookId, Category category, String title, String author, String description, Integer iSDNnumber,
			String thumbnailImage, Float price, Date publishDate, Time updateTime, Integer quantity) {
		super();
		this.bookId = bookId;
		this.category = category;
		this.title = title;
		this.author = author;
		this.description = description;
		ISDNnumber = iSDNnumber;
		this.thumbnailImage = thumbnailImage;
		this.price = price;
		this.publishDate = publishDate;
		this.updateTime = updateTime;
		this.quantity = quantity;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getISDNnumber() {
		return ISDNnumber;
	}
	public void setISDNnumber(Integer iSDNnumber) {
		ISDNnumber = iSDNnumber;
	}
	public String getThumbnailImage() {
		return thumbnailImage;
	}
	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Time getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Time updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISDNnumber == null) ? 0 : ISDNnumber.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((publishDate == null) ? 0 : publishDate.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((thumbnailImage == null) ? 0 : thumbnailImage.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
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
		Book other = (Book) obj;
		if (ISDNnumber == null) {
			if (other.ISDNnumber != null)
				return false;
		} else if (!ISDNnumber.equals(other.ISDNnumber))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (publishDate == null) {
			if (other.publishDate != null)
				return false;
		} else if (!publishDate.equals(other.publishDate))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (thumbnailImage == null) {
			if (other.thumbnailImage != null)
				return false;
		} else if (!thumbnailImage.equals(other.thumbnailImage))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", category=" + category + ", title=" + title + ", author=" + author
				+ ", description=" + description + ", ISDNnumber=" + ISDNnumber + ", thumbnailImage=" + thumbnailImage
				+ ", price=" + price + ", publishDate=" + publishDate + ", updateTime=" + updateTime + ", quantity="
				+ quantity + "]";
	}
	
}
