package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Passaenger;

public interface PassengerRepo extends JpaRepository<Passaenger, Long> {

}
