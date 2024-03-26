package org.example.feb25;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;




public class ReadFromExcelSheet {
    public static void main(String[] args) throws Exception{


        File file = new File("C:\\Users\\rbsap\\IntelljWorkSpace\\Assignment_16_Mar_2024\\" +
                "src\\main\\resources\\newEmployee.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("binary format data: "+fileInputStream);

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        int numberOfSheets=xssfWorkbook.getNumberOfSheets();
        System.out.println("number of sheets"+numberOfSheets);

        for(int i=0;i<numberOfSheets;i++){
            XSSFSheet xssfSheet=xssfWorkbook.getSheetAt(i);
            System.out.println(xssfSheet.getPhysicalNumberOfRows());

            Iterator<Row> rowIterator =xssfSheet.iterator();
            while (rowIterator.hasNext()){
                Row row=rowIterator.next();
                System.out.println(row.getPhysicalNumberOfCells());

                Iterator< Cell> cellIterator =row.cellIterator();
                while (cellIterator.hasNext()){
                    Cell cell=cellIterator.next();
                    switch (cell.getCellType()){
                        case STRING :
                            System.out.println(cell.getStringCellValue());
                            break;

                        case NUMERIC:
                            if(DateUtil.isCellDateFormatted(cell)){
                               // System.out.println(cell.getDateCellValue());
                                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
                                Date date=cell.getDateCellValue();
                                String cellValue=simpleDateFormat.format(date);
                               System.out.println(cellValue);




                            }else {
                                Double var=Double.parseDouble(String.valueOf(cell.getNumericCellValue()));

                                if(cell.getColumnIndex()==3){
                                    System.out.println(var);
                                }else if (cell.getColumnIndex()==4){
                                    System.out.println(var.longValue());

                                }else {
                                    System.out.println(var.intValue());
                                }

                            }
                            break;
                        case BOOLEAN:
                            System.out.println(cell.getBooleanCellValue());
                            break;


                    }

                }
            }


        }



    }
}