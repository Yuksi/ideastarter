package com.starter.ui.controllers;

import com.starter.entities.Idea;
import com.starter.entities.enums.Statuses;
import com.starter.services.IIdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Yuksi on 24.04.2018.
 */

@Controller
public class IdeaController {
    @Autowired
    private IIdeaService ideaService;

    @RequestMapping(value = "/ideas", method = RequestMethod.GET)
    public String ideas(Model model) {
        List<Idea> ideas = ideaService.getAll();
        model.addAttribute("ideas", ideas);
        return "ideas";
    }

    @RequestMapping(value = "/{status}/ideas", method = RequestMethod.GET)
    public String getIdeasByStatus(@PathVariable("status") String status, Model model) {
        List<Idea> ideas = ideaService.getWithStatus(Statuses.valueOf(status.toUpperCase()));
        model.addAttribute("ideas", ideas);
        return "ideas";
    }

    @RequestMapping(value = "/users/{id}/ideas", method = RequestMethod.GET)
    public String getUsersIdeas(@PathVariable("id") int id, Model model) {
        List<Idea> ideas = ideaService.getByUserId(id);
        model.addAttribute("ideas", ideas);
        return "ideas";
    }

    @RequestMapping(value = "/ideas/{id}", method = RequestMethod.GET)
    public String getIdea(@PathVariable("id") long id, Model model) {
        Idea idea = ideaService.getById(id);
        model.addAttribute("idea", idea);
        return "idea";
    }

    @RequestMapping(value = "/users/{id}/add-idea", method = RequestMethod.GET)
    public String addIdea() {
        return "add-idea";
    }
    @ModelAttribute("idea")
    public Idea newIdea() {
        return new Idea();
    }
    @RequestMapping(value = "/users/{id}/ideas", method = RequestMethod.POST)
    public String addIdea(@ModelAttribute("idea") Idea idea, @PathVariable("id") int id) {
        idea.setId(0);
        ideaService.addByAuthorId(idea,id);
        return "redirect:ideas";
    }

    @RequestMapping(value = "/ideas/{id}/status-message/{st}", method = RequestMethod.GET)
    public String changeStatus(@PathVariable("id") long id, @PathVariable("st") String st, Model model) {
        Statuses status = Statuses.valueOf(st.toUpperCase());
        ideaService.changeStatus(id, status);
        model.addAttribute(st);
        return "status-message";
    }

}