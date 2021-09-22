package com.example.spring_boot_jwt.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="permission")
@Getter
@Setter
public class Permission extends BaseActivity {
    private String permissionName;
    private String permissionKey;
}
