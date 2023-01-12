package com.nanjiqie.service;

import com.nanjiqie.mapper.LoginMapper;
import com.nanjiqie.states.LoginState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    public LoginState findPerson(String username,String password);

}
