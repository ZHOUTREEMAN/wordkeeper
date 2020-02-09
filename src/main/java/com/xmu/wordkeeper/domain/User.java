package com.xmu.wordkeeper.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户信息实体类
 *
 * @author linlianhui
 * @date 2020/02/09
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String userPhoto;
    private boolean roleId;
    private String passw;
    private String email;
    private String tel;
    private Integer vocabulary;
    private Integer numEveryday;
    private String books;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean isDeleted;
}
