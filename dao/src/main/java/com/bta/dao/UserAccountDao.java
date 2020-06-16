package com.bta.dao;

import com.bta.Country;
import com.bta.model.UserAccount;

import java.sql.*;
import java.util.List;

public class UserAccountDao extends AbstractDao {
    @Override
    public void save(UserAccount userAccount) {
        final String sql = "INSERT INTO user_account (id, username, password, email, tax_number, first_name, last_name)" +
                " values (nextval('user_account_seq'),           ?,            ?,        ?,          ?,            ?,         ?)";

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)
        ) {

            statement.setString(1, userAccount.getUsername());
            statement.setString(2, userAccount.getPassword());
            statement.setString(3, userAccount.getEmail());
            statement.setLong(4, userAccount.getTaxNumber());
            statement.setString(5, userAccount.getFirstName());
            statement.setString(6, userAccount.getLastNmae());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /////////DOMA
    @Override
    public UserAccount findOne(Long id) {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM user_account where id = ?");
             ResultSet resultSet = statement.executeQuery("SELECT * FROM country")
        ) {
            statement.setLong(1, id);
            //
            while (resultSet.next()) {
                //      long id = resultSet.getLong(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                String email = resultSet.getString(4);
                long tax_number = resultSet.getInt(5);
                String first_name = resultSet.getString(6);
                String last_name = resultSet.getString(7);
                UserAccount userAccount = new UserAccount (id, username, password, email, tax_number, first_name, last_name);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userrs
    }


    @Override
    public List<UserAccount> findAll() {
        return null;
    }

    @Override
    public void update(UserAccount userAccount) {
        final String sql = "UPDATE user_account SET username = ?, password = ?, email = ?, tax_number = ?, " +
                "first_name = ?, last_name = ? " +
                "WHERE id= ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)
        ) {

            statement.setString(1, userAccount.getUsername());
            statement.setString(2, userAccount.getPassword());
            statement.setString(3, userAccount.getEmail());
            statement.setLong(4, userAccount.getTaxNumber());
            statement.setString(5, userAccount.getFirstName());
            statement.setString(6, userAccount.getLastNmae());
            statement.setLong(7, userAccount.getId());


            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(UserAccount userAccount) {

    }


}
