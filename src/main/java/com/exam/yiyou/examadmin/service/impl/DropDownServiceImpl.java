package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.repository.mapper.custom.DropDownMapperCustom;
import com.exam.yiyou.examadmin.service.DropDownService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张世一
 * @version 1.0
 */
@Service
public class DropDownServiceImpl implements DropDownService {

    @Autowired
    private DropDownMapperCustom dropDownMapperCustom;


    @Override
    public Map<Integer, String> examList() {
        return dropDownMapperCustom.examList();
    }
}
