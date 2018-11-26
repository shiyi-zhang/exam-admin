package com.exam.yiyou.examadmin.entry;

import com.exam.yiyou.examadmin.repository.model.Exam;
import com.exam.yiyou.examadmin.repository.model.ExamAnswer;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * @author 张世一
 * @version 1.0
 */
@Data
public class ExamBean extends Exam implements Serializable {

    private List<ExamAnswer> answers;
}
