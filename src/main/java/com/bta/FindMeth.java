package com.bta;

import com.bta.dao.UserAccountDao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class FindMeth  {


    public static List<Country> findAllCountries() {
        List<Country> countries = new ArrayList<>();
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM country")
        ) {
            while (resultSet.next()) {
                long id = resultSet.getLong(1);
                String name = resultSet.getString(2);
                int population = resultSet.getInt(3);
                int yearOfEstablish = resultSet.getInt(4);
                String description = resultSet.getString("description");
                Country country = new Country(id, name, yearOfEstablish, population, description);
                countries.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countries;
    }

    public static List<Cityzen> findAllCityzens() {
        List<Cityzen> cityzens = new ArrayList<>();
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM cityzen")
        ) {
            while (resultSet.next()) {
                long id = resultSet.getLong(1);
                String name = resultSet.getString(2);
                String last_name = resultSet.getString(3);
                int age = resultSet.getInt(4);
                Cityzen cityzen = new Cityzen(id, name, age, last_name);
                cityzens.add(cityzen);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cityzens;
    }

    public static List<Auto> findAllCars() {
        List<Auto> autos = new ArrayList<>();
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM auto")
        ) {
            while (resultSet.next()) {
                long id = resultSet.getLong(1);
                String model = resultSet.getString(2);
                int weight = resultSet.getInt(4);
                String color = resultSet.getString(3);
                int price = resultSet.getInt(5);
                Auto auto = new Auto(id, model, weight, color, price);
                autos.add(auto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return autos;
    }

    protected static Properties getConnectionProperties() {
        Properties properties = new Properties();
        try (InputStream inputStream = UserAccountDao.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    protected static Connection getConnection() throws SQLException {
        Properties properties = getConnectionProperties();
        return DriverManager.getConnection(
                properties.getProperty("db.url"),
                properties.getProperty("db.username"),
                properties.getProperty("db.password"));
    }

}
