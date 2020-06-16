package com.bta;

import com.bta.dao.Dao;
import com.bta.dao.UserAccountDao;
import com.bta.model.UserAccount;

public class Main {
    public static void main(String[] args) {

        Dao userAccountDao = new UserAccountDao();

        final UserAccount userAccount = new UserAccount("Ivcan",
                "password",
                "ivan@mail.ru",
                88l,
                "Ivan",
                "Ivanov");

        //userAccountDao.save(userAccount);
        userAccount.setId((long) 1);
        userAccount.setFirstName("Kirill");
        userAccountDao.update(userAccount);



        //    final List<Country> countries = findAllCountries();
        //    System.out.println(countries);
        //     System.out.println("-------------------------------------------------------------");
        //     final List<Cityzen> cityzens = findAllCityzens();
        //    System.out.println(cityzens);

        // Country countryToInsert = new Country("Norway2", 1300, 5_000_000, "Very rich country");
        // insertCountry(countryToInsert);

        //  final List<Country> countriesAfterInsert = findAllCountries();
        //  System.out.println(countriesAfterInsert);


        //       Auto autoToInsert = new Auto(1002, "BMW", 1800, "RED", 20000);
        //     final List<Auto> carsList = findAllCars();
        //             System.out.println(carsList);
    }


//    public static void removeCountry(Country country){
//        final String sql =
//    }


}