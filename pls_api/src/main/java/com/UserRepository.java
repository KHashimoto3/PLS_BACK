package com;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	//該当するユーザの情報を取得
	User findByName(String name);
}
