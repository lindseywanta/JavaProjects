/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Lindsey
 */
public class Queue {
    private ArrayList<Presidents> queArray;                             //Declare variable
    private int front,  rear,  nItems;
   
  
    /**
     *
     * @param s
     */
    
    public Queue ()                                                     //Constructor 
    {                                
        queArray = new ArrayList<Presidents>();		
        front = 0;			
        rear = -1;			
        nItems = 0;
    
    } // end Constructor
    
    public void insert(Presidents j)                                    //Inserts Presidents objects
    {                                         
        queArray.add(j);
        rear++;                                                         //Put item at rear of queue 
        nItems++;
           
    }//end insert()
          
    public Presidents delete()                                          //Delete Method
    {
        Presidents temp = (Presidents) queArray.remove(0);
        rear--;
        nItems--;
        return temp;
    }//end delete()
            
    
    public void display()                                               //Displays array contents                           
    {            
        System.out.println(String.format("%6s %-20s%-20s", "Number" , "Name", "Party"));    //Custom Header 
        System.out.println("");
        for(int i = 0; i<=rear; i++){
            Presidents temp = (Presidents) queArray.get(i);
            System.out.println(temp.toString());
        }
        
    }// end display()
            
    public int peekFront()                                              //Peek at front of queue
    {   
        return front;
    } // end peek()
    
    public boolean isEmpty()                                            //True if queue is empty
    {                        
        return (nItems==0);			        
    } // end isEmpty()
    
    public boolean isFull()                                             //True if queue is full 
    {  	                
        return (nItems== queArray.size());			
    } // end isFull()
    
    public void sort()                                                  //Sort Queue by term number, ascending order
    {
        int i,j;
        for (j = 0; j < rear; j++) 
        {
            int iMin = j;
            for ( i = j+1; i < rear+1; i++) 
            {
                if (queArray.get(i).getNumber() < queArray.get(iMin).getNumber()) 
                {
                    iMin = i;
                }
            }

            if(iMin != j) 
            {
                swap(j,iMin);
            }
        }        
    }//end sort()
            
    
    public void swap(int j, int iMin)                                   //Swap items when needed for sort
    {
        Presidents temp = queArray.remove(iMin);
        queArray.add(j, temp);
    }//end swap()
    
    public void insertCorrect(Presidents p)
    {
        for(int i =0; i<= nItems; i++)
            if(p.getNumber() < queArray.get(i).getNumber() && i == 0)
            {
                queArray.add(i, p);
                nItems++;
                rear++;
                return;
            }
            else if(p.getNumber()<queArray.get(i).getNumber())
            {
                queArray.add((i),p);
                nItems++;
                rear++;
                return;
            }
            else if(i == rear )
            {
                queArray.add(p);
                nItems++;
                rear++;
                return;
            }
    }//end insertCorrect()
    
}