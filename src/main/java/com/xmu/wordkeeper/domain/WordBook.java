package com.xmu.wordkeeper.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 单词书实体类
 *
 * @author linlianhui
 * @date 2020/02/09
 */
@Data
public class WordBook {
    private Integer id;
    private String word;
    private String paraphrase;
    private String remark;
    private Integer userId;
    private LocalDateTime date;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private Boolean isDeleted;
}
