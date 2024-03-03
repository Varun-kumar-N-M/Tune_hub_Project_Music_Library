package com.example.th.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.th.repositories.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService {
	@Autowired
PlayListRepository prepo;
}
