package com.example.demo.entity;

import lombok.Data;
/**
 * ログインユーザー情報 Entity
 */
@Data
public class LoginUser {
    
    /**
     * 名前
     */
    private String email;
    /**
     * 住所
     */
    private String userName;
    /**
     * 電話番号
     */
    private String password;
    
}
