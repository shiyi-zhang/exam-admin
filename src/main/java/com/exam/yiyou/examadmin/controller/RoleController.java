package com.exam.yiyou.examadmin.controller;

import com.exam.yiyou.examadmin.entry.BaseResponseBean;
import com.exam.yiyou.examadmin.entry.RoleBean;
import com.exam.yiyou.examadmin.service.RoleService;
import com.exam.yiyou.examadmin.utils.ApiVersion;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张世一
 * @version 1.0
 */
@ApiVersion(1)
@RestController
@RequestMapping("{version}/users")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity list(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
        @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        return ResponseEntity.status(HttpStatus.OK).body(new BaseResponseBean<>(roleService.list(), page));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody RoleBean bean){
        return ResponseEntity.status(HttpStatus.CREATED).body(roleService.update(bean));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody RoleBean bean){
        return ResponseEntity.status(HttpStatus.CREATED).body(roleService.save(bean));
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam Integer id){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(roleService.delete(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity single(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(roleService.single(id));
    }

}
