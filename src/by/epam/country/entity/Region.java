package by.epam.country.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
	private String regionName;
	private double areaRegion;
	private List<District> districts;

	public Region() {

	}

	public Region(String regionName) {
		this.regionName = regionName;
	}

	public Region(String regionName, double areaRegion) {
		this.regionName = regionName;
		this.areaRegion = areaRegion;
		this.districts = new ArrayList<>();
	}

	public Region(String regionName, double areaRegion, List<District> districts) {
		this.regionName = regionName;
		this.areaRegion = areaRegion;
		this.districts = new ArrayList<>();
	}

	public void addDistrict(District district) {
		if(districts==null) {
			districts = new ArrayList<>();
		}
		districts.add(district);
	}

	public void removeDistrict(District district) {
		districts.remove(district);
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public double getAreaRegion() {
		return areaRegion;
	}

	public void setAreaRegion(double areaRegion) {
		this.areaRegion = areaRegion;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaRegion, districts, regionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Double.doubleToLongBits(areaRegion) == Double.doubleToLongBits(other.areaRegion)
				&& Objects.equals(districts, other.districts) && Objects.equals(regionName, other.regionName);
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", areaRegion=" + areaRegion + ", districts=" + districts + "]";
	}

}
