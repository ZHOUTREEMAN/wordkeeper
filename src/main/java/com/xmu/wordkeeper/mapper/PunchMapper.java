package com.xmu.wordkeeper.mapper;

import com.xmu.wordkeeper.domain.Punch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Punch 映射类
 *
 * @author linlianhui
 * @date 2020/02/09
 */
@Mapper
@Component
public interface PunchMapper {

    /**
     * 添加 punch
     *
     * @param punch 待插入 punch
     * @return 操作状态码
     */
    int insertPunch(Punch punch);

    /**
     * 删除 punch
     *
     * @param id 主键
     * @return 操作状态码
     */
    int deletePunchById(Integer id);

    /**
     * 更新 punch
     *
     * @param punch 待更新 punch
     * @return 操作状态码
     */
    int updatePunch(Punch punch);

    /**
     * 通过主键查询 punch
     *
     * @param id 主键
     * @return Punch
     */
    Punch selectPunchById(Integer id);

    /**
     * 查询所有 punch
     *
     * @return Punch列表
     */
    List<Punch> selectAllPunches();
}
