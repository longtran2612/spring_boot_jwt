package com.example.spring_boot_jwt.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity(name="user")
public class User extends BaseActivity{
    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",joinColumns={@JoinColumn(name = "user_id")}
    ,inverseJoinColumns = {@JoinColumn(name="role_id")})
    private Set<Role> roles= new HashSet<>();

    }


