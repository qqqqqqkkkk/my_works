package com.nanjiqie.service.impl;


import com.nanjiqie.mapper.LoginMapper;
import com.nanjiqie.states.LoginState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements com.nanjiqie.service.LoginService {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public LoginState findPerson(String username, String password) {
        if(loginMapper.findPerson(username, password) != null){
            return new LoginState(true);
        }
        return new LoginState(false);
    }
}
