package com.orange.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Orange
 * @create 2020-11-07 11:05
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {

    private int id;
    private String studentId;
    private String studentName;
    private String studentGender;
    private int studentAge;
    private String studentPhone;
    private String studentDorm;

}
