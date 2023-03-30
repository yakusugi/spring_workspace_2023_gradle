package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.RegistrationRequest;
import com.example.demo.entity.LoginUser;
import com.example.demo.service.RegistrationService;
/**
 * ユーザー情報 Controller
 */
@Controller
public class RegistrationController {
  /**
   * ユーザー情報 Service
   */
  @Autowired
  RegistrationService registrationService;
  /**
   * ユーザー入力画面表示
   * @param model Model
   * @return 入力画面
   */
  @GetMapping(value = "/user/registration")
  public String insertUserInfo(Model model) {
    model.addAttribute("registrationRequest", new RegistrationRequest());
    return "user/registration";
  }
  
  /**
   * ユーザー入力画面
   * @param registrationRequest リクエストデータ
   * @param model Model
   * @return ユーザー入力画面
   */
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String search(@ModelAttribute RegistrationRequest registrationRequest, Model model) {
	  LoginUser loginUser = registrationService.insert(registrationRequest);
    model.addAttribute("userinfo", loginUser);
    return "/login";
  }
}
