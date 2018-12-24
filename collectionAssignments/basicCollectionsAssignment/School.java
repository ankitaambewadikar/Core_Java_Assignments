package com.basicCollectionsAssignment;

public class School {

	private String schoolName;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;

	public School(String schoolName, String city, String schoolDistrict, int greatSchoolRanking) {

		this.schoolName = schoolName;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + greatSchoolRanking;
		result = prime * result + ((schoolDistrict == null) ? 0 : schoolDistrict.hashCode());
		result = prime * result + ((schoolName == null) ? 0 : schoolName.hashCode());
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (greatSchoolRanking != other.greatSchoolRanking)
			return false;
		if (schoolDistrict == null) {
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}
}
