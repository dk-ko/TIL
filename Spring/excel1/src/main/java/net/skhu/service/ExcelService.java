package net.skhu.service;

import java.util.GregorianCalendar;
import java.util.List;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;

import net.skhu.model.Person;

@Service
public class ExcelService {
	
	Person[] persons = new Person[] {
			new Person(1, "홍길동", new GregorianCalendar(1995, 3, 15).getTime(), 90.5, true),
			new Person(2, "임꺽정", new GregorianCalendar(1993, 5, 25).getTime(), 85.3, true),
			new Person(3, "전우치", new GregorianCalendar(1991, 7, 13).getTime(), 100.0, true)
	};
	
	public List<Person> findAll() {
		return Arrays.asList(persons);
	}
	
	CellStyle createDateStyle(Workbook workbook, String dateFormat) {
		CellStyle style=workbook.createCellStyle();
		CreationHelper createHelper = workbook.getCreationHelper();
		style.setDataFormat(createHelper.createDataFormat().getFormat(dateFormat));
		return style;
	}
	
	public Workbook createXLS(List<Person> persons) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		
		int rowCount = 0;
		Row row = sheet.createRow(rowCount++);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("이름");
		row.createCell(2).setCellValue("생일");
		row.createCell(3).setCellValue("점수");
		row.createCell(4).setCellValue("활성화");
		
		sheet.setColumnWidth(0, 5*256);
		sheet.setColumnWidth(1, 10*256);
		sheet.setColumnWidth(2, 11*256);
		sheet.setColumnWidth(3, 7*256);
		sheet.setColumnWidth(3, 7*256);
		
		CellStyle dateStyle = createDateStyle(workbook, "yyyy-MM-dd");
		
		for(Person person : persons) {
			row = sheet.createRow(rowCount++);
			row.createCell(0).setCellValue(person.getId());
			row.createCell(1).setCellValue(person.getName());
			row.createCell(2).setCellValue(person.getBirthDate());
			row.createCell(3).setCellValue(person.getScore());
			row.createCell(4).setCellValue(person.isEnabled());
			
			row.getCell(2).setCellStyle(dateStyle);
		}
		return workbook;
	}
	
	public List<Person> getPersons(InputStream input) throws Exception {
		List<Person> persons = new ArrayList<>();
		Workbook workbook = WorkbookFactory.create(input);
		Sheet sheet = workbook.getSheetAt(0);
		
		for(int r=1; r<sheet.getPhysicalNumberOfRows() ; ++r) {
			Row row = sheet.getRow(r);
			if(row.getCell(0) == null) break;
			int id = (int)row.getCell(0).getNumericCellValue();
			String name = row.getCell(1).getStringCellValue();
			Date birthDate = row.getCell(2).getDateCellValue();
			double score = row.getCell(3).getNumericCellValue();
			boolean enabled = row.getCell(4).getBooleanCellValue();
			persons.add(new Person(id,name,birthDate,score,enabled));
		}
		return persons;
	}

}
