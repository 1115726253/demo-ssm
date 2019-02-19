package demo01.mapper;

import demo01.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImp extends SqlSessionDaoSupport implements UserMapper{

    public User findUserById(Integer id){
        return getSqlSession().selectOne("demo01.mapper.UserMapper.findUserById",id);
    }
}
