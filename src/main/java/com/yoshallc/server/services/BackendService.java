package com.yoshallc.server.services;

import org.springframework.stereotype.Service;
import com.yoshallc.server.dtos.EmployeeReport;
import com.yoshallc.server.dtos.ReportFilter;


@Service
public class BackendService {

    public EmployeeReport getEmployeeData(ReportFilter reportFilter){

        return new EmployeeReport(reportFilter.getEmpId(),reportFilter.getFirstName() + " " +
                reportFilter.getLastName(),reportFilter.getDepartment().getDeptName());

    }







}
