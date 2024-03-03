package com.example.th.controller;

import java.util.List; // Import List from java.util
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Import Model from org.springframework.ui
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.th.entities.Songs;
import com.example.th.services.SongsService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SongsController {
    @Autowired
    SongsService songserv;

    @PostMapping("/addsongs") // Changed to specify the HTTP method and request mapping
    public String addsongs(@ModelAttribute Songs song) {
        boolean status = songserv.songExists(song.getName());
        if (!status) { // Simplified condition check
            songserv.addsongs(song);
            return "songsuccess";
        } else {
            return "songfail";
        }
    }

    @GetMapping("/map-viewsongs")
    public String viewSongs(Model model) {
        List<Songs> songslist = songserv.fetchAllSongs(); // Corrected the type of songslist
        model.addAttribute("songslist", songslist); // Corrected print statement
        return "displaysongs";
    }
    @GetMapping("/viewsongs")
    public String viewCustomerSongs(Model model) {
    	boolean primeCustomerStatus=true;
    	if(primeCustomerStatus==true) {
    		List<Songs> songslist = songserv.fetchAllSongs(); // Corrected the type of songslist
            model.addAttribute("songslist", songslist); // Corrected print statement
            return "displaysongs";
    	}
    	else {
    		return "makepayment";
    	}
    	
    }
    
}
