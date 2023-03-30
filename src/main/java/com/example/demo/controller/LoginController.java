package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.UserMyBatisService;
/**
 * ユーザー情報 Controller
 */
@Controller
public class LoginController {
  /**
   * ユーザー情報 Service
   */
  @Autowired
  UserMyBatisService userMyBatisService;
  /**
   * ユーザー情報検索画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面
   */
//  @GetMapping(value = "/login")
//  public String displaySearch(Model model) {
//    model.addAttribute("loginRequest", new LoginRequest());
//    return "/login";
//  }
  
  /**
   * ユーザー情報検索
   * @param userSearchRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
//  @RequestMapping(value = "/search", method = RequestMethod.POST)
//  public String search(@ModelAttribute LoginRequest loginRequest, Model model) {
//	  LoginUser loginUser = userMyBatisService.search(loginRequest);
//    model.addAttribute("userinfo", user);
//    return "user/search";
//  }
}
