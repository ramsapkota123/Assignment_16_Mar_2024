package org.example.feb25;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class DataStoreInArray {
    public static void main(String[] args) {
        List<Employee>employeeList=new ArrayList<>();
        Properties properties=new Properties();
        FileInputStream fileInputStream=null;

        try {
            fileInputStream=new FileInputStream("C:\\Users\\rbsap\\IntelljWorkSpace\\Assignment_16_Mar_2024\\" +
                    "src\\main\\resources\\employee.properties");
            properties.load(fileInputStream);

            Employee employee1=new Employee();
                int empId = Integer.parseInt(properties.getProperty("empId" ));
                employee1.setEmpId(empId);
                String empName = properties.getProperty("empName" );
                employee1.setEmpName(empName);
                String empAddress = properties.getProperty("empAddress" );
                employee1.setEmpAddress(empAddress);
                double empSal = Double.parseDouble(properties.getProperty("empSal"));
                employee1.setEmpSal(empSal);
                long empMobile = Long.parseLong(properties.getProperty("empMobile" ));
                employee1.setEmpMobile(empMobile);
                String department = properties.getProperty("department" );
                employee1.setDepartment(department);
                String doj = properties.getProperty("doj" );
                employee1.setDoj(doj);



//
//                Employee employee2=new Employee();
//            String empId1 = properties.getProperty("empId1" );
//            employee2.setEmpId(empId1);
//            String empName1 = properties.getProperty("empName1" );
//            employee2.setEmpName(empName1);
//            String empAddress1 = properties.getProperty("empAddress1" );
//            employee2.setEmpAddress(empAddress1);
//            String empSal1 = properties.getProperty("empSal1" );
//            employee2.setEmpSal(empSal1);
//            String empMobile1 = properties.getProperty("empMobile1" );
//            employee2.setEmpMobile(empMobile1);
//            String department1 = properties.getProperty("department1" );
//            employee2.setDepartment(department1);
//            String doj1 = properties.getProperty("doj1" );
//            employee2.setDoj(doj1);
//
//            Employee employee3=new Employee();
//            String empId2 = properties.getProperty("empId2" );
//            employee3.setEmpId(empId2);
//            String empName2 = properties.getProperty("empName2" );
//            employee3.setEmpName(empName2);
//            String empAddress2 = properties.getProperty("empAddress2" );
//            employee3.setEmpAddress(empAddress2);
//            String empSal2 = properties.getProperty("empSal2" );
//            employee3.setEmpSal(empSal2);
//            String empMobile2 = properties.getProperty("empMobile2" );
//            employee3.setEmpMobile(empMobile2);
//            String department2 = properties.getProperty("department2" );
//            employee3.setDepartment(department2);
//            String doj2 = properties.getProperty("doj2" );
//            employee3.setDoj(doj2);


            employeeList.add(employee1);
//            employeeList.add(employee2);
//            employeeList.add(employee3);
            System.out.println(employeeList);







        } catch (IOException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }



    }
}