package by.epam.country.main;

import by.epam.country.entity.City;
import by.epam.country.entity.Country;
import by.epam.country.entity.District;
import by.epam.country.entity.Region;
import by.epam.country.logic.CountryLogic;
import by.epam.country.view.View;

/*Создать объект класса Государство, используя классы Область,Район,Город.Методы: вывести на консоль столицу,
 * количество областей, площадь, областные центры. */

public class Main {

	public static void main(String[] args) {
		Country country = new Country("USA");
		CountryLogic countryLogic = new CountryLogic();
		View view = new View();

		country.addRegion(new Region("Alabama"));
		// System.out.println(country.getRegions());
		country.getRegions().get(0).addDistrict(new District("Baldwin", 5.250, new City("Bay Minette", "city")));
		country.getRegions().get(0).addDistrict(new District("Calhoun", 4.300, new City("Anniston", "city")));
		country.getRegions().get(0).addDistrict(new District("Dale", 5.600, new City("Ozark", "city")));
		country.getRegions().get(0)
				.addDistrict(new District("Montgomery", 3.000, new City("Montgomery", "capital city of the state")));
		country.getRegions().get(0).addDistrict(new District("Jackson", 4.500, new City("Scottsboro", "city")));
		country.getRegions().get(0).setAreaRegion(countryLogic.calculatingAreaRegion(country.getRegions().get(0)));

		country.addRegion(new Region("California"));
		country.getRegions().get(1).addDistrict(new District("Orange", 5.250, new City("Santa Ana", "city")));
		country.getRegions().get(1).addDistrict(new District("Butte", 4.300, new City("Chico", "city")));
		country.getRegions().get(1).addDistrict(new District("Fresno", 5.600, new City("Fresno", "city")));
		country.getRegions().get(1)
				.addDistrict(new District("Sacramento", 3.000, new City("Sacramento", "capital city of the state")));
		country.getRegions().get(1).addDistrict(new District("Mendocino", 4.500, new City("Mendocino", "city")));
		country.getRegions().get(1).setAreaRegion(countryLogic.calculatingAreaRegion(country.getRegions().get(0)));

		country.addRegion(new Region("Delaware"));
		country.getRegions().get(2)
				.addDistrict(new District("Kent", 2.000, new City("Dover", "capital city of the state")));
		country.getRegions().get(2).addDistrict(new District("New Castle", 2.000, new City("Wilmington", "city")));
		country.getRegions().get(2).addDistrict(new District("Sussex", 2.000, new City("Salisbury", "city")));
		country.getRegions().get(2).setAreaRegion(countryLogic.calculatingAreaRegion(country.getRegions().get(0)));

		country.addRegion(new Region("Georgia"));
		country.getRegions().get(3).addDistrict(new District("Harris", 2.900, new City("Columbus", "city")));
		country.getRegions().get(3)
				.addDistrict(new District("Fulton", 2.890, new City("Atlanta", "capital city of the state")));
		country.getRegions().get(3).setAreaRegion(countryLogic.calculatingAreaRegion(country.getRegions().get(0)));

		country.addRegion(new Region("Kentucky"));
		country.getRegions().get(4).addDistrict(new District("Knox", 2.900, new City("London", "city")));
		country.getRegions().get(4)
				.addDistrict(new District("Franklin", 3.900, new City("Frankfort", "capital city of the state")));
		country.getRegions().get(4).addDistrict(new District("Lincoln", 2.900, new City("Danville", "city")));
		country.getRegions().get(4).addDistrict(new District("Kenton", 5.900, new City("Cincinnati", "city")));
		country.getRegions().get(4).setAreaRegion(countryLogic.calculatingAreaRegion(country.getRegions().get(0)));

		country.addRegion(new Region("North Carolina"));
		country.getRegions().get(5).addDistrict(new District("Pamlico", 8.900, new City("New Bern", "city")));
		country.getRegions().get(5)
				.addDistrict(new District("Richmond", 3.900, new City("Rockingham", "capital city of the state")));
		country.getRegions().get(5).addDistrict(new District("Pasquotank", 2.900, new City("Elizabeth City", "city")));
		country.getRegions().get(5).setAreaRegion(countryLogic.calculatingAreaRegion(country.getRegions().get(0)));

		country.addRegion(new Region("Columbia"));
		country.getRegions().get(6).addDistrict(
				new District("District of Columbia", 0.900, new City("Washington", "capital city of the USA")));
		country.getRegions().get(6).setAreaRegion(countryLogic.calculatingAreaRegion(country.getRegions().get(0)));

		country.setAreaCountry(countryLogic.calculatingAreaCountry(country));

		view.printNameCapitalOnConsole(countryLogic.searchNameСapital("capital city of the USA", country));
		view.printRegionalCapitals(countryLogic.searchRegionalСapitals(country, "capital city of the state"));
		view.printAmountRegions(countryLogic.regionCounter(country));
		view.printAreaCountry(countryLogic.calculatingAreaCountry(country));

	}

}
