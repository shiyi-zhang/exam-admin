package com.exam.yiyou.examadmin.entry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pagehelper.Page;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 张世一
 * @version 1.0
 */
@Data
@NoArgsConstructor
public class BaseResponseBean<T> {

    @JsonProperty("items")
    private List<T> items;
    @JsonProperty("pager")
    private Page pager;

    public BaseResponseBean(List<T> items, Page<?> page) {
        this.items = items;
        this.pager = page;
    }
}
