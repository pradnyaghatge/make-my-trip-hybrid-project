package utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static XSSFSheet sheet;

	public ExcelReader(String excelpath, String sheetname)   {
		try {
		
		FileInputStream fis=new FileInputStream(excelpath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheet(sheetname);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public Object getspecificdata(int row, int column) {
		
		XSSFCell cell = sheet.getRow(row).getCell(column);

		if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();
		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
			return cell.getRawValue();
		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
			return cell.getBooleanCellValue();
		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
			return cell.getCellFormula();
		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return " ";
		} else

			return null;

	}
	
	public Object[][] getalldata()
	{
		int totalrows=sheet.getLastRowNum()+1;
		
		int totalcolumn=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[totalrows-1][totalcolumn];
		
		for(int i=1;i<totalrows;i++)
		{
			for(int j=0;j<totalcolumn;j++)
			{
				data[i-1][j]=getspecificdata(i,j);
			}
		}
		return data;
	}
}