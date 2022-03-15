package com.sai;

public class User 
{
/**
 * created method checkFName and passing parameter in this it will check
 * FirstName is valid or not result will be in true or false because method is
 * boolean type
 * 
 * @param fName -FirstName of the String
 * @return -return to method created
 */
public boolean checkFName(String fName)
{
	/**
	 * RegEx pattern for FirstName
	 */
	return (fName.matches("[A-Z][a-z]{3,}"));

}

/**
 * created method L name and passing parameter in this it will check LastName is
 * valid or not result will be in true or false because method is boolean type
 * 
 * @param Lname -LastName of the String
 * @return - return to method created
 */
public boolean Lname(String Lname) 
{
	return (Lname.matches("[A-Z][a-z]{3,}"));
}
}
