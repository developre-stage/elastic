package com.emi.elasticapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emi.elasticapp.model.Event;
import com.emi.elasticapp.repository.EventRepository;

@Controller
public class SearchController {

	@Autowired
	private EventRepository eventRepository;

	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String search(Model model)  {
		model.addAttribute(new SearchModel());
		return "search";
	}
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public String submitSearch()  {
		

		
		 Page<Event> e = eventRepository.findByName("Enterprise search London get-together", null);
		
		 System.out.println("AAAAAAAAAAAAAA: " + e.stream().findFirst().get().getDescription());
		 System.out.println("AAAAAAAAAAAAAA: " + e.stream().findFirst().get().getLocation());
		 
		return "redirect:/search";
	}
	
	
}
