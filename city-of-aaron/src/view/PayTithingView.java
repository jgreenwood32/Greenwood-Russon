
package view;

import cityOfAaron.CityOfAaron;
import java.util.Scanner;
import model.Game;
import model.Player;



/**
 *
 * @author kanderson
 */
public class PayTithingView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public PayTithingView(){
        
        message = "The Lord has commanded that we pay 10% of our gains in Tithing.\n"
                + "This is not required, but remember that the Lord has promised\n"
                + "that those who are obedient will prosper in the land.";
                
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
        
        inputs[0] = getUserInput("If you wish to pay tithing, you may choose\n"
                + "to pay between 8 and 12 percent of your earnings this year.\n"
                + "Please enter a whole number that is at >7 and <12.\n\n"
                + "If you have changed your mind, simply enter nothing\n"
                + "and you will be returned to the Game Menu.", true);
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        
        // return false if you want this view to exit and return
        // to the view that called it.
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("No value entered. Returning to the Game Menu...");
            return false;
        }
        
        int percentage = Integer.parseInt(inputs[0]);	
        
        if (percentage < 8 || percentage > 12) {
            System.out.println("Incorrect value. Tithing not paid, please try again.\n"
                    + "Returning to the Game Menu...");
            return false;
        }
        
        calcTithingPaid(percentage);
        
        return false;
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
    
    
    private void calcTithingPaid(int percentage) {
        
        System.out.println("Entered Tithing percentage will be saved and used to\n"
            + "calculate how much tithing is coming out of your inventory.\n");
    }
}
