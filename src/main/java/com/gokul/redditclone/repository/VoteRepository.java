package com.gokul.redditclone.repository;

import com.gokul.redditclone.model.Post;
import com.gokul.redditclone.model.User;
import com.gokul.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote,Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
