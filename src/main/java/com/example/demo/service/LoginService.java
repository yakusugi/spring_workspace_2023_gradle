package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RegistrationRequest;
import com.example.demo.entity.LoginUser;
import com.example.demo.repository.LoginMapper;
/**
 * ユーザー情報 Service
 */
@Service
public class LoginService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private LoginMapper loginMapper;
    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
//    public MyBatisUser search(UserSearchRequest userSearchRequest) {
//        return userMapper.search(userSearchRequest);
//    }
    
    /**
     * ユーザー情報挿入
　　　* @param userSearchRequest インサートデータ
     * @return データ挿入
     */
    public LoginUser insert(RegistrationRequest registrationRequest) {
        return loginMapper.insert(registrationRequest);
    }
}
