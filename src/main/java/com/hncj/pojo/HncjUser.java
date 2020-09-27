package com.hncj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HncjUser {

    private Long id;
    private String name;
    private Integer age;
}
