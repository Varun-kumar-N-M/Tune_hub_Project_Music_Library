package com.example.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.th.entities.Songs;

public interface SongsRepository extends JpaRepository<Songs,Integer> {

	public Songs findByName(String name);

}
