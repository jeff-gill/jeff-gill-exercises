package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Actor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

	@RequestMapping("/customerList")/* What request mapping do we want here */
	public String showSearchCustomerForm() {
		return "customerList";
	}
	
	@RequestMapping("/searchCustomerList")
	public String searchCustomers(HttpServletRequest customerRequest) {
		String requestCustomerLastName = customerRequest.getParameter("lastName");
		String requestCustomerEmail = customerRequest.getParameter("email");
		String requestCustomerActive = customerRequest.getParameter("active");
		
		List<Actor> customerSearchList = customerDao.getMatchingCustomers(requestCustomerLastName, requestCustomerEmail, requestCustomerActive);
		customerRequest.setAttribute("customers", customerSearchList);
		return "customerList";
	}
    
}