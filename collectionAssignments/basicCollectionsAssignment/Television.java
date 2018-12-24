package com.basicCollectionsAssignment;

public class Television {

	private String company;
	private String type;
	private boolean enabled3D;
	private double price;

	public Television(String company, String type, boolean enabled3D,
			double price) {
		this.company = company;
		this.type = type;
		this.enabled3D = enabled3D;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public boolean isEnabled3D() {
		return enabled3D;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + (enabled3D ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (enabled3D != other.enabled3D)
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type
				+ ", enabled3D=" + enabled3D + ", price=" + price + "]";
	}

}
