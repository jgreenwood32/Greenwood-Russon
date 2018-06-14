/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cityOfAaron;

import model.Game;
import view.StartProgramView;

/**
 *
 * @author ethanrusson
 */
public class CityOfAaron {
    
    public static Game currentGame = null;
    
    public static Game getCurrentGame(){
        return currentGame;
    }
    
    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayView();
        
    }
    
}
