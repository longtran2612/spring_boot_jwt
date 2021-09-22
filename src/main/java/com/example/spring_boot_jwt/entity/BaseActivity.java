package com.example.spring_boot_jwt.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Getter
@Setter
@MappedSuperclass
@EntityListeners(EntityListeners.class)
public class BaseActivity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deleted;
    @CreatedDate
    private Date createAt;
    @LastModifiedBy
    private Date updateAt;
    private Long createBy;
    private Long updateBy;

}
