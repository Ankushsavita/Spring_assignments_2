package com.example.visitorcounterapp.controller;

import com.example.visitorcounterapp.model.Visit;
import com.example.visitorcounterapp.service.UrlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/visitors-count")
public class UrlController {
    //@Autowired
    private UrlService urlService; // dependency injection

    public UrlController(UrlService urlService) {
        this.urlService=urlService;
    }

    @GetMapping("/username/{username}/count")
    public Visit getCount(@PathVariable String username) {
        Visit visit=urlService.getVisits(username);
        return visit;
    }

}

