/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author csim
 */
public class Container 
{
    private double value;
    private String prefix;
    private String postfix;
    private String infix;

    private boolean isPrefix = false;
    private boolean isInfix = false;
    private boolean isPostfix = false;
    
    public Container(){}
    
    public double getValue()
    {
        return this.value;
    }
  
    public void setValue(Double value) 
    {
        this.value = value;
    }
    
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }
  
    public String getPrefix() 
    {
        return prefix;
    }

    public String getPostfix() 
    {
        return postfix;
    }

    public void setPostfix(String postfix) 
    {
        this.postfix = postfix;
    }
    
    public String getInfix()
    {
        return infix;
    }

    public void setInfix(String infix)
    {
         this.infix=infix;
    }
    
    public void setIsPrefix(boolean bool)
    {
        this.isPrefix = bool;
    }
    
    public void setIsInfix(boolean bool)
    {
        this.isInfix = bool;
    }
    
    public void setIsPostfix(boolean bool)
    {
        this.isPostfix = bool;
    }

    public boolean getIsPrefix()
    {
        return this.isPrefix;
    }
    
    public boolean getIsInfix()
    {
        return this.isInfix;
    }

    public boolean getIsPostfix()
    {
        return this.isPostfix;
    }

}
