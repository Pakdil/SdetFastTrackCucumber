package com.sdetfastrack.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

@Test
    public void read_from_excel_file() throws IOException {
    String path = "SampleData.xlsx";

    File file = new File(path);

    // to read from excel we need to load it to FileInput Stream

    FileInputStream fileInputStream = new FileInputStream(file);

    // workbook>sheet>row>cell

    //<1> Create a workbook

    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    // <2> We need to get specific sheet from currently opened workbook
    XSSFSheet sheet = workbook.getSheet("Employees");

    // <3> Select row and cell
    // Print out mary's cell
    // Indexes start from 0
    System.out.println(sheet.getRow(3).getCell(2));

}


}
