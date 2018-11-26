package com.exam.yiyou.examadmin.service.impl;

import com.exam.yiyou.examadmin.repository.mapper.custom.DropDownMapperCustom;
import com.exam.yiyou.examadmin.service.DropDownService;
import java.util.List;
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
    public List<Map<String, String>> examList() {
        return dropDownMapperCustom.examList();
    }

    @Override
    public List<Map<String, String>> getPapers() {
        return dropDownMapperCustom.getPapers();
    }

    @Override
    public List<Map<String, String>> getSpecials() {
        return dropDownMapperCustom.getSpecials();
    }

    @Override
    public List<Map<String, String>> getTestCentres() {
        return dropDownMapperCustom.getTestCentres();
    }


}
