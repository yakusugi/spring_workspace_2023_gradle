package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.RegistrationRequest;
import com.example.demo.entity.LoginUser;
/**
 * ユーザー情報入力用 Mapper
 */
@Mapper
public interface RegistrationMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
	
	LoginUser insert(RegistrationRequest registrationRequest);
//	int insert(RegistrationRequest registrationRequest);
}
