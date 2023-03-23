package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.LoginRequest;
import com.example.demo.entity.LoginUser;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface LoginMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
//	LoginUser search(LoginRequest loginUser);
	
	LoginUser insert(LoginRequest loginUser);
}
