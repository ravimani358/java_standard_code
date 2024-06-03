package hashmap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class crio_excel_code {

    public Object[][] dpMethod(Method m) throws IOException {
        int rowIndex = 0;
        int cellIndex = 0;
        List<List<String>> outputList = new ArrayList<>();

        FileInputStream excelFile = null;
        Workbook workbook = null;
        try {
            excelFile = new FileInputStream(new File("C:/Users/RavishankarN/eclips_respace/Java_takehome/Book1.xlsx"));
            workbook = new XSSFWorkbook(excelFile);
            Sheet selectedSheet = workbook.getSheet(m.getName());

            System.out.println(m.getName());

            Iterator<Row> iterator = selectedSheet.iterator();
            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                List<String> innerList = new ArrayList<>();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if (rowIndex > 0 && cellIndex > 0) {
                        if (cell.getCellType() == CellType.STRING) {
                            innerList.add(cell.getStringCellValue());
                        } else if (cell.getCellType() == CellType.NUMERIC) {
                            innerList.add(String.valueOf(cell.getNumericCellValue()));
                        }
                    }
                    cellIndex++;
                }
                rowIndex++;
                cellIndex = 0;
                if (!innerList.isEmpty()) {
                    outputList.add(innerList);
                }
            }
        } finally {
            if (workbook != null) {
                workbook.close();
            }
            if (excelFile != null) {
                excelFile.close();
            }
        }

        return outputList.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
    }

    public static void main(String[] args) {
        crio_excel_code instance = new crio_excel_code();
        try {
            // Since we don't have a Method instance in main, we will create a dummy method for testing
            Method dummyMethod = crio_excel_code.class.getMethod("dummyTestMethod");
            Object[][] data = instance.dpMethod(dummyMethod);
            // Print the data to verify
            for (Object[] row : data) {
                System.out.println(Arrays.toString(row));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Dummy method for testing purposes
    public static void dummyTestMethod() {
        // This method is just a placeholder for testing the dpMethod
    }
}
