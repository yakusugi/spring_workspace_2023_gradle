package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RegistrationRequest;
import com.example.demo.entity.LoginUser;
import com.example.demo.repository.RegistrationMapper;
/**
 * ユーザー情報 Service
 */
@Service
public class RegistrationService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private RegistrationMapper registrationMapper;
    
    /**
     * ユーザー情報挿入
　　　* @param userSearchRequest インサートデータ
     * @return データ挿入
     */
    public LoginUser insert(RegistrationRequest registrationRequest) {
        return registrationMapper.insert(registrationRequest);
    }
}
