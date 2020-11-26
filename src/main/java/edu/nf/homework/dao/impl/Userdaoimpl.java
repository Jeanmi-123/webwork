package edu.nf.homework.dao.impl;

import edu.nf.homework.dao.Userdao;
import edu.nf.homework.entity.Users;
import edu.nf.homework.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author Jeanmi
 * @date 2020/11/26
 */
public class Userdaoimpl implements Userdao {
    @Override
    public List<Users> listUsers() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            return sqlSession.getMapper(Userdao.class).listUsers();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void add( String name) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
             sqlSession.getMapper(Userdao.class).add(name);
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
