package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-24 16:09
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(HttpServletRequest request){
        List<Account> list = accountService.findAll();
        request.setAttribute("list",list);
        return "list";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        accountService.saveAccount(account);
        return "list";
    }
}
