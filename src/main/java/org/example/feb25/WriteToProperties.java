package org.example.feb25;

import java.io.FileWriter;
import java.util.Properties;

public class WriteToProperties {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\rbsap\\IntelljWorkSpace\\Assignment_16_Mar_2024\\" +
                    "src\\main\\resources\\employee.properties");
            Properties properties=new Properties();
            properties.setProperty("empId", "1006");
            properties.setProperty("empName", "Ruby Lama");
            properties.setProperty("empAddress", "San Diego");
            properties.setProperty("empSal", "3243.43");
            properties.setProperty("empMobile", "3456776532");
            properties.setProperty("department", "Finance");
            properties.setProperty("doj", "2021-12-23");

            properties.setProperty("empId1", "1007");
            properties.setProperty("empName1", "Danjo");
            properties.setProperty("empAddress1", "Las Vegas");
            properties.setProperty("empSal1", "1243.43");
            properties.setProperty("empMobile1", "7456776532");
            properties.setProperty("department1", "HR");
            properties.setProperty("doj1", "2022-12-21");

            properties.setProperty("empId2", "1008");
            properties.setProperty("empName2", "Jack Sophia");
            properties.setProperty("empAddress2", "Boston");
            properties.setProperty("empSal2", "2243.43");
            properties.setProperty("empMobile2", "8456776532");
            properties.setProperty("department2", "Science");
            properties.setProperty("doj2", "2021-10-25");
            properties.store(fileWriter,"updating ram");
        }catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();

        }
    }
}