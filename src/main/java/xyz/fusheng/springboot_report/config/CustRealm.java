// /**
//  * Copyright (C), 2019-2020, 软件卓越人才班
//  * FileName: MyRealm
//  * Author:   hzg
//  * Date:     2020-02-12 18:55
//  * Description: 自定义测试
//  * History:
//  * <author>          <time>          <version>          <desc>
//  * 作者姓名           修改时间           版本号              描述
//  */
// package xyz.fusheng.springboot_report.config;
//
// import org.apache.shiro.authc.*;
// import org.apache.shiro.authz.AuthorizationInfo;
// import org.apache.shiro.authz.SimpleAuthorizationInfo;
// import org.apache.shiro.realm.AuthorizingRealm;
// import org.apache.shiro.subject.PrincipalCollection;
// import org.mindrot.jbcrypt.BCrypt;
// import org.springframework.beans.factory.annotation.Autowired;
// import xyz.fusheng.springboot_report.entity.Right;
// import xyz.fusheng.springboot_report.entity.Role;
// import xyz.fusheng.springboot_report.entity.User;
// import xyz.fusheng.springboot_report.repository.UserRepository;
//
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
//
// /**
//  * 〈一句话功能简述〉<br>
//  * 〈自定义测试〉
//  *
//  * @author hzg
//  * @create 2020-02-12
//  * @since 1.0.0
//  */
//
// public class CustRealm extends AuthorizingRealm {
//
//     @Autowired
//     UserRepository userRepository;
//
//     /**
//      * 授权，即该用户拥有什么角色以及权限
//      * 步骤：根据用户名获取角色以及权限，然后设置到验证信息类并返回。
//      * @param principalCollection
//      * @return
//      */
//     @Override
//     protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//         SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//
//         String userName = principalCollection.getPrimaryPrincipal().toString();
//
//         // 根据用户名查找该用户
//         User user =  userRepository.findByUsername(userName);
//
//         // 获取该用户的角色
//         Set<Role> roles = user.getRoles();
//         Set<String> roleSets = new HashSet<>();
//
//         // 获取该用户的权限集
//         List<Right> rights = new ArrayList<>();
//         Set<String> rightSet = new HashSet<>();
//
//         //将List转为Set
//         if(roles !=null && roles.size()>0){
//             for(Role role:roles){
//                 roleSets.add(role.getName());
//                 rights.addAll(role.getRights());
//             }
//         }
//
//         //将List转为Set
//         if(rights.size() >0){
//             for(Right p :rights){
//                 rightSet.add(p.getName());
//             }
//         }
//
//
//         info.addRoles(roleSets);
//         info.addStringPermissions(rightSet);
//
//         return info;
//     }
//
//     /**
//      * 认证，即用户账号密码是否正确
//      * @param token
//      * @return
//      * @throws AuthenticationException
//      */
//     @Override
//     protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//         // 获取用户名和密码
//         String userName = (String)token.getPrincipal();
//         String passWord = new String((char[]) token.getCredentials());
//
//         // 根据用户名查找该用户
//         User user =  userRepository.findByUsername(userName);
//
//
//         if(user == null){
//             throw new UnknownAccountException("用户名不存在");
//         }
//
//         if(!BCrypt.checkpw(passWord,user.getPassword())){
//             throw new IncorrectCredentialsException("密码错误");
//         }
//
//         SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),getName());
//
//         return info;
//     }
// }
