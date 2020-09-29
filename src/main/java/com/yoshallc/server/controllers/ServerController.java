package com.yoshallc.server.controllers;


import com.yoshallc.server.dtos.ReportFilter;
import com.yoshallc.server.services.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yoshallc.server.dtos.EmployeeReport;

@RestController()
@RequestMapping("/v1/server/api")
public class ServerController {


    @Autowired
    BackendService backendService;

    @PostMapping(value = "/employee/data",consumes = "application/json", produces = "application/json")
    public EmployeeReport employeeReport(@RequestBody ReportFilter reportFilter){

        return backendService.getEmployeeData(reportFilter);

    }

}
