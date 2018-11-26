package com.exam.yiyou.examadmin.service;

import java.util.List;
import java.util.Map;

/**
 * @author 张世一
 * @version 1.0
 */
public interface DropDownService {

    List<Map<String, String>> examList();

    List<Map<String, String>> getPapers();

    List<Map<String, String>> getSpecials();

    List<Map<String, String>> getTestCentres();
}
