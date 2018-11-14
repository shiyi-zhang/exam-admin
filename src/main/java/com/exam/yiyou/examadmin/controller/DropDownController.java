package com.exam.yiyou.examadmin.controller;

import com.exam.yiyou.examadmin.service.DropDownService;
import com.exam.yiyou.examadmin.utils.ApiVersion;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张世一
 * @version 1.0
 */
@ApiVersion(1)
@RestController
@RequestMapping("{version}/list")
public class DropDownController {

    @Autowired
    private DropDownService dropDownService;

    @GetMapping("exams")
    public Map<Integer, String> examList() {
        return dropDownService.examList();
    }
}
