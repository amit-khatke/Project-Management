package com.amit.projectmanagementsystem.repository;

import com.amit.projectmanagementsystem.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat,Long> {
}
