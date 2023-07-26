package com.springultimate.challenge3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springultimate.challenge3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
