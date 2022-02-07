package by.epam.country.entity;

import java.util.Objects;

public class City {
	private String cityName;
	private String cityStatus;

	public City() {

	}

	public City(String cityName, String cityStatus) {
		this.cityName = cityName;
		this.cityStatus = cityStatus;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityStatus() {
		return cityStatus;
	}

	public void setCityStatus(String cityStatus) {
		this.cityStatus = cityStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cityName, cityStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityName, other.cityName) && Objects.equals(cityStatus, other.cityStatus);
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", cityStatus=" + cityStatus + "]";
	}

}
