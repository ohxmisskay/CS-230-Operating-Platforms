package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
    	//Returns true if authorized method based for users are within the parameter
    	return user.getRoles() != null && user.getRoles().contains(role);
    	
    }
}