/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbol_2018130011;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author tasya
 */
public class DBTense {
    private TenseModel dt=new TenseModel();    
    public TenseModel getTenseModel(){ return(dt);}
    public void setTenseModel(TenseModel s){ dt=s;}
    
    public ObservableList<TenseModel>  Load() {
        try {
            ObservableList<TenseModel> tableData=FXCollections.observableArrayList();
            Koneksi con = new Koneksi();            
            con.bukaKoneksi();
            con.statement = con.dbKoneksi.createStatement();
            ResultSet rs = con.statement.executeQuery("Select tense_ID,type,description,examples from tenses");
int i = 1;
            while (rs.next()) {
                TenseModel d=new TenseModel();
                d.setTense_ID(rs.getInt("tense_ID"));
                d.setType(rs.getString("type"));                
                d.setDescription(rs.getString("description"));
                d.setExamples(rs.getString("examples"));                
                      
                

                tableData.add(d);                
                i++;            
            }
            con.tutupKoneksi();            
            return tableData;
        } catch (Exception e) {            
            e.printStackTrace();            
            return null;        
        }
    }
    

    
}
