package com.techelevator;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping("/actorList")/* What request mapping do we want here */
	public String showSearchActorForm() {
		return "actorList";
	}

	
	//
	@RequestMapping("/searchActorList")
	public String searchActors(HttpServletRequest actorRequest) {
		String requestName = actorRequest.getParameter("lastName");
		List<Actor> actorSearchList = actorDao.getMatchingActors(requestName);
		actorRequest.setAttribute("actors", actorSearchList);
		return "actorList";
	}
	
	
	
//
//	public ActorDao getActorDao() {
//		return actorDao;
//	}
//
//	public void setActorDao(ActorDao actorDao) {
//		this.actorDao = actorDao;
//	}
}
