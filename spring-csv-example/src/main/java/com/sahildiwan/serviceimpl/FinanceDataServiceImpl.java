package com.sahildiwan.serviceimpl;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.sahildiwan.models.FinanceData;
import com.sahildiwan.service.FinanceDataService;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;


@Service
public class FinanceDataServiceImpl implements FinanceDataService {

    private static final String SAMPLE_CSV_FILE_PATH = "X:\\TECHED\\Spring CSV\\SpringCsv\\spring-csv-example\\FL_insurance_sample.csv";

    @Override
    public ArrayList<FinanceData> parseCsv(){

        ArrayList<FinanceData> respList = new ArrayList<>();
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        ) {
            CsvToBean<FinanceData> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(FinanceData.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<FinanceData> csvFinanceIterator = csvToBean.iterator();

            while (csvFinanceIterator.hasNext()) {
                FinanceData csvUser = csvFinanceIterator.next();
                FinanceData finData = new FinanceData();
                finData.setPolicyID(csvUser.getPolicyID());
                finData.setStatecode(csvUser.getStatecode());
                finData.setCounty(csvUser.getCounty());
                finData.setEq_site_limit(csvUser.getEq_site_limit());
                finData.setHu_site_limit(csvUser.getHu_site_limit());
                finData.setFl_site_limit(csvUser.getFl_site_limit());
                finData.setFr_site_limit(csvUser.getFr_site_limit());
                finData.setTiv_2011(csvUser.getTiv_2011());
                finData.setTiv_2012(csvUser.getTiv_2012());
                finData.setEq_site_deductible(csvUser.getEq_site_deductible());
                finData.setHu_site_deductible(csvUser.getHu_site_deductible());
                finData.setFl_site_deductible(csvUser.getFl_site_deductible());
                finData.setFr_site_deductible(csvUser.getFr_site_deductible());
                finData.setPoint_latitude(csvUser.getPoint_latitude());
                finData.setPoint_longitude(csvUser.getPoint_longitude());
                finData.setLine(csvUser.getLine());
                finData.setConstruction(csvUser.getConstruction());
                finData.setPoint_granularity(csvUser.getPoint_granularity());
                respList.add(finData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return respList;
    }
}
