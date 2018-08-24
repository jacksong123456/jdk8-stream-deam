package com.test.stream.deam.po;



import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author jacksong
 * Created by  on 2018/8/24
 */
@Getter
@Setter
public class User implements Serializable {

    private String name;

    private int age;
}
