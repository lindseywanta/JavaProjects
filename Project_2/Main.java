
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lindsey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        
        StackP stack = new StackP();
        Queue myQueue = new Queue();                                  
        
        // Create objects to read an input file
        FileReader fr = new FileReader("Presidents.txt");
        BufferedReader br = new BufferedReader(fr);
        
        // Read Update file
        FileReader fr2 = new FileReader("Update.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        
        // Declare the variables needed for parsing
        int number, term;
        String name, code, party, state;
        String inputString;
        
                
        // Read one record from the input file
        inputString = br.readLine();
        
        // Parse data
        while (inputString != null){
            number = Integer.parseInt(inputString.substring(0, 2).trim());
            //System.out.println("Number read in was: " + number);
            name = inputString.substring(2, 25).trim();
            //System.out.println("Name read in was: " + name);
            code = inputString.substring(25, 27).trim();
            //System.out.println("Code read in was: " + code);
            term = Integer.parseInt(inputString.substring(27, 29).trim());
            //System.out.println("Term read in was: " + term);
            party = inputString.substring(29, 49).trim();
            //System.out.println("Party read in was: " + party);
            state = inputString.substring(49, inputString.length());
            //System.out.println("State read in was: " + state);
            //System.out.println("");
            stack.push(new Presidents(number, name, code, term, party, state));
            inputString = br.readLine();
        } // End while loop
        br.close();
        
        //Creat new Queues for each Party   
        Queue queDem = new Queue();
        Queue queRep = new Queue();
        Queue queWhig = new Queue();
        
        while(stack.isEmpty()!= true)                                       //While stack is not empty
            {
                Presidents temp = stack.pop();
                if(temp.getParty().compareTo("Democrat") == 0)              //If read as "Democrat
                {
                    queDem.insert(temp);                                    //Insert in Democrat Queue

                }
                else if(temp.getParty().compareTo("Republican") ==0)        //If read as "Republican"
                {
                    queRep.insert(temp);                                    //Insert in Republican Queue
                }
                else if(temp.getParty().compareTo("Whig") ==0)              //If read as "Whig"
                {
                    queWhig.insert(temp);                                   //Insert in Whig Queue
                    }
                else{
                   // System.out.println("Bad Data");
                }
            }
        
        System.out.println("Queue 1: Democrats");                           //Queue 1 Democrats Header
        System.out.println("");
        queDem.display();                                                   //Display Regular Democrat Queue
        
        System.out.println("");
        System.out.println("");
        System.out.println("Queue 2: Republicans");                         //Queue 2 Republican Header
        System.out.println("");
        queRep.display();                                                   //Display Regular Republican Queue
        
        System.out.println("");
        System.out.println("");
        System.out.println("Queue 3: Whigs");                               //Queue 3 Whigs Header
        System.out.println("");
        queWhig.display();                                                  //Display Regular Whig Queue
        
        
        System.out.println("");
        System.out.println("");
        queDem.sort();                                                      //Sort Democrat Queue
        System.out.println("");
        queRep.sort();                                                      //Sort Republican Queue
        queWhig.sort();                                                     //Sort Whigs Queue
        
        
        System.out.println("Sorted Queue");                                 //Sorted Queue Header
        System.out.println("");
        queDem.display();                                                   //Display Sorted Democrats Queue
        System.out.println("");
        queRep.display();                                                   //Display Sorted Republicans Queue
        System.out.println("");
        queWhig.display();                                                  //Display Sorted Whig Queue
        
        
        // Read one record from the input file
        inputString = br2.readLine();
        
        // Parse data
        while (inputString != null){
            
            String data[] = inputString.split("\t");
            if(data.length > 2)
            {
                number = Integer.parseInt(data[0].trim());
            //System.out.println("Number read in was: " + number);
                name = data[1].trim();
            //System.out.println("Term read in was: " + term);
                party =  data[2].trim();
            //System.out.println("Party read in was: " + party);
            //System.out.println("State read in was: " + state);
            //System.out.println("");
                stack.push(new Presidents(number, name, party));
                inputString = br2.readLine();
            }
        } //End while loop
        br2.close();
        
                                                                            //Display Updated Stack
        System.out.println("");
        System.out.println("");
        System.out.println("Input Stack For Updating Priority Queues");     //Header for Update Priority Queue
        System.out.println("");
        System.out.println("Number    Name"+"                Party");       //Header for number, name, party in updated queue
        System.out.println("");
        stack.display();
        
        while(stack.isEmpty()!= true)                                       //While Stack not empty
            {
                Presidents temp = stack.pop();
                if(temp.getParty().compareTo("Democrat") ==0)              //If matches "Democrat"
                {           
                    queDem.insertCorrect(temp);                             //Put in with Democrats
                }
                else if(temp.getParty().compareTo("Republican") ==0)        //If matches "Republican"
                {
                    queRep.insertCorrect(temp);                             //Put with Republicans
                }
                else if(temp.getParty().compareTo("Whig") ==0)              //If matches "Whig"
                {
                    queWhig.insertCorrect(temp);                            //Put with Whig
                    }
                else{
                    //System.out.println("Bad Data");                       //If no matches would print "Bad Data"
                }
            }
        System.out.println("");
        System.out.println("");
        System.out.println("Updated Priority Queue");                       //Priority Queue Header
        
        
        System.out.println("");
        queDem.display();                                                   //Queue 1 Democrats- Displays
        
        System.out.println("");
        queRep.display();                                                    //Queue 2 Republicans- Displays
        
        System.out.println("");
        queWhig.display();                                                  //Queue 2 Whigs- Displays
        
    }//end main
    
    }//end Main Class
    
        
   
    
    
