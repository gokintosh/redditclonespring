package com.gokul.redditclone.repository;

import com.gokul.redditclone.model.Post;
import com.gokul.redditclone.model.Subreddit;
import com.gokul.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
