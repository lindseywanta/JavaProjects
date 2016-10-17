
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lindsey
 */
public class StackP {
   
    private ArrayList queArray;                                     //Declare variables
    private int top,  bottom,  nItems2;
   
  
    /**
     *
     * @param s
     */
    
    public StackP ()                                                //Constructor 
    {                                
        queArray = new ArrayList<Presidents>();                     //ArrayList of type Presidents
        top = 0;			
        bottom = -1;			
        nItems2 = 0;
        
    } // end Constructor
    
    public void push(Presidents j)                                  //Put item at rear of queue
    {                                          
        queArray.add(j);
        bottom++;
        nItems2++;
               
    }//end insert()
          
    public Presidents pop()                                         //Pops item from queue
    {
        Presidents temp = (Presidents) queArray.remove(bottom);
        bottom--;
        nItems2--;
        return temp;
    }//end pop()
            
    
    public void display()                                          //Displays array contents                           
    {            
        for(int i = 0; i<=bottom; i++){
            Presidents temp = (Presidents) queArray.get(i);
            System.out.println(temp.toString());
        }
    }//end display()
                      
    public Presidents peekFront()                                  //Peek at front of queue
    {                           
        Presidents temp = (Presidents) queArray.get(bottom);
        return temp;
    } //end peek()
    
    public boolean isEmpty()                                       //True if queue is empty
    {                                                       
        return (nItems2 == 0);                                     //If nItems2 equals 0 then its empty 
    } //end isEmpty()
    
    public boolean isFull()                                        
    {  	                
        return (nItems2 == queArray.size());			   
    } //end isFull()

}//end Main()