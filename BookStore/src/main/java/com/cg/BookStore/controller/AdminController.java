package com.cg.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.BookStore.beans.Admin;
import com.cg.BookStore.services.AdminServices;

@RestController
public class AdminController {

	@Autowired
	AdminServices adminServices;

	@RequestMapping(value="/acceptAdminUserDetails", method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String> acceptAdminUserDetails(@RequestParam String emailId, String fullName, String password){
		Admin admin=adminServices.createAdminUser(emailId, fullName, password);
		if(admin==null)
		{
			return new ResponseEntity<String>("Failed to Register, Try Again!!",HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Admin Registered Succesfully",HttpStatus.OK);
	}
	@RequestMapping(value="/deleteAdminUser", method=RequestMethod.DELETE, consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<String> deleteAdminUserDetails(@RequestParam Integer adminId){
		if(adminServices.deleteAdminUser(adminId)==true)
		{ 
			return  new ResponseEntity<String>("User Deleted Succesfully",HttpStatus.OK);}
		else
			return new ResponseEntity<String>("Failed to Delete, Try Again!!",HttpStatus.OK);
	}

	@RequestMapping(value="/displayAllAdminUsers", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<List<Admin>> displayAllAdminUsers(){
		return new ResponseEntity<List<Admin>>(adminServices.listAllAdminUser(),HttpStatus.OK);
	}
	@RequestMapping(value="/updateAdminUserDetails/{adminId}", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<String> updateAdminUserDetails(@PathVariable(value= "adminId") Integer adminId,@RequestBody Admin admin){
			return new ResponseEntity<String>("Admin Updation :"+adminServices.editAdminUser(adminId,admin),HttpStatus.OK);
	}

}
