package com.exam.yiyou.examadmin.controller;

import com.exam.yiyou.examadmin.entry.PaperBean;
import com.exam.yiyou.examadmin.repository.model.Paper;
import com.exam.yiyou.examadmin.service.PaperService;
import com.exam.yiyou.examadmin.utils.ApiVersion;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
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
@RequestMapping("{version}/papers")
public class PaperController {

    @Autowired
    private PaperService paperService;

    @GetMapping
    public ResponseEntity list(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
        @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Paper> list = paperService.list();
        return ResponseEntity.status(HttpStatus.OK).body(new PageInfo(list));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody PaperBean bean){
        return ResponseEntity.status(HttpStatus.CREATED).body(paperService.update(bean));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody PaperBean bean){
        return ResponseEntity.status(HttpStatus.CREATED).body(paperService.save(bean));
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam Integer id){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(paperService.delete(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity single(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(paperService.single(id));
    }

}
