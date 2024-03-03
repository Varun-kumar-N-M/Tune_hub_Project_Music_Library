package com.example.th.services;

import java.util.List;

import com.example.th.entities.Songs;

public interface SongsService {
	 
public boolean songExists(String name);
public List<Songs> fetchAllSongs();
public String addsongs(Songs song);
}
