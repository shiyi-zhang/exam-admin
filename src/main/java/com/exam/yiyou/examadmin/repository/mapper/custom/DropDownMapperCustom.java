package com.exam.yiyou.examadmin.repository.mapper.custom;

import java.util.List;
import java.util.Map;

/**
 * @author 张世一
 * @version 1.0
 */
public interface DropDownMapperCustom {

    List<Map<String,String>> examList();

    List<Map<String,String>> getPapers();

    List<Map<String,String>> getSpecials();

   List<Map<String,String>> getTestCentres();
}
