package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilmSearchController {

    @Autowired
    private FilmDao filmDao;

    @RequestMapping("/filmList")
    public String showFilmSearchForm(HttpServletRequest categoryRequest) {
    	List<String> categorySearchList = filmDao.getCategoryName();
    	categoryRequest.setAttribute("categories", categorySearchList);
    	
        return "filmList";
    }

    @RequestMapping("/searchFilmList")
    public String searchFilms(HttpServletRequest filmRequest) {
    	String requestCategory = filmRequest.getParameter("categoryChoice");
    	int requestMinLength = Integer.parseInt(filmRequest.getParameter("minLength"));
    	int requestMaxLength = Integer.parseInt(filmRequest.getParameter("maxLength"));
    	
    	List<Film> filmSearchList = filmDao.getFilmsBetween(requestCategory, requestMaxLength, requestMinLength);
    	filmRequest.setAttribute("films", filmSearchList);
        return "filmList";
    }
    
    
}

















