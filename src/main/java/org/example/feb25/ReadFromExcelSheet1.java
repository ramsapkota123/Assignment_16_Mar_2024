package org.example.feb25;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReadFromExcelSheet1 {
    public static void main(String[] args) throws Exception {
        List<Employee> employeeList = new ArrayList<>();


        File file = new File("C:\\Users\\rbsap\\IntelljWorkSpace\\Assignment_16_Mar_2024\\" +
                "src\\main\\resources\\newEmployee.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("binary format data: " + fileInputStream);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        int numberOfSheets = xssfWorkbook.getNumberOfSheets();
        System.out.println("number of sheets" + numberOfSheets);

        for (int i = 0; i < numberOfSheets; i++) {
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(i);
            System.out.println(xssfSheet.getPhysicalNumberOfRows());

            Iterator<Row> rowIterator = xssfSheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                System.out.println(row.getPhysicalNumberOfCells());
                Employee employee = new Employee();
                Iterator<Cell> cellIterator = row.cellIterator();
                if (row.getRowNum() != 0) {
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        switch (cell.getColumnIndex()) {
                            case 0:
                                Double var1 = Double.parseDouble(String.valueOf(cell.getNumericCellValue()));
                                employee.setEmpId(var1.intValue());
                                break;

                            case 1:
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                Date date = cell.getDateCellValue();
                                String cellValue = simpleDateFormat.format(date);
                                //System.out.println(cellValue);
                                employee.setDoj(cellValue);
                                break;
                            case 2:
                                Double var6 = Double.parseDouble(String.valueOf(cell.getNumericCellValue()));

                                if (cell.getColumnIndex() == 3) {
                                    //System.out.println(var);
                                    employee.setEmpSal(var6);
                                }
                                break;
                            case 3:
                                Long var9 = Long.parseLong(String.valueOf(cell.getNumericCellValue()));
                                if (cell.getColumnIndex() == 4) {
                                    employee.setEmpMobile(var9);
                                }
                                break;


                            case 4:
                                //System.out.println(cell.getBooleanCellValue());
                                employee.setEmpName(cell.getStringCellValue());
                                break;

                            case 5:
                                employee.setEmpAddress(cell.getStringCellValue());
                                break;

                            case 6:
                                employee.setDepartment(cell.getStringCellValue());
                                break;


                        }

                    }
                    employeeList.add(employee);


                }


            }
            System.out.println(employeeList);


        }


    }
}