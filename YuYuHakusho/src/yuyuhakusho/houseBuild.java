/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuyuhakusho;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dugou
 */
public class houseBuild {

    int choice;
    String bag;
    String userName;
    
    public void name(){
        userName = JOptionPane.showInputDialog(null, "What is your name? ");
}
    public void bookBag(String item){
        bag = item;
}
    public void exit () {
       if (bag == "attic Key") {
           int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit the terror?");
           if (choice == 0) {
               JOptionPane.showMessageDialog(null, "You have exited the tower. Thanks for playing!");
               System.exit(0);
           }
           } else {
               JOptionPane.showMessageDialog(null,"You do not have the required key to exit the tower.");
               firstFloor();
           }
       }
   
    
    public void firstFloor() {
       JOptionPane.showMessageDialog(null, userName + " , you are on the first floor");
       int value = JOptionPane.showConfirmDialog(null, "Do you want to go to the elevator?");
       if (value == 0) {
           elevator();
       } else {
           //terminate("First Floor");
       }
   }

    

    public void elevator() {
        name();
   String[] elevatorButtons = {"0Basement", "0.5Lobby", "1Living Room", "2Dining Room", "3Kitchen", "4Pantry", "5Bathroom", "6Bedroom 1", "7Bedroom 2", "8Second bathroom", "9Master Bedroom", "10Master Bathroom", "11Attic"};
   //int floorOptions = JOptionPane.showOptionDialog(null, "Select a floor to go to", "Elevator", 0, JOptionPane.INFORMATION_MESSAGE, null, elevatorButtons, elevatorButtons[0]);
   String floorOptions = (String) JOptionPane.showInputDialog(null, "Select a floor to go to", "Elevator", JOptionPane.QUESTION_MESSAGE, null, elevatorButtons, elevatorButtons[1]);
   switch (floorOptions) {
       case "0Basement":
           basement();
           System.out.println("basement"); 
           break;
       case "0.5Lobby":
           firstFloor();
           System.out.println("Lobby");
           break;
       case "1Living Room":
           livingRoom();
           System.out.println("living room"); 
           break;
       case "2Dining Room":
           diningroom();
           System.out.println("dining room"); 
           break;
       case "3Kitchen":
           kitchen();
           System.out.println("Kitchen"); 
           break;
       case "4Pantry":
           pantry();
           System.out.println("Pantry"); 
           break;
       case "5Bathroom":
           bathroom();
           System.out.println("Bathroom"); //GMONEY
           break;
       case "6Bedroom 1":
           bedroom1();
           System.out.println("Bedroom 1"); //AARON
           break;
       case "7Bedroom 2":
           bedroom2();
           System.out.println("Bedroom 2"); //AARON
           break;
       case "8Second bathroom":
           bathroom2();
           System.out.println("Second Bathroom"); //G
           break;
       case "9Master Bedroom":
           masterBedroom();
           System.out.println("Master Bedroom"); //J	                     
           break;
       case "10Master Bathroom":
           masterBathroom();
           System.out.println("Master Bathroom"); //PAOLA
           break;
       case "11Attic":
           attic();
           System.out.println("Attic"); 
           break;
   }
}
    public int exploreOrGo(String presentLocation) {
   String [] options = {"Go back to an elevator", "Explore the objects"};
   choice = JOptionPane.showOptionDialog(null, "Do you want to explore object(s) in the " + presentLocation + " or go back to the elevator", "Explore or Change Floors", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
   return choice;
}

    public void basement(){ //
        
        exploreOrGo("Basement");
        if(choice == 0){
            elevator();
        }else{
        String path[] = {"Storage Room", "Boiler Room", "Elevator"};
        int position = JOptionPane.showOptionDialog(null, "Which room would you like to "
                + "enter?", "Basement", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, null, path, null);
        if(position == 0){
            storageRoom();
        }else if(position == 1){
            boilerRoom();
        }else if(position == 2){
            elevator();
            }
        }
    }
    public void boilerRoom(){
      for(int i = 0; i <=3; ++i){
        JOptionPane.showMessageDialog(null, "Are you sure you want to do this?");
    }   
    String [] path = {"Storage Room", "Boiler Room", "Elevator"};
    JOptionPane.showMessageDialog(null, userName + " has died in " + path[1]);
    System.exit(0);
    }
            
    public void storageRoom(){
        JOptionPane.showMessageDialog(null, "You have entered the storage room.");
        exploreOrGo("Storage Room");
        if(choice == 0){
            elevator();
        }else{ 
        String pick[] = {"Blue Chest", "Red Chest"};
        int choice = JOptionPane.showOptionDialog(null, "You have found 2 chest boxes. "
                + "Which one would you like to open? Choose wisely.", "Basement", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, null, pick, null);
        if(choice == 0){ 
           bookBag("Attic Key");
           JOptionPane.showMessageDialog(null, userName + " has obtained the " + bag);
       }else if(choice == 1){
          int i = 0;
           while (i < 13){
               JOptionPane.showMessageDialog(null, "GO BACK");
               ++i;
                
           }
           JOptionPane.showMessageDialog(null, "You have been consumed by the spirit within.");
           System.exit(0);
         }     
       } 
    }
    public void diningroom(){
        JOptionPane.showMessageDialog(null, "You have entered the Dining room.");
      exploreOrGo("Dining Room");
        if(choice == 0){
            elevator();      
        }else{ 
        String [] choose = {"Table", "Cabinet"};
       int position = JOptionPane.showOptionDialog(null, "Would you like to sit at the table or "
                + "open the cabinet?", "Dining Room", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, null, choose, null);
        if(position == 0){
           JOptionPane.showMessageDialog(null, "You are sitting at the table and decided to open up a bag of chips.");
           int i = 0;
           do{
            JOptionPane.showMessageDialog(null, "You ate a chip.");
             ++i;
           }while(i <5);
           JOptionPane.showMessageDialog(null, "You threw up eating too many chips.");
           
           JOptionPane.showMessageDialog(null, userName + " died in the dining room");
           System.exit(0);
        }else if(position == 1){
            JOptionPane.showMessageDialog(null, "You proceed towards the cabinets.");
            
            JOptionPane.showMessageDialog(null, "Dishes and glass begin flying out of the cabinets." + "\n"
               + "You get hit in the head and feel yourself start drifting towards a light");
            
            JOptionPane.showMessageDialog(null, userName + " died in the dining room");
            System.exit(0);
        } 
    }
    } 
  
    /*Attic method includes options such as the chest and elevator. In form of if for the users Choices including JOptionPane
    We need to add ImageIcon to JOptionPane for dialog boxes.*/
    public void attic(){
        exploreOrGo("Attic");
        if(choice ==0){
            elevator();
            
        } else{
       String atticObjects[]= {"Chest"};
       int atticOptions =JOptionPane.showOptionDialog(null,"Do you want to explore the attic or leave?","Attic", 0,JOptionPane.INFORMATION_MESSAGE, null, atticObjects,atticObjects[0]);
        if(atticOptions==0){
               JOptionPane.showMessageDialog(null, "You discover the attic key!!!!!","", JOptionPane.INFORMATION_MESSAGE);
               bag = "attic Key";
                }
              
        }
      }
     /*This is living room method contains the ability to back track in the if else statement the method.
    In the if statement brackets contains exploreOrGo method to backtrack. We also need add imageicon for deathroom object hasn't*/
    public void livingRoom(){
        exploreOrGo("Living room");
        if(choice ==0){
            elevator();
            
        } else{
            String livingRoomObjects []= {"Chest"};
            ImageIcon deathroom = new ImageIcon("blank");
            int livingRoomOptions = JOptionPane.showOptionDialog(null, "Select object to explore in the living room", "Living Rooming", 0,JOptionPane.INFORMATION_MESSAGE, null, livingRoomObjects, livingRoomObjects[0]);
                if(livingRoomOptions==0){
                    JOptionPane.showMessageDialog(null, "When you open the chest and phantom grabs you in the chest.","", JOptionPane.INFORMATION_MESSAGE,deathroom);
                    bag ="Chest";
                    //terminate("Living room");
                }
        
        }
        }

    public void pantry() {
   exploreOrGo("Pantry");
   if (choice == 0) {
       elevator();
   }
   else {
       String [] pantryObjects = {"Broom", "Dusty Recipe Box"};
       int options = JOptionPane.showOptionDialog(null, "Select an object to explore", "Inside Kitchen", 0, JOptionPane.INFORMATION_MESSAGE, null, pantryObjects, pantryObjects[0]);
       if (options == 0) {
           JOptionPane.showMessageDialog(null, "You found a slim THICC witch riding a broom");
           bag = "Broom";
       } else {
           JOptionPane.showMessageDialog(null, "When you opened the cabinet's door, the dishes and glasses started flying at you. You got hit in the head!");
           bag = "Dusty Recipe Box";
       }
   }
}

    public void masterBathroom(){
    exploreOrGo("Master Bathroom");
   if (choice == 0) {
       elevator();
   }
   else {
       String [] masterBathroomObjects = {"Shower Faucet", "Mirror"};
       int options = JOptionPane.showOptionDialog(null, "Select an object to explore", "Inside Master Bathroom", 0, JOptionPane.INFORMATION_MESSAGE, null, masterBathroomObjects, masterBathroomObjects[0]);
       if (options == 0) {
           JOptionPane.showMessageDialog(null, "The shower faucet starts spewing blood as soon as it is turned on.You slip on the blood and smash your head against the ground.");
           bag = "Shower Faucet";
       } else {
           JOptionPane.showMessageDialog(null, "When you look in the mirror, a face appears out of nowhere! A hand escapes the mirror and drags you in. You are never heard from again.");
           bag = "Mirror Shard";
       }
   }
}
    public void masterBedroom() {
   exploreOrGo("Master Bedroom");
   if (choice == 0) {
   	elevator();
   }
   else {
   	String [] masterBedroomObjects = {"Radio", "Television"};
   	int options = JOptionPane.showOptionDialog(null, "Select an object to explore", "Inside Master Bedroom", 0, JOptionPane.INFORMATION_MESSAGE, null, masterBedroomObjects, masterBedroomObjects[0]);
   	if (options == 0) {
       	JOptionPane.showMessageDialog(null, "When you turn the radio on, there is all static until it blows your eardrums.");
       	bag = "Radio";
   	} else {
       	JOptionPane.showMessageDialog(null, "When TV is turned on, Ghost walks out the TV and scares you to death.");
       	bag = "Television";
   	}
   }
    }
   
    public void bathroom(){
               exploreOrGo("Bathroom");
           if(choice==0){
                elevator();
             }else{
                 
                String bathRoomObjects[] ={"Mirror", "Shower"};
                        ImageIcon ddd = new ImageIcon("");
                        int bathRoomOptions = JOptionPane.showOptionDialog(null, "Select object to explore in the bathroom", "Bathroom", 0,JOptionPane.INFORMATION_MESSAGE, null, bathRoomObjects, bathRoomObjects[0]);
                            if(bathRoomOptions==0){
                                JOptionPane.showMessageDialog(null, "You stare at the mirror looking into the abyss of a souless girl.","", JOptionPane.INFORMATION_MESSAGE, ddd);
                            }else{
                                    ImageIcon bloodMirror = new ImageIcon("");
                                        JOptionPane.showMessageDialog(null, "You step into the shower to wash the blood off your "
                                                + "face when suddenly you feel a hand wrap around your neck.","", JOptionPane.INFORMATION_MESSAGE,bloodMirror);
                                                
            
        }
        }
           } 

    public void bathroom2(){
               exploreOrGo("Second Bathroom");
           if(choice ==0){
                elevator();
             }else{
                 
                String bathRoomObjects[] ={"Mirror", "Shower"};
                        ImageIcon ddd = new ImageIcon("");
                        int bathRoomOptions = JOptionPane.showOptionDialog(null, "Select object to explore in the bathroom", "Bathroom", 0,JOptionPane.INFORMATION_MESSAGE, null, bathRoomObjects, bathRoomObjects[0]);
                            if(bathRoomOptions==0){
                                JOptionPane.showMessageDialog(null, ".","", JOptionPane.INFORMATION_MESSAGE, ddd);
                            }else{
                                    ImageIcon bloodMirror = new ImageIcon("");
                                        JOptionPane.showMessageDialog(null, "See a bloody face looking back at you","", JOptionPane.INFORMATION_MESSAGE,bloodMirror);
                                                
            
        }
        }
           } 

    public void kitchen() {
       exploreOrGo("Kitchen");
       if (choice == 0) {
           elevator();
       }
       else {
           String [] kitchenObjects = {"Refrigerator", "Cabinet"};
           int kitchenOptions = JOptionPane.showOptionDialog(null, "Select an object to explore", "Inside Kitchen", 0, JOptionPane.INFORMATION_MESSAGE, null, kitchenObjects, kitchenObjects[0]);
           if (kitchenOptions == 0) {
               JOptionPane.showMessageDialog(null, "When you opened the refrigerator, you found nice, cold blood to drink.");
               bag = "Refrigerator";
           } else {
               JOptionPane.showMessageDialog(null, "When you opened the cabinet's door, the dishes and glasses started flying at you. You got hit in the head!");
               bag = "Cabinet";
           }
           //terminate("Kitchen");
       }
   }

    public void bedroom1 () {
       exploreOrGo("Bedroom 1");
       if (choice == 0) {
           elevator();
       }
       else {
           String [] bedroom1Objects = {"Baby Crib", "Book"};
           int options = JOptionPane.showOptionDialog(null, "Select an object to explore", "Inside Bedroom 1", 0, JOptionPane.INFORMATION_MESSAGE, null, bedroom1Objects, bedroom1Objects[0]);
           if (options == 0) {
               JOptionPane.showMessageDialog(null, "You hear a baby crying, but see a ghostly man");
               bag = "Baby Crib";
           } else {
               JOptionPane.showMessageDialog(null, "When you opened the book, you read a story written by a girl who committed suicide!");
               bag = "Book";
           }
       }
   }

    public void bedroom2 () {
       exploreOrGo("Bedroom 2");
       if (choice == 0) {
           elevator();
       }
       else {
           String [] bedroom2Objects = {"Doll", "Bed Sheets"};
           int options = JOptionPane.showOptionDialog(null, "Select an object to explore", "Inside Bedroom 1", 0, JOptionPane.INFORMATION_MESSAGE, null, bedroom2Objects, bedroom2Objects[0]);
           if (options == 0) {
               JOptionPane.showMessageDialog(null, "You hear a baby crying, but see a ghostly man");
               bag = "Baby Crib";
           } else {
               JOptionPane.showMessageDialog(null, "When you opened the book, you read a story written by a girl who committed suicide!");
               bag = "Book";
           }
       }
   }
    
}
