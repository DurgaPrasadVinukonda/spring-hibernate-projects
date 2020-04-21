package com.vs._Spring_MVC_Forms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vs.pojo.Reservation;

@RequestMapping("/reservation")
@Controller

public class ReservationController {
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		// Create a reservation
		Reservation res = new Reservation();
		model.addAttribute("reservation", res);
		return "reservation-page";

	}
	@RequestMapping("/submitForm")  
	// @ModelAttribute binds form data to the object  
	public String submitForm(@ModelAttribute("reservation") Reservation res)  
	{  
	    return "confirmation-form";  
	}  
}
