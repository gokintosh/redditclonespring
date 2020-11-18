package com.gokul.redditclone.repository;

import com.gokul.redditclone.model.Comment;
import com.gokul.redditclone.model.Post;
import com.gokul.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Commentrepository extends JpaRepository<Comment,Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);

}
