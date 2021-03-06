package com.xmu.wordkeeper.service.serviceImpl;

import com.xmu.wordkeeper.dao.PunchDao;
import com.xmu.wordkeeper.domain.Punch;
import com.xmu.wordkeeper.service.PunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 32920
 */
@Service
public class PunchServiceImpl implements PunchService {
    @Autowired
    private PunchDao punchDao;
    @Override
    public Punch addPunch(Punch punch) {
        List<Punch> temp = punchDao.selectAllPunches(punch.getUserId());
        punch.setNums(temp.size()+1);
        int result=punchDao.insertPunch(punch);
        if(result==1) {
            return punch;
        } else {
            return null;
        }
    }

    @Override
    public int delPunch(Integer id) {
        return punchDao.deletePunchById(id);
    }

    @Override
    public Punch setPunch(Punch punch) {
        int result=punchDao.updatePunch(punch);
        if(result==1) {
            return punch;
        } else {
            return null;
        }
    }

    @Override
    public Punch findPunch(Integer id) {
        return punchDao.selectPunchById(id);
    }

    @Override
    public List<Punch> findPunchList(Integer userId) {
        return punchDao.selectAllPunches(userId);
    }
}
