package com.basicCollectionsAssignment;

public class Laptop {
	/**
	 * class Laptop where the obects of this class are added to the set 
	 */
		private String company;
		private int model;
		private String operatingSystem;
		private String processor;
	/**
	 * 
	 * @param company
	 * @param model
	 * @param operatingSystem
	 * @param processor
	 */
		public Laptop(String company, int model, String operatingSystem, String processor) {
					this.company = company;
					this.model = model;
					this.operatingSystem = operatingSystem;
					this.processor = processor;
		}
		/**
		 * 
		 */

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((company == null) ? 0 : company.hashCode());
			result = prime * result + model;
			return result;
		}
	/**
	 * 
	 */

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Laptop other = (Laptop) obj;
			if (company == null) {
				if (other.company != null)
					return false;
			} else if (!company.equals(other.company))
				return false;
			if (model != other.model)
				return false;
			return true;
		}
	/**
	 * 
	 */
		@Override
		public String toString() {
			return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
					+ ", processor=" + processor + "]\n";
		}



}
