package edu.nf.homework.dao;

import edu.nf.homework.entity.Users;

import java.util.List;

/**
 * @author Jeanmi
 * @date 2020/11/26
 */
public interface Userdao {
    List<Users> listUsers();

    void add (String name);
}
