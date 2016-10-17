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
    
   
    
    public Presidents (int number, String name, String code, int term, String party, String state) {
        this.number = number;
        this.name = name;
        this.code = code;
        this.term = term;
        this.party = party;
        this.state = state;
    } //End Constructor

    public int getNumber()
    {
        return number;
    }                           

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public int getTerm()
    {
        return term;
    }

    public void setTerm(int term)
    {    
        this.term = term;
    }

    public String getParty()
    {
        return party;
    }                           

    public void setParty(String party)
    {
        this.party = party;
    }
    public String getState()
    {
        return state;
    }                           

    public void setState(String state)
    {
        this.state = state;
    }
    
    public String toString()
    {
        return //number+""+name+""+party;
        (String.format("%6d %-20s%-20s", number , name, party));
    }

    @Override
    public int compareTo(Presidents o) {
        int last = this.name.compareTo(o.name);
        return last;
    }
    
 
}


