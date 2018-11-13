package com.exam.yiyou.examadmin.service;

import com.exam.yiyou.examadmin.entry.PaperBean;
import com.exam.yiyou.examadmin.repository.model.Paper;
import java.util.List;

/**
 * @author 张世一
 * @version 1.0
 */
public interface PaperService {

    List<Paper> list();

    boolean update(PaperBean bean);

    boolean save(PaperBean bean);

    boolean delete(Integer id);

    Paper single(Integer id);
}
