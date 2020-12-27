package cn.gmj.user.mapper;

import cn.gmj.user.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from users where id = #{id}")
    User selectByPrimaryKey(Long id);

}
