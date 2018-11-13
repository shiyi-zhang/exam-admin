package com.exam.yiyou.examadmin.entry;

import com.exam.yiyou.examadmin.repository.model.User;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 张世一
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class UserBean extends User implements Serializable {

}
