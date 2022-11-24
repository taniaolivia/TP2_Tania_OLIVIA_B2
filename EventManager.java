/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 *
 * @author taniaolivia
 */
public class EventManager implements EventHandler<ActionEvent> //on implique EventHandler dans la classe EventManager
{
    //Les constructeurs
    private TextField theTFDiameter;
    private Text itsTF;
    private Button theBtnPerimeter;
    private Button theBtnArea;
    
    
    public EventManager(Text aTF, TextField aTFDiameter) //La méthode EventManager
    {
        this.theTFDiameter = aTFDiameter;
        this.itsTF = aTF;
    }

    /**
     *
     * @param t
     */
    
    //Question 4 : La gestionnaire d’évènements par une classe anonyme.
    @Override
    public void handle(ActionEvent t) 
    {
        double unDiametre = Double.parseDouble(theTFDiameter.getText());
        
        if(theBtnPerimeter.isPressed()) //Le cas si on clique le bouton "Calculer périmètre"
        {
                if (unDiametre >= 0) //si le diamètre rempli est égal ou supérier à 0 donc on fait les instructions au dessus
                {
                    Circle circle = new Circle(unDiametre);
                    this.itsTF.setFill(Color.BLUE); //pour afficher le couleur du texte en bleu
                    this.itsTF.setText("Périmètre " + circle.calculatePerimeter()); //pour afficher le texte et calculer le périmètre
                }
        
                else //si le diamètre rempli est inférieur à 0
                {
                    Alert alert = new Alert(AlertType.WARNING); //Pour montrer une alerte
                    alert.setTitle("ERREUR !"); //Le titre de l'alerte
                    alert.setContentText("Diamètre invalide"); //Le contenu ou l'explication d'une alerte
                    alert.showAndWait(); //pour afficher une alerte
                }
        }       
        
        if (theBtnArea.isPressed()) //Le cas si on clique le bouton "Calculer surface"
        {
                if (unDiametre >= 0) //si le diamètre rempli est égal ou supérier à 0 donc on fait les instructions au dessus
                {
                    Circle circle = new Circle(unDiametre); 
                    this.itsTF.setFill(Color.BLUE);//pour afficher le couleur du texte en bleu
                    this.itsTF.setText("Surface " + circle.calculateArea()); //pour afficher le texte et calculer la surface
                }
        
                else //si le diamètre rempli est inférieur à 0
                {
                    Alert alert = new Alert(AlertType.WARNING); //Pour montrer une alerte
                    alert.setTitle("ERREUR !"); //Le titre de l'alerte
                    alert.setContentText("Surface invalide"); //Le contenu ou l'explication d'une alerte
                    alert.showAndWait(); //pour afficher une alerte
                }
        }
    }
    
//Question 5 : La gestionnaire d’évènements par une lambda expression. 
//@Override
//    public void handle(ActionEvent t) -> {
//        double unDiametre = Double.parseDouble(theTFDiameter.getText());
        
//        if(theBtnPerimeter.isPressed()) //Le cas si on clique le bouton "Calculer périmètre"
//        {
//                if (unDiametre >= 0) //si le diamètre rempli est égal ou supérier à 0 donc on fait les instructions au dessus
//                {
//                    Circle circle = new Circle(unDiametre);
//                   this.itsTF.setFill(Color.BLUE); //pour afficher le couleur du texte en bleu
//                    this.itsTF.setText("Périmètre " + circle.calculatePerimeter()); //pour afficher le texte et calculer le périmètre
//                }
        
//                else //si le diamètre rempli est inférieur à 0
//                {
//                    Alert alert = new Alert(AlertType.WARNING); //Pour montrer une alerte
//                    alert.setTitle("ERREUR !"); //Le titre de l'alerte
//                    alert.setContentText("Diamètre invalide"); //Le contenu ou l'explication d'une alerte
//                    alert.showAndWait(); //pour afficher une alerte
//                }
//        }       
        
//        if (theBtnArea.isPressed()) //Le cas si on clique le bouton "Calculer surface"
//        {
//                if (unDiametre >= 0) //si le diamètre rempli est égal ou supérier à 0 donc on fait les instructions au dessus
//                {
//                    Circle circle = new Circle(unDiametre); 
//                    this.itsTF.setFill(Color.BLUE);//pour afficher le couleur du texte en bleu
//                    this.itsTF.setText("Surface " + circle.calculateArea()); //pour afficher le texte et calculer la surface
                        
//                else //si le diamètre rempli est inférieur à 0
//                {
//                    Alert alert = new Alert(AlertType.WARNING); //Pour montrer une alerte
//                    alert.setTitle("ERREUR !"); //Le titre de l'alerte
//                    alert.setContentText("Surface invalide"); //Le contenu ou l'explication d'une alerte
//                    alert.showAndWait(); //pour afficher une alerte
//                }
//        }
//    }
//}

}