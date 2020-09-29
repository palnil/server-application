package com.yoshallc.server.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportFilter {

    private int empId;
    private String firstName;
    private String lastName;
    private Department department;
}
