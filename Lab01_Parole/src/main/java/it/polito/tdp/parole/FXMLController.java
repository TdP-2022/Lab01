/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.parole;
import it.polito.tdp.parole.model.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCancella"
    private Button btnCancella; // Value injected by FXMLLoader

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="txtTempo"
    private TextArea txtTempo; // Value injected by FXMLLoader

    
    Parole elenco;

    @FXML
    void doInsert(ActionEvent event) {
    	elenco.addParola(txtParola.getText());
    	int cnt = 0;
    	for(String s : elenco.getElenco()) {
    		if(cnt==0) {
    			txtResult.setText(s);
    			cnt++;
    		}
    		else
    			txtResult.appendText(" "+s);
    	}
    	
    	txtParola.clear();
    	txtTempo.setText("TimeStamp: "+System.nanoTime());
    }

    @FXML
    void doReset(ActionEvent event) {
    	//System.out.println("ecco: "+txtResult.getSelectedText()); //da eliminare
    	elenco.reset();
    	txtResult.clear();
    	
    	txtTempo.setText("TimeStamp: "+System.nanoTime());
    	
    }
    
    @FXML
    void doRemove(ActionEvent event) {
    	elenco.remove(txtResult.getSelectedText());
    	int cnt = 0;
    	for(String s : elenco.getElenco()) {
    		if(cnt==0) {
    			txtResult.setText(s);
    			cnt++;
    		}
    		else
    			txtResult.appendText(" "+s);
    	}
    	
    	txtParola.clear();
    	txtTempo.setText("TimeStamp: "+System.nanoTime());
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole();
    }


}
