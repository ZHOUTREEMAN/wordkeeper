package com.xmu.wordkeeper.service;

import com.xmu.wordkeeper.domain.Punch;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 32920
 */
@Service
public interface PunchService {
    /**
     * 增加打卡记录
     * @param punch
     * @return
     */
    public Punch addPunch(Punch punch);

    /**
     * 删除打卡记录
     * @param id
     * @return
     */
    public int delPunch(Integer id);

    /**
     * 修改打卡记录
     * @param punch
     * @return
     */
    public Punch setPunch(Punch punch);

    /**
     * 寻找打卡记录
     * @param id
     * @return
     */
    public Punch findPunch(Integer id);

    /**
     * 寻找打卡记录列表
     * @param userId
     * @return
     */
    public List<Punch> findPunchList(Integer userId);
}
