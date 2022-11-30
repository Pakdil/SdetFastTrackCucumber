package com.sdetfastrack.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    String filePath = "SampleData.xlsx";

    XSSFWorkbook workbook;
    XSSFSheet sheet;

    @Test
    public void excel_write() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");

        XSSFCell salaryCell = sheet.getRow(0).createCell(3);

        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary1.setCellValue(110000);

        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary1.setCellValue(35000);

        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary1.setCellValue(125000);


        // open to write to the file: FileInputStream --> reading
        // save changes : FileOutputStream --> writting 

        FileOutputStream outputStream = new FileOutputStream(filePath);



    }
}
