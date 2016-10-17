/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Lindsey
 */

public class Main {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
          
        
        // Instantiate and initialize PresidentsDrvr with an array size of 44
        PresidentsMDrvr presidentsDrvr;
        presidentsDrvr = new PresidentsMDrvr(44);
        
        // Create objects to read an input file
        FileReader fr = new FileReader("Presidents.txt");
        BufferedReader br = new BufferedReader(fr);
        
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
            presidentsDrvr.insert(number, name, code, term, party, state);
            inputString = br.readLine();
        } // End while loop
        br.close();
        
        
        System.out.println("Presidents Array");
        presidentsDrvr.display();
        
        System.out.println("Sorted Presidents Array");
        presidentsDrvr.bubbleSort();
        presidentsDrvr.display();
        
        System.out.println("Results of Sequential Search on Party");
        presidentsDrvr.sequentialSearch();
        
        presidentsDrvr.sortByName();
        presidentsDrvr.display();
        
        presidentsDrvr.myBinarySearch();
        
        
    } // End main() method
} // End class Main

        
    

