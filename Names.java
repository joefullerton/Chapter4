package Chapter_4;

import java.lang.Character.Subset;

public class Names
{
	private String firstName;
	private String middleName;
	private String lastName;
	private String firstInitial;
	private String middleInitial;
	private String lastInitial;
	
	public Names(String first, String middle, String last)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	public String getFirst()
	{
		return firstName;
	}
	public String getMiddle()
	{
		return middleName;
	}
	public String getLast()
	{
		return lastName;
	}
	public String firstMiddleLast()
	{
		return (firstName + " " + middleName + " " + lastName);
	}
	public String lastFirstMiddle()
	{
		return (lastName + " " + firstName + " " + middleName  );
	}
	public boolean equals(Names otherName)
	{
		if(firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast()))
			return true;
		else 
			return false;
		
	}
	public String initials()
	{
		firstInitial = firstName.substring(0, 1);
		middleInitial = middleName.substring(0, 1);
		lastInitial = lastName.substring(0, 1);
		
		return (firstInitial + middleInitial + lastInitial);
	}
	public int length()
	{
		return firstMiddleLast().length() - 2;
	}
}

