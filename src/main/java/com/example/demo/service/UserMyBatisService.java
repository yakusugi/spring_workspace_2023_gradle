package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserMapper;
/**
 * ユーザー情報 Service
 */
@Service
public class UserMyBatisService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserMapper userMapper;
    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
//    public MyBatisUser search(UserSearchRequest userSearchRequest) {
//        return userMapper.search(userSearchRequest);
//    }
}
