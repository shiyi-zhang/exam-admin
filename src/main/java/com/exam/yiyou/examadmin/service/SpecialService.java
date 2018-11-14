package com.exam.yiyou.examadmin.service;

import com.exam.yiyou.examadmin.entry.SpecialBean;
import com.exam.yiyou.examadmin.repository.model.Special;
import java.util.List;

/**
 * @author 张世一
 * @version 1.0
 */
public interface SpecialService {

    List<Special> list(String name);

    boolean update(SpecialBean bean);

    boolean save(SpecialBean bean);

    boolean delete(Integer id);

    Special single(Integer id);
}
