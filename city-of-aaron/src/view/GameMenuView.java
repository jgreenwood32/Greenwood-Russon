
package view;

import java.util.Scanner;

/**
 *
 * @author kanderson
 */
public class GameMenuView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public GameMenuView(){
        
        message = "Game Menu\n"
                + "---------\n"
                + "V - View Map\n"
                + "I - View Inventory\n"
                + "T - Pay Tithing\n"
                + "M - Move to New Location\n"
                + "N - Proceed to Next Year\n"
                + "Q - Quit\n";
                
    }
    
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Please enter the letter that matches the info\n"
                + "you would like to see.");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){

        switch (inputs[0].trim().toUpperCase()) {
            case "V":
                viewMap();
                break;
            case "I":
                viewInventory();
                break;
            case"T":
                payTithing();
                break;
            case"M":
                move();
                break;
            case"N":
                nextYear();
                break;
            case "Q":
                System.out.println("Thank you for playing!");
                return false;
        }
        
        return true;
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    

    private void viewInventory() {
        System.out.println("*** loadSavedGame() called. Implementation coming soon.");
    }

    private void viewMap() {
        System.out.println("*** loadSavedGame() called. Implementation coming soon.");
    }

    private void payTithing() {
        PayTithingView view = new PayTithingView();
        view.displayView();
    }

    private void move() {
        System.out.println("*** loadSavedGame() called. Implementation coming soon.");
    }

    private void nextYear() {
       System.out.println("*** loadSavedGame() called. Implementation coming soon.");
    }
}
