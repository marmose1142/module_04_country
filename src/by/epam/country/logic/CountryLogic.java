package by.epam.country.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.country.entity.City;
import by.epam.country.entity.Country;
import by.epam.country.entity.Region;

public class CountryLogic {

	public String searchNameСapital(String status, Country country) {
		String cityName = "";
		for (int i = 0; i < country.getRegions().size(); i++) {
			for (int j = 0; j < country.getRegions().get(i).getDistricts().size(); j++)
			if (status.equals(country.getRegions().get(i).getDistricts().get(j).getCity().getCityStatus())) {
				cityName = country.getRegions().get(i).getDistricts().get(j).getCity().getCityName();
			}
		}
		return cityName;
	}

	public int regionCounter(Country country) {
		return country.getRegions().size();
	}

	public double calculatingAreaRegion(Region region) {
		double areaRegion = 0.00;

		for (int i = 0; i < region.getDistricts().size(); i++) {
			areaRegion = areaRegion + region.getDistricts().get(i).getAreaDistrict();
		}
		return areaRegion;
	}

	public double calculatingAreaCountry(Country country) {
		double areaCountry = 0.00;

		for (int i = 0; i < country.getRegions().size(); i++) {
			areaCountry = areaCountry + country.getRegions().get(i).getAreaRegion();
		}

		return areaCountry;

	}

	public List<City> searchRegionalСapitals(Country country, String regionCapital) {
		List<City> listRegionalCapitals = new ArrayList<>();

		for (int i = 0; i < country.getRegions().size(); i++) {
			for (int j = 0; j < country.getRegions().get(i).getDistricts().size(); j++) {
				if (regionCapital
						.equals(country.getRegions().get(i).getDistricts().get(j).getCity().getCityStatus())) {
					listRegionalCapitals.add(country.getRegions().get(i).getDistricts().get(j).getCity());
				}
			}
		}
		return listRegionalCapitals;
	}
}
