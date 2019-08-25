package com.academy.lesson10;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Properties;

public class ExcelDemo {
    public static void main(String[] args) {
        // 1 способ
        String pathToPropertyFile = args[0];
        // 2 способ
        String pathToPropertyFile2 = System.getProperty("path");
        // Запись в файл
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Demo");
        XSSFRow row = sheet.createRow(0);
        XSSFCell col1 = row.createCell(0);
        XSSFCell col2 = row.createCell(1);

        col1.setCellValue("Helen");
        col2.setCellValue(25);

        String path = getExcelPath(pathToPropertyFile2);
        try(FileOutputStream fos = new FileOutputStream(new File(path))) {
            workbook.write(fos);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение в файл
        try (FileInputStream fis = new FileInputStream(new File(path))) {
            XSSFWorkbook workbookReader = new XSSFWorkbook(fis);
            XSSFSheet sheetDemo = workbookReader.getSheet("Demo");
            XSSFRow row1 = sheetDemo.getRow(0);
            XSSFCell cell = row1.getCell(0);
            String name = cell.getStringCellValue();
            System.out.println("Name: " + name);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String getExcelPath(String pathToPropertyFile) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(pathToPropertyFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("excel.path");
    }
}
