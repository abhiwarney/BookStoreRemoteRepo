package com.cg.BookStore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer reviewId;
	private Integer rating;
	private String headline;
	private String comment;
	public Review(Integer reviewId, Integer rating, String headline, String comment) {
		super();
		this.reviewId = reviewId;
		this.rating = rating;
		this.headline = headline;
		this.comment = comment;
	}
	public Review() {
		super();
	}
	public Integer getReviewId() {
		return reviewId;
	}
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((headline == null) ? 0 : headline.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((reviewId == null) ? 0 : reviewId.hashCode());
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
		Review other = (Review) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (headline == null) {
			if (other.headline != null)
				return false;
		} else if (!headline.equals(other.headline))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (reviewId == null) {
			if (other.reviewId != null)
				return false;
		} else if (!reviewId.equals(other.reviewId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", rating=" + rating + ", headline=" + headline + ", comment=" + comment
				+ "]";
	}
	

}
