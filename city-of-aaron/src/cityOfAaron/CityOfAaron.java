/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cityOfAaron;

import model.Game;
import model.Player;
import model.Storehouse;
import model.Map;
import model.Animal;
import model.Author;
import model.Condition;
import model.InventoryItem;
import model.ItemType;
import model.Provisions; 
import model.Location;
import model.Point;

/**
 *
 * @author ethanrusson
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game theGame = new Game();
            theGame.setThePlayer(new Player());
            theGame.setTheMap(new Map());
            theGame.setTheStorehouse(new Storehouse());
            theGame.setCurrentPopulation(105);
            theGame.setAcresOwned(2000);
            theGame.setWheatInStorage(15000);
            theGame.setCurrentYear(1);
        Map theMap = new Map();
            theMap.setCurrentLocation(new Point());
        Storehouse theStorehouse = new Storehouse();
            theStorehouse.setAuthor(new Author[2]);
            theStorehouse.setAnimals(new InventoryItem[2]);
            theStorehouse.setTools(new InventoryItem[2]);
            theStorehouse.setProvisions(new InventoryItem[2]);
        Location theLocation = new Location();
            theLocation.setDescription(new String());
            theLocation.setName(new String());
            theLocation.setMapSymbol(new String());
            theLocation.setGameTips(new String[2]);
        Animal theAnimal = new Animal();
            theAnimal.setName(new String());
            theAnimal.setAge(5);
        Author theAuthor = new Author();
            theAuthor.setName(new String());
            theAuthor.setTitle(new String());
        InventoryItem theInventory = new InventoryItem();
            theInventory.setCondition(Condition.Good);
            theInventory.setItemType(ItemType.Animal);
            theInventory.setQuantity(4);
        Provisions theProvisions = new Provisions();
            theProvisions.setName(new String());
            theProvisions.setPerishable(true);
        System.out.println(theGame.toString());
        System.out.println(theAnimal.toString());
        System.out.println(theAuthor.toString());
        System.out.println(theInventory.toString());
        System.out.println(theProvisions.toString());
        System.out.println(theLocation.toString());
        System.out.println(theStorehouse.toString());
        System.out.println(theMap.toString());
    }
    
}
