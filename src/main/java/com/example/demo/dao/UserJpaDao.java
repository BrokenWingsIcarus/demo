package com.example.demo.dao;


import com.example.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * The interface UserDao
 * @author  刁
 */
@Repository
public interface UserJpaDao extends JpaRepository<User,Long> {
    /**
      * 查询名字
      * @param  id 用户ID
      * @return 用户
     */
    User findById(Integer id);

    /**
     * 查询用户Id和用户的昵称
     * @param id
     * @param username
     * @return
     */
    User findByIdAndName(String id, Integer username);

    /**
     * 查询用户
     * @param name 用户的名字
     * @return 这个用户
     */
    @Query("from User u where u.name = name")
    User findByUser(@Param("name") String name);
}
