package com.lisheng.manage.respository;

import com.lisheng.manage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRespository extends JpaRepository<User,Long> {

}
