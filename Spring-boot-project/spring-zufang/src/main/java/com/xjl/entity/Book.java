package com.xjl.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


@Data
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @NotNull(message = "dsssssssssssssss")
    private String name;
    @NotNull
    private Long price;
    //getter/setter
}
