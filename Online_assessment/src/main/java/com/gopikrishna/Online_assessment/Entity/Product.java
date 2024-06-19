package com.gopikrishna.Online_assessment.Entity;

public class Product {
//	
	 	private String id;  // Unique identifier for the product
	    private String productName; 
	    private int price;
	    private Double rating;
	    private int discount; 
	    private boolean availability;
	    private String company; // Name of the company
	    private String category;
	    
	    
	    
	    
		public Product(String id, String productName, int price, Double rating, int discount, boolean availability,
				String company, String category) {
			super();
			this.id = id;
			this.productName = productName;
			this.price = price;
			this.rating = rating;
			this.discount = discount;
			this.availability = availability;
			this.company = company;
			this.category = category;
		}
		
		public Product() {
		
			// TODO Auto-generated constructor stub
		}

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public Double getRating() {
			return rating;
		}
		public void setRating(Double rating) {
			this.rating = rating;
		}
		public int getDiscount() {
			return discount;
		}
		public void setDiscount(int discount) {
			this.discount = discount;
		}
		public boolean isAvailability() {
			return availability;
		}
		public void setAvailability(boolean availability) {
			this.availability = availability;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", productName=" + productName + ", price=" + price + ", rating=" + rating
					+ ", discount=" + discount + ", availability=" + availability + ", company=" + company
					+ ", category=" + category + "]";
		} 
		

	    
	    
}
