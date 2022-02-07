package by.epam.country.entity;

import java.util.Objects;

public class District {
	private String districtName;
	private double areaDistrict;
	private City city;

	public District() {

	}

	public District(String districtName, double areaDistrict) {
		this.districtName = districtName;
		this.areaDistrict = areaDistrict;
		this.city = new City();
	}

	public District(String districtName, double areaDistrict, City city) {
		this.districtName = districtName;
		this.areaDistrict = areaDistrict;
		this.city = city;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public double getAreaDistrict() {
		return areaDistrict;
	}

	public void setAreaDistrict(double areaDistrict) {
		this.areaDistrict = areaDistrict;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaDistrict, city, districtName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Double.doubleToLongBits(areaDistrict) == Double.doubleToLongBits(other.areaDistrict)
				&& Objects.equals(city, other.city) && Objects.equals(districtName, other.districtName);
	}

	@Override
	public String toString() {
		return "District [districtName=" + districtName + ", areaDistrict=" + areaDistrict + ", city=" + city + "]";
	}

}
