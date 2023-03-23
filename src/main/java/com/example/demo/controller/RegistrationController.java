package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.RegistrationRequest;
import com.example.demo.entity.LoginUser;
import com.example.demo.service.LoginService;
/**
 * ユーザー情報 Controller
 */
@Controller
public class RegistrationController {
  /**
   * ユーザー情報 Service
   */
  @Autowired
  LoginService loginService;
  /**
   * ユーザー情報検索画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面
   */
//  @GetMapping(value = "/registration")
//  public String insertUserInfo(Model model) {
//    model.addAttribute("registrationRequest", new RegistrationRequest());
//    return "/registration";
//  }
  
  /**
   * ユーザー情報検索
   * @param userSearchRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @RequestMapping(value = "/registration", method = RequestMethod.POST)
  public String search(@ModelAttribute RegistrationRequest registrationRequest, Model model) {
	  LoginUser loginUser = loginService.insert(registrationRequest);
    model.addAttribute("userinfo", loginUser);
    return "/login";
  }
}
