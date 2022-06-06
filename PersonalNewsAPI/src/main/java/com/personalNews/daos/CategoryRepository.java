package com.personalNews.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.personalNews.models.Categories;
import com.personalNews.models.Sources;

@Repository
public interface CategoryRepository extends JpaRepository<Sources, Integer> {
	
	@Query("SELECT DISTINCT s.category FROM Sources s")
    List<String> findDistinctCategory();


}
