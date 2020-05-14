package com.sahildiwan.service;

import com.sahildiwan.models.FinanceData;

import java.util.ArrayList;

public interface FinanceDataService {

    public ArrayList<FinanceData> parseCsv();
}
