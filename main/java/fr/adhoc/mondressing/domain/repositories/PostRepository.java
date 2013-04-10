package fr.adhoc.mondressing.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adhoc.mondressing.domain.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
