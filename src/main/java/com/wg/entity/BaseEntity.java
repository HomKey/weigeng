package com.wg.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HomKey on 2019/12/23.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @CreatedDate
    @Column(updatable = false, nullable = false)
    private Date createTime;
    @LastModifiedDate
    @Column(nullable = false)
    private Date updateTime;

    /**
     * 创建人
     */
//    @CreatedBy
//    private Integer createBy;

    /**
     * 最后修改人
     */
//    @LastModifiedBy
//    private Integer lastModifiedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
