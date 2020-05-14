package com.sahildiwan.controller;

import com.sahildiwan.models.FinanceData;
import com.sahildiwan.service.FinanceDataService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Api(value = "Swagger2DemoRestController", description = "REST APIs!!!!")
@RequestMapping("/api/v1")
public class FinanceController {
    @Autowired
    FinanceDataService financeDataService;

    @GetMapping()
    public ArrayList<FinanceData> getFinanceData(){
        ArrayList<FinanceData> financeDetails=financeDataService.parseCsv();
        return financeDetails;
    }

}
