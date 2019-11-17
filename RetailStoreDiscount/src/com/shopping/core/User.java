package com.shopping.core;

import java.time.LocalDateTime;

/**
 * User Class to store information about user that buy 
 */
public class User {

	//User type
	private final UserType type;
	//User Name
    private final String userName;
    // Date of joining
    private final LocalDateTime joiningDate;
    
    
    public User(UserType type, String userName) 
    {
        this.type = type;
        this.userName = userName;
        joiningDate = LocalDateTime.now();
    }
    
    public User(UserType type, String userName, LocalDateTime joiningDate) 
    {
        this.type = type;
        this.userName = userName;
        this.joiningDate = joiningDate;
    }
    /**
     * getType
     * @return
     */
	public UserType getType() 
	{
		return type;
	}
    /**
     * getUserName
     * @return
     */
	public String getUserName() 
	{
		return userName;
	}
	/**
	 * getJoiningDate
	 * @return
	 */
	public LocalDateTime getJoiningDate() 
	{
		return joiningDate;
	}  
}
