package edu.nju.ar.model;

public class session {
    int id;
	int cinemaId;
	int movieId;
	String hall;
	String date;
	String startAt;
	String endAt;
	double price;

	public int getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(int cid) {
		this.cinemaId = cid;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int mid) {
		this.movieId = mid;
	}
	public String getHall() {
		return hall;
	}
	public void setHall(String hall) {
		this.hall = hall;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartAt() {
		return startAt;
	}
	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}
	public String getEndAt() {
		return endAt;
	}
	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}
	
	
}
