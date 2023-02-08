package com.example.visitorcounterapp.service;

import com.example.visitorcounterapp.model.Visit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {

    static Map<String,Integer> map = new HashMap<>();
    public Visit getVisits(String username){
        int count = map.getOrDefault(username,0) +1;
        map.put(username, count);

        Visit visit = new Visit(username, count);
        return visit;
    }
}
