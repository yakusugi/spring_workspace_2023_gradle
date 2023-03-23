package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.RegistrationRequest;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.LoginUser;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
	LoginUser search(UserSearchRequest user);
	
	LoginUser insert(RegistrationRequest user);
}
