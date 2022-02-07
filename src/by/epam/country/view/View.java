package by.epam.country.view;

import java.util.List;

import by.epam.country.entity.City;

public class View {

	public void printNameCapitalOnConsole(String cityName) {
		System.out.println(cityName);
	}

	public void printAmountRegions(int amountRegion) {
		System.out.println(amountRegion);
	}

	public void printAreaCountry(double areaCountry) {
		System.out.println(areaCountry);
	}

	public void printRegionalCapitals(List<City> regionalСapitals) {
		for(City city:regionalСapitals) {
		System.out.println(city);
	}
	}
}
