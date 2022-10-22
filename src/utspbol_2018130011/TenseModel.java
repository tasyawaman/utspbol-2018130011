/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbol_2018130011;

/**
 *
 * @author tasya
 */
public class TenseModel {
    private int tense_ID;
    private String type, description, examples;
    
    public int getTense_ID(){
        return tense_ID;
    }
    
    public void setTense_ID(int tense_ID){
        this.tense_ID = tense_ID;
    }
    
    public String getType() {
        return type;    }
    
    public void setType(String type) {        
        this.type = type;        }
    
    public String getDescription() {
        return description;        }
    
    public void setDescription(String description) {        
        this.description = description;        }
    
    public String getExamples() {
        return examples;    
    }
    public void setExamples(String examples) {        
        this.examples = examples;        }
}
