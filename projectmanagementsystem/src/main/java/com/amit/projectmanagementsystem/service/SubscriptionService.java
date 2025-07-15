package com.amit.projectmanagementsystem.service;

import com.amit.projectmanagementsystem.model.PlanType;
import com.amit.projectmanagementsystem.model.Subscription;
import com.amit.projectmanagementsystem.model.User;

public interface SubscriptionService {

    Subscription createSubscription(User user);

    Subscription getUsersSubscription(Long userId) throws Exception;

    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
