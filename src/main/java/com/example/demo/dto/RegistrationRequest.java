package com.example.demo.dto;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
/**
 * ユーザー情報 入力用リクエストデータ
 */
@Data
public class RegistrationRequest implements Serializable {
  /**
   * User Email
   */
  @NotBlank
  @Email
  private String email;
  /**
   * User Name
   */
  @NotBlank
  private String userName;
  /**
   * User Password
   */
  @NotBlank
  private String password;
}	
