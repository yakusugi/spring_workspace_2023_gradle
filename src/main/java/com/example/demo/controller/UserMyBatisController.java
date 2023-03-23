package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.service.UserMyBatisService;
/**
 * ユーザー情報 Controller
 */
@Controller
public class UserMyBatisController {
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
  @GetMapping(value = "/user/search")
  public String displaySearch(Model model) {
    model.addAttribute("userSearchRequest", new UserSearchRequest());
    return "user/search";
  }
  
  /**
   * ユーザー情報検索
   * @param userSearchRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
//  @RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
//  public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
//	  MyBatisUser user = userMyBatisService.search(userSearchRequest);
//    model.addAttribute("userinfo", user);
//    return "user/search";
//  }
}
