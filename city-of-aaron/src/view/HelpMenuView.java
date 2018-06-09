
package view;

import java.util.Scanner;

/**
 *
 * @author kanderson
 */
public class HelpMenuView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public HelpMenuView(){
        
        message = "Help Menu\n"
                + "---------\n"
                + "G - What is the goal of the game?\n"
                + "M - How to move\n"
                + "E - Estimating the amount of resources\n"
                + "H - Harvesting resources\n"
                + "D - Delivering resources to warehouse\n"
                + "Q - Quit";
                
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
            case "G":
                showGoal();
                break;
            case "M":
                showMove();
                break;
            case"E":
                showResources();
                break;
            case"H":
                showHarvesting();
                break;
            case"D":
                showStorehouse();
                break;
            case "Q":
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
    
    
    private void showGoal(){
        System.out.println("The goal of City of Aaron is to keep as many people\n"
                + "fed as possible. This is achieved by successfully planting, \n"
                + "harvesting, and selling wheat.");
    }
    private void showMove(){
        System.out.println("When prompted, enter the name of the area you would\n"
                + "like to travel to.");
    }
    private void showResources(){
        System.out.println("In each round, you will be required to designate\n"
                + "the amount of food to give to your people. Every citizen\n"
                + "requires 20 bushels of wheat per year to survive. It is\n"
                + "beneficial to subtract this amount before purchasing land\n"
                + "or planting more wheat. You will also have the choice to pay\n"
                + "a percentage of your yield as tithing. The amount you choose\n"
                + "to donate does have an effect on the following year.");
    }
    private void showHarvesting(){
        System.out.println("When selecting an area to harvest from, you will\n"
                + "need to necessary tools. You will then be able to choose\n"
                + "what percentage of the available resources you would like to\n"
                + "harvest.");
    }
    private void showStorehouse(){
        System.out.println("You can access your storehouse through your\n"
                + "game menu.");
    }
}
