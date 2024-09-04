package com.mycamuproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycamuproject.entity.detail;
@Repository
public interface detailrepo extends JpaRepository<detail, Long> {
	detail findByUsernameAndPassword(String username, String password);

}
