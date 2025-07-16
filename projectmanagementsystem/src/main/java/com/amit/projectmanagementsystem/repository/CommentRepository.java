package com.amit.projectmanagementsystem.repository;

import com.amit.projectmanagementsystem.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    @Query("SELECT c FROM Comment c WHERE c.issue.id = :issueId")
    List<Comment> findCommentByIssue(@Param("issueId") Long issueId);

}
