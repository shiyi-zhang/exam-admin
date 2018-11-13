package com.exam.yiyou.examadmin.repository.model;

import java.util.Date;

public class ErrorExam extends ErrorExamKey {
    private Integer errorCount;

    private Date creativeTime;

    private Date updateTime;

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Date getCreativeTime() {
        return creativeTime;
    }

    public void setCreativeTime(Date creativeTime) {
        this.creativeTime = creativeTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}