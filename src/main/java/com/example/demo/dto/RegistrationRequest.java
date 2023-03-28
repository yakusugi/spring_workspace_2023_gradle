package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;
/**
 * ユーザー情報 入力用リクエストデータ
 */
@Data
public class RegistrationRequest implements Serializable {
  /**
   * User Email
   */
  private String email;
  /**
   * User Name
   */
  private String userName;
  /**
   * User Password
   */
  private String password;
}
