/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_MODENA;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author taniaolivia
 */
public class TP2 extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        
        primaryStage.setTitle("Cercle");
        
        GridPane theGrid = new GridPane() ;//La création de la grille
        
        theGrid.setAlignment(Pos.CENTER) ; //Aligner la grille en centre
        theGrid.setHgap(10); //spéficier l'écart horizontal de grille
        theGrid.setVgap(10); //spéficier l'écart vertical de grille
        theGrid.setPadding(new Insets(25, 25, 25, 25));

        Text theText = new Text("Veuillez saisir le diamètre");
        theText.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, FontPosture.ITALIC, 20)); //spécifier le font du texte
        theGrid.add(theText, 0, 0, 2, 1); //ajouter la grille du texte

        Label theLabel = new Label("Le diamètre : ");
        theGrid.add(theLabel , 0, 1); //ajouter la grille du label

        TextField theTFDiameter = new TextField();
        theGrid.add(theTFDiameter, 1, 1); //ajouter la grille du champ du text du diamètre

        Button theBtnArea = new Button("Calculer Surface");
        theGrid.add(theBtnArea, 0, 2); //ajouter la grille du bouton surface

        Button theBtnPerimeter = new Button("Calculer Périmètre");
        theGrid.add(theBtnPerimeter , 1, 2); //ajouter la grille du bouton périmètre

        Text theTexteResult = new Text() ;
        theGrid.add(theTexteResult , 1, 3); //ajouter la grille du texte résultat

        Scene theScene = new Scene(theGrid , 350, 250); 
        primaryStage.setScene(theScene); //spécifier le scene du primaryStage
        
        EventManager theEventManager = new EventManager(theTexteResult, theTFDiameter);
        
        //Question 2 : la méthode addEventHandler
        theBtnPerimeter.addEventHandler (ActionEvent.ACTION, theEventManager);//Pour associer l’évènement« clic bouton » à la gestionnaire d’évènements
        
        //Question 3 : la méthode setOnAction du theBtnPerimeter
        theBtnPerimeter.setOnAction(theEventManager); //Pour associer l’évènement à la gestionnaire d’évènements
        
        //Question 2 : la méthode addEventHandler du theBtnArea
        theBtnArea.addEventHandler (ActionEvent.ACTION, theEventManager); //Pour associer l’évènement« clic bouton » à la gestionnaire d’évènements
        
        //Question 3 : la méthode setOnAction du theBtnArea
        theBtnArea.setOnAction(theEventManager); //Pour associer l’évènement à la gestionnaire d’évènements
        
        primaryStage.show(); //pour l'affichage du primaryStage
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
