package lk.ijse.sample.repository;

import javafx.scene.control.Alert;
import lk.ijse.sample.db.DbConnection;
import lk.ijse.sample.model.CustomerModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRepository {
   public boolean saveCustomer(CustomerModel cm) {
       try {
           Connection connection = DbConnection.getInstance().getConnection();
           String sql = "INSERT INTO customer VALUES(?,?,?,?)";
           PreparedStatement preparedStatement = connection.prepareStatement(sql);

           preparedStatement.setString(1,null);
           preparedStatement.setString(2,cm.getName());
           preparedStatement.setString(3,cm.getAddress());
           preparedStatement.setString(4,cm.getNumber());

           int affectedRow = preparedStatement.executeUpdate();
            if (affectedRow > 0) {

                return true;
            }
            return false;
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
   }

}
