
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//ATTENTION! This class uses external library Apache POI Project - Java API for Microsoft Documents

public class _11Excel {

	static class Office {
		public String name;
		public double income;

		public Office(String officeName, double officeIncome) {
			name = officeName;
			income = officeIncome;
		}
	}

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File(
					"SourceFiles/Problem11/3. Incomes-Report.xlsx"));

			ArrayList<Office> offices = new ArrayList<>();
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			workbook.close();
			double sum = 0;

			for (int i = 1; i < 12; i++) {
				XSSFCell cellOffice = sheet.getRow(i).getCell(0);
				XSSFCell cellIncome = sheet.getRow(i).getCell(5);
				String cellOfficeStr = cellOffice.getStringCellValue();
				double cellIncomeNum = cellIncome.getNumericCellValue();
				boolean officeExists = false;
				int index = 0;

				for (int j = 0; j < offices.size(); j++) {
					if (cellOfficeStr.equals(offices.get(j).name)) {
						officeExists = true;
						index = j;
					}
				}

				if (officeExists) {
					offices.get(index).income = offices.get(index).income
							+ cellIncomeNum;
				} else {
					Office newOffice = new Office(cellOfficeStr, cellIncomeNum);
					offices.add(newOffice);
				}

				sum += cellIncomeNum;
			}
			
			//workbook.close();
			file.close();

			Collections.sort(offices, new Comparator<Office>() {
				@Override
				public int compare(Office o1, Office o2) {
					return o1.name.compareTo(o2.name);
				}
			});

			for (int i = 0; i < offices.size(); i++) {
				System.out.printf("%s Total -> %.2f", offices.get(i).name,
						offices.get(i).income);
				System.out.println();
			}
			System.out.printf("Grand Total -> %.2f", sum);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
