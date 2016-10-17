/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lindsey
 */
public class Presidents implements Comparable<Presidents> {
    private int number, term;                                       
    private String name, code, party, state;                        
    
   
    
    public Presidents (int number, String name, String code, int term, String party, String state)  //Consructor
    {    
        this.number = number;
        this.name = name;
        this.code = code;
        this.term = term;
        this.party = party;
        this.state = state;
    } //End Constructor
    
    public Presidents(int number, String name, String party)
    {
        this.number = number;
        this.name = name;
        this.party = party;
    }
    
    public int getNumber()                                          //getNumber method
    {
        return number;                                              //returns the number
    } //end getNumber()                          

    public void setNumber(int number)                               //setNumber method
    {
        this.number = number;                                       
    }//end setNumber

    public String getName()                                         //getName method
    {
        return name;                                                //returns the name
    }//end getName()

    public void setName (String name)                               //setName method
    {
        this.name = name;
    }//end setName()

    public String getCode()                                         //getCode method
    {
        return code;                                                //returns code
    }//end getCode()

    public void setCode(String code)                                //setCode
    {
        this.code = code;
    }//end setCode()

    public int getTerm()                                            //getTerm method
    {
        return term;                                                //returns the term
    }//end getTerm()

    public void setTerm(int term)                                   //setTerm method
    {    
        this.term = term;
    }//end setTerm()

    public String getParty()                                        //getParty method
    {
        return party;                                               //returns party
    }//end getParty()                          

    public void setParty(String party)                              //setParty method
    {
        this.party = party;                                 
    }//end setParty
    
    public String getState()                                        //getState method
    {
        return state;                                               //returns state
    }//end getState()                           

    public void setState(String state)                              //setState method
    {
        this.state = state;                         
    }//end setState()
    
    @Override                                                       //needed override
    public String toString()
    {
        return                          
        (String.format("%6d %-20s%-20s", number , name, party));   //Custom header 
    }//end toString()
    
    @Override                                                       //needed override
    public int compareTo(Presidents o) 
    {
        int last = this.name.compareTo(o.name);
        return last;
    }//end compareTo()

}//end Presidents class
