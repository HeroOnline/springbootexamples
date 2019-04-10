package cn.lijunkui.restful.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lijunkui.restful.model.User;
@RequestMapping("/mvcUser")
@ResponseBody
@Controller
public class mvc3UserController {
	
	Logger log = LoggerFactory.getLogger(mvc3UserController.class);
    /**
     * 根据用户id 查询用户
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET )
    public User get(@PathVariable(name = "id") Long id){
        User user = new User();
        user.setName("lijunkui");
        user.setAge(18);
        log.info("查询用户成功："+"id:{}",id);
        return user;
    }
    /**
     * 添加用户
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public void add(User user){
        log.info("添加用户成功："+"name:{},age:{}",user.getName(),user.getAge());
    }
 
    /**
     * 全部替换修改
     * @param user
     */
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public void updatePUT(User user){
        log.info("修改用户成功："+"name:{},age:{}",user.getName(),user.getAge());
    }
 
    /**
     * 局部修改用户名称
     * @param name
     */
    @RequestMapping(value = "",method = RequestMethod.PATCH)
    public void updatePATCH(String name){
        log.info("修改用户成功："+"name:{}",name);
    }
 
    /**
     * 删除用户
     */
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id){
        User user = new User();
        user.setName("lijunkui");
        user.setAge(18);
        log.info("删除用户成功："+"id:{}",id);
    }
}
