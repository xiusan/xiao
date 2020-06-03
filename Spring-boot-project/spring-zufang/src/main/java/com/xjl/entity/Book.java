package com.xjl.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;


@Data
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @NotNull(message = "dsssssssssssssss")
    private String name;
    @Size(min = 1,max = 3,message = "撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地撒大声地")
    private Long price;
    //getter/setter
}
