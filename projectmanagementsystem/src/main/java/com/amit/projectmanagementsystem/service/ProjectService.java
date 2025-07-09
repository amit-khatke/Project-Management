package com.amit.projectmanagementsystem.service;


import com.amit.projectmanagementsystem.model.Chat;
import com.amit.projectmanagementsystem.model.Project;
import com.amit.projectmanagementsystem.model.User;

import java.util.List;

public interface ProjectService {

    Project createdProject(Project project,User user) throws Exception;

    List<Project> getProjectByTeam(User user, String category, String tag) throws Exception;

    Project getProjectById(Long projectId) throws Exception;

    void deleteProject(Long projectId,Long userId) throws Exception;

    Project updateProject(Project updateProject,Long id) throws Exception;

    void addUserToProject(Long projectId,Long userId) throws Exception;

    void removeUserFromProject(Long projectId,Long userId) throws Exception;

    Chat getChatByProjectId(Long projectId) throws Exception;
}
