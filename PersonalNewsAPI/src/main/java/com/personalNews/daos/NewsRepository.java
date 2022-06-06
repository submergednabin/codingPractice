package com.personalNews.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personalNews.models.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {

}
