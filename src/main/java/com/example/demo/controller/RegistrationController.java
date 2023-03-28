package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.RegistrationRequest;
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
  @GetMapping(value = "/registration")
  public String insertUserInfo(Model model) {
    model.addAttribute("registrationRequest", new RegistrationRequest());
    return "registration";
  }
  
  /**
   * ユーザー入力画面
   * @param userSearchRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
//  @RequestMapping(value = "/login", method = RequestMethod.GET)
//  public String search(@ModelAttribute RegistrationRequest registrationRequest, Model model) {
//	  LoginUser loginUser = registrationService.insert(registrationRequest);
//    model.addAttribute("userinfo", loginUser);
//    return "/login";
//  }
}
