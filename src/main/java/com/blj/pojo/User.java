package com.blj.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

//User
@Data
@Table(name = "user")
public class User implements Serializable {
   @Id
   @KeySql(useGeneratedKeys = true)
    private long userId;
    private String userName, password, telephone, unit, landmark;
    private long role;//
    private String name;
   // @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date enterdate;//
   //方法一：新添 用户角色名字 userRole
    @Transient //加上这个注解表示暂时用不上这个字段
    private String userRoleName;








}
