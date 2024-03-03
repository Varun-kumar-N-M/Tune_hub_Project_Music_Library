package com.example.th.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Correct import for Model

import com.example.th.entities.PlayList;
import com.example.th.entities.Songs;
import com.example.th.services.PlayListService;
import com.example.th.services.SongsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PlayListController {
    @Autowired
    PlayListService pserv;
    
    @Autowired
    SongsService sserv;

    @GetMapping("/map-createplaylist")
    public String createPlayList(Model model) {
    	//Fetching the songs using the song service
        List<Songs> songslist = sserv.fetchAllSongs();
        //Adding the songs in the model
        model.addAttribute("songslist", songslist);
        //sending create playList
        return "createplaylist";
    }
    @PostMapping("/addplaylist")
    public String addPalyList(@ModelAttribute PlayList playlist) {
        
        
        return "playlistsuccess";
    }
    
}
