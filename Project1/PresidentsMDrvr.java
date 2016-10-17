/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Lindsey
 */

public class PresidentsMDrvr {
    private Presidents[] myPresidents;
    private int max;
    private int nElements; 
    private String[] seqSearch = new String[7];
    private String[] binSearch = new String[6];
    private int seqSearchMaxIndex; 
    
    public PresidentsMDrvr (int max)
    { 
        myPresidents = new Presidents[max];
        nElements = 0;  
    }   // end constructor 

    public void insert(int number, String name, String code, int term, String party, String state)
    {     
        myPresidents[nElements] = new Presidents (number, name, code, term, party, state);
            nElements++;  
        // increment size
    }    
    
    public void display()                          // displays array contents
    {    
        
        System.out.println("Number Name"+"                Party");
        for(int j=0; j<nElements; j++)             // for each element,
        System.out.println(myPresidents[j]);       // display it
            System.out.println(""); 
    }// end display()
   
    public void bubbleSort()		
    {
        int out, in;
        
        for(out=nElements-1; out>1; out--)          // outer loop     
            for(in=0; in<out; in++)                 // inner loop (forward) 
                if( myPresidents[in].getNumber() > myPresidents[in+1].getNumber() )          
                    swap(in, in+1);       // swap 
    }  // end bubbleSort()
    
    private void swap(int in, int in1) {
        Presidents hold = myPresidents[in];
        myPresidents[in] = myPresidents[in1];
        myPresidents[in1] = hold;
    }
    
     
    public void sequentialSearch(){
       BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("Party.txt"));

                          String myStringOne = (String.format("%-20s%-20s%-20s", "Search Argument" , "Result", "Number of Hits"));
                              System.out.println(myStringOne);
			while ((sCurrentLine = br.readLine()) != null) {
                            int hits = 0;
                            
				for (int i=0; i<nElements; i++){
                                  //  System.out.print(sCurrentLine +" Vs "+ myPresidents[i].getParty());
                                    if (sCurrentLine.equals(myPresidents[i].getParty())){
                                       //  System.out.println(" Match True");
                                         hits++;
                                    }
                                    
                                }
                                
                                String first = sCurrentLine;
                                String second = "";
                                if (hits > 0){
                                    second = ("Found"); 
                                }
                                else{
                                    second = ("Not Found"); 
                                }
                                
                                String myString = (String.format("%-20s%-20s%1d", first , second, hits));
                                System.out.print(myString);
                                System.out.println(" Occurences");
                                
                                
                                
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

    }
    
   

    
    public void sortByName(){
        Arrays.sort(myPresidents);
    }
    
    public void myBinarySearch(){
        
         BufferedReader br = null;

		try {

			String sCurrentLine;

                       
                                
			br = new BufferedReader(new FileReader("Names.txt"));

                          String myStringOne = (String.format("%-20s%-20s%-20s", "Search Argument" , "Found or Not Found", "Number of Probes"));
                              System.out.println(myStringOne);
			while ((sCurrentLine = br.readLine()) != null) {
                            int hits = 0;                           
                            String item = sCurrentLine;
                            int first = 0;
                            int last = nElements - 1;
                            int middle = (first + last)/2;
                            
                            String firstt = sCurrentLine;
                            String second = "";
                              

                            while( first <= last )
                            {
                                
                                if ( myPresidents[middle].getName().equals(item) )
                                    {
                                     second = ("Found"); 
                                     hits++;
                                     break;
                                     }
                                else if ( myPresidents[middle].getName().compareTo(item) <0){
                                             first = middle + 1;
                                             hits++;
                                    }
                                    
                                    else
                                    {
                                        
                                                               
                                     last = middle - 1;
                                     hits++;
                                    }
                                    
                                     middle = (first + last)/2;
                            }
                            
                                 if ( first > last ){
                                     second = ("Not Found"); 
                                     //  System.out.println(item + " is not found.\n");
                                 }
                                 
                                
                                
                                String myString = (String.format("%-20s%-20s%1d", firstt , second, hits));
                                System.out.print(myString);
                                System.out.println("");
                                
                                
                                
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
    }
    
}      
            
    




    

