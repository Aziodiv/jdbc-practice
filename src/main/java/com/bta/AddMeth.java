package com.bta;

import com.bta.dao.UserAccountDao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class AddMeth  {

    public static void insertCountry(Country country) {
        final String sql = String.format("INSERT INTO country (id, name, population, year_establis, description)" +
                        " values (nextval('country_seq'), '%s', %d, %d, '%s')",
                country.getName(),
                country.getPopulation(),
                country.getYearEstablish(),
                country.getDescription());
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
        ) {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertCar(Auto auto) {
        final String sql = String.format("INSERT INTO car (id, model, weight, color, price)" +
                        " values %d, '%s', %d,'%s',%d,)",
                auto.getId(),
                auto.getModel(),
                auto.getWeight(),
                auto.getColor(),
                auto.getPrice());
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
        ) {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected static Connection getConnection() throws SQLException {
        Properties properties = getConnectionProperties();
        return DriverManager.getConnection(
                properties.getProperty("db.url"),
                properties.getProperty("db.username"),
                properties.getProperty("db.password"));
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
}
