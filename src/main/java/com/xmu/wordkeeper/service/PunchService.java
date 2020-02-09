package com.xmu.wordkeeper.service;

import com.xmu.wordkeeper.domain.Punch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PunchService {
    public Punch addPunch(Punch punch);
    public int delPunch(Integer id);
    public Punch setPunch(Punch punch);
    public Punch findPunch(Integer id);
    public List<Punch> findPunchList(Integer userId);
}
