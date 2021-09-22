package com.example.spring_boot_jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="role")
public class Role extends BaseActivity{
    private String roleName;
    private String roleKey;

    @OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinTable(name="role_permission",joinColumns = {@JoinColumn(name = "role_id")},
    inverseJoinColumns = {@JoinColumn(name = "permission_id")})
    private Set<Role> roles = new HashSet<>();
}
