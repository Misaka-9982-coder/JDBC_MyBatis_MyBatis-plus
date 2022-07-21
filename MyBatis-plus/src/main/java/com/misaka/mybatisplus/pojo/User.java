package com.misaka.mybatisplus.pojo;

import lombok.*;

//@NoArgsConstructor
//@Getter
//@Setter
//@ToString

@Data
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;
}
