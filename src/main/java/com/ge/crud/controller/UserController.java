package com.ge.crud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ge.crud.service.UserService;
import com.ge.dto.UserDTO;


@CrossOrigin
@RestController
@Component
@RequestMapping(value="/")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	//public  SRCaseResponseDTO invoiceTrackerList(@RequestBody SRCaseDTO caseDetailDTO, @RequestHeader("Authorization") String authorization, HttpServletRequest request) {
	public  UserDTO addNewUser(@RequestBody UserDTO userDTO, HttpServletRequest request) {
	   return userService.addNewUser(userDTO);
	}
	
	
	
	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	//public  SRCaseResponseDTO invoiceTrackerList(@RequestBody SRCaseDTO caseDetailDTO, @RequestHeader("Authorization") String authorization, HttpServletRequest request) {
	public  UserDTO updateUser(@RequestBody UserDTO userDTO, HttpServletRequest request) {
	   return userService.updateUser(userDTO);
	}
	
	
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	//public  SRCaseResponseDTO invoiceTrackerList(@RequestBody SRCaseDTO caseDetailDTO, @RequestHeader("Authorization") String authorization, HttpServletRequest request) {
	public String deleteUser(@PathParam("userId") String userId, HttpServletRequest request) {
	   return userService.deleteUser(userId);
	}
	

}
