package by.epam.country.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
	private String countryName;
	private double areaCountry;
	private List<Region> regions;

	public Country() {

	}

	public Country(String countryName) {
		this.countryName = countryName;
	}

	public Country(String countryName, double areaCountry) {
		this.countryName = countryName;
		this.areaCountry = areaCountry;
		this.regions = new ArrayList<>();
	}

	public Country(String countryName, double areaCountry, List<Region> regions) {
		this.countryName = countryName;
		this.areaCountry = areaCountry;
		this.regions = new ArrayList<>();
	}

	public void addRegion(Region region) {
		if(regions==null) {
			regions=new ArrayList<>();
		}
		regions.add(region);
	}

	public void remove(Region region) {
		regions.remove(region);
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getAreaCountry() {
		return areaCountry;
	}

	public void setAreaCountry(double areaCountry) {
		this.areaCountry = areaCountry;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaCountry, countryName, regions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Double.doubleToLongBits(areaCountry) == Double.doubleToLongBits(other.areaCountry)
				&& Objects.equals(countryName, other.countryName) && Objects.equals(regions, other.regions);
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", areaCountry=" + areaCountry + ", regions=" + regions + "]";
	}

}
