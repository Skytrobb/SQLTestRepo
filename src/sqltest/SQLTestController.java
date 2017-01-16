/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqltest;

import java.sql.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class SQLTestController implements Initializable { 
    
  Connection conn = null;
  ResultSet rs = null;
  PreparedStatement pst = null;
  Statement stmt = null;
    
  int ABVFieldInt;
  String SQLsubmit = new String();
  String sql = new String();
   String BrandFieldString = new String();
   String TypeFieldString = new String();
    @FXML
    private TextField BrandField;
    
    @FXML
    public Text StatusText;
    
    @FXML
    private TextField TypeField;
    
    @FXML
    private TextField ABVField;
    
    
    public void SubmitButtonClick(ActionEvent event) throws SQLException {
        
        BrandFieldString = BrandField.getText();
        
        TypeFieldString = TypeField.getText();
        
        ABVFieldInt = Integer.valueOf(ABVField.getText());
        
      SQLsubmit =("INSERT INTO Beer VALUES (" + BrandFieldString + "," + TypeFieldString + "," + ABVFieldInt + ");");
      StatusText.setText("Inserting records into the table...");
      stmt = conn.createStatement();
      
      sql = "INSERT INTO Beer VALUES (\""+BrandFieldString+ "\",\""+TypeFieldString+ "\",\""+ABVFieldInt+ "\");";
      stmt.executeUpdate(sql); 
      stmt.close();
      conn.close();
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       conn = SQLTestConn.ConnecrDb(); 
    }
}
