package org.java.service.impl;

import org.java.dao.InfoMapper;
import org.java.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/8.
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoMapper infoDao;
    @Override
    public List<Map<String, Object>> selectAll() {
        return infoDao.selectAll();
    }
}
