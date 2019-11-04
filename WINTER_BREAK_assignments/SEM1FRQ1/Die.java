
/**
 * Die class simulates die rolling nad can display it and manipulate it.
 *
 * @author Haley Sanchez
 * 12/28/18
 */
public class Die
{
    private final int MAX = 6;
    private int faceValue;
    //constructor
    public Die()
    {
        faceValue = 1;
        //why dont you set faceValue to 1?
    }
    //gets a random number that is between 1 and 6 and sets it as faceValue
    //by using MAX
    public int roll()
    {
        faceValue = (int)(Math.random()* MAX)+1;
        return faceValue;
    }
    //changes faceValue based on input and checks that it is between 1 and 6
    public void setFaceValue(int value)
    {
        if(value > 0 && value <= MAX)
        faceValue = value;
    }
    //returns faveValue value
    public int getFaceValue()
    {
        return faceValue;
    }
    //without a toString() method when you try to prnt out the object you get random 
    //numbers and digits with a @ symbol- prints location in memory
    //with this method the instance variables are returned - faceValue
    public String toString()
    {
        String result = Integer.toString(faceValue);
        return result;
    }
}
