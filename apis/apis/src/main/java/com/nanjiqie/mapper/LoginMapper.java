package com.nanjiqie.mapper;

import com.nanjiqie.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginMapper {
    public Person findPerson(String username,String password);
}
