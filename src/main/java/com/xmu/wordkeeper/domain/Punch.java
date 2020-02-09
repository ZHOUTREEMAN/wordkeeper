package com.xmu.wordkeeper.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author linlianhui
 * @date 2020/02/09
 */
@Data
public class Punch {
    private Integer id;
    private Integer userId;
    private LocalDateTime date;
    private Integer nums;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean isDeleted;
}
