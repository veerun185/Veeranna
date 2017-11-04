package com.ge.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ge.dto.UserDTO;


/**
 * @author Veeranna
 *
 */
@Service
public class UserService {
	
        
	List<UserDTO> userList=new ArrayList<UserDTO>();
	UserDTO userDto;
	
		
        /**
         * @param userDTO  :: Adding a new user
         * @return userDTO
         */
        public UserDTO addNewUser(UserDTO userDTO){
        	userDto=new UserDTO();
        	
        	for(int i=0;i<userList.size();i++){
        		if(userList.get(i).getEmail().contains(userDTO.getEmail())){
        					userDTO.setId("You are existing user");
        					return userDTO;
        		}
        		else{
        			userDto.setId(userDTO.getId()+1);
        			userDto.setfName(userDTO.getfName());
                	userDto.setlName(userDTO.getlName());
                	userDto.setEmail(userDTO.getEmail());
                	userDto.setPinCode(userDTO.getPinCode());
                	userDto.setActive(userDTO.isActive());
                	userDto.setBirthDate(userDTO.getBirthDate());
        			userList.add(userDto);
        		}
        	}
        	return userDTO;
        	
        	/*userDto.setId(userDTO.getId());
        	userDto.setfName(userDTO.getfName());
        	userDto.setlName(userDTO.getlName());
        	userDto.setEmail(userDTO.getEmail());
        	userDto.setPinCode(userDTO.getPinCode());
        	userDto.setActive(userDTO.isActive());
        	userDto.setBirthDate(userDTO.getBirthDate());
        	*/
        }
        
        
        //-------------------------UPDATING USER STARTS------------------------------------
        /**
         * @param userDTO : UPDATING USER BASED ON USERID
         * @return userDTO
         */
        public UserDTO updateUser(UserDTO userDTO){
        	userDto=new UserDTO();
        	
        	for(int i=0;i<userList.size();i++){
        		if(userList.get(i).getId().contains(userDTO.getId())){
        			userDto.setPinCode(userDTO.getPinCode());	
        			userDto.setBirthDate(userDTO.getBirthDate());
        			userList.add(userDto);
        		}
        		else{
        			userDTO.setId("User is not present in the DB");
        			//userList.add(userDto);
        		}
        	}
        	return userDTO;
        }
       //=-========================END======================== 
        
        
       /**
     * @param userId :: DELETING USER IF USERID PRESENT IN THE DB
     * @return
     */
    public String deleteUser(String userId){
    	   userDto=new UserDTO();
    	   for(int i=0;i<userList.size();i++){
       		if(userList.get(i).getId().contains(userId)){
       			userList.get(i).setId("false");
       		}
       		else{
       			userId ="User is not present in the DB";
       		}
       	}
       	return userId;
       }
}
