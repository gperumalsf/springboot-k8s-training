package com.example.websocketdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.websocketdemo.dao.Messages;

public interface MessagesRepo extends JpaRepository<Messages, Integer> {

}
