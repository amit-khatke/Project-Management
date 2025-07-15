package com.amit.projectmanagementsystem.repository;

import com.amit.projectmanagementsystem.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {

    Subscription findByUserId(Long userId);
}
