package com.xmu.wordkeeper.dao;

import com.xmu.wordkeeper.domain.Punch;
import com.xmu.wordkeeper.mapper.PunchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author linlianhui
 * @date 2020/02/09
 */
@Repository
public class PunchDao {

    @Autowired
    private PunchMapper punchMapper;

    /**
     * 添加 punch
     *
     * @param punch 待添加 punch
     * @return 操作状态码
     */
    public int insertPunch(Punch punch)
    {
        punch.setGmtCreate(LocalDateTime.now());
        punch.setGmtModified(LocalDateTime.now());
        punch.setIsDeleted(false);

        return punchMapper.insertPunch(punch);
    }

    /**
     * 删除 punch
     *
     * @param id 主键
     * @return 操作状态码
     */
    public int deletePunchById(Integer id)
    {
        Punch punch = punchMapper.selectPunchById(id);
        if(null != punch)
        {
            punch.setGmtModified(LocalDateTime.now());
            punchMapper.updatePunch(punch);
        }

        return punchMapper.deletePunchById(id);
    }

    /**
     * 更新 punch
     *
     * @param punch 待更新 punch
     * @return 操作状态码
     */
    public int updatePunch(Punch punch)
    {
        Punch temp = punchMapper.selectPunchById(punch.getId());
        if(null != temp)
        {
            punch.setGmtCreate(temp.getGmtCreate());
            punch.setGmtModified(LocalDateTime.now());
        }

        return punchMapper.updatePunch(punch);
    }

    /**
     * 通过主键查询 punch
     *
     * @param id 主键
     * @return Punch
     */
    public Punch selectPunchById(Integer id)
    {
        return punchMapper.selectPunchById(id);
    }

    /**
     * 查询所有 punch
     *
     * @return Punch列表
     */
    public List<Punch> selectAllPunches()
    {
        return punchMapper.selectAllPunches();
    }
}
