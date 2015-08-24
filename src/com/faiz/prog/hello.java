//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
///**********************************************************************
//
//Author - Faiz
//Desription - To provide test data using data provider and Excel
//**********************************************************************/
//
//public class ReadFromExcelSheet {
//    public static XSSFWorkbook workbook;
//    public static XSSFSheet sheet;
//    public static XSSFRow row;
//    public static XSSFCell cell;
//    
//    
//    public static void main(String args[]) throws IOException {
//	String filePath = "/home/faiz/test.xlsx";
//	String[][] result = readFromExcel(filePath);
//	for(int i=0;i<result.length; i++)
//	    for (int j=0;j<result[i].length;j++)
//		System.out.println(result[i][j]);
//	
//    }
//    
//    public static String[][] readFromExcel(String filepath) throws IOException {
//	File file = new File(filepath);
//	FileInputStream fileInputStream = new FileInputStream(file);
//	
//	String[][] dataExcel = null;
//  //	System.out.println("inside read from file");
//	workbook = new XSSFWorkbook(fileInputStream);
//	sheet = workbook.getSheetAt(0);
//	int rowStart = 1, colStart = 1, totalRows = 0;
//	totalRows = sheet.getLastRowNum();
//	int Ci=0, Cj=0;
//	dataExcel=new String[totalRows][3];
//	for (int i=rowStart; i<= totalRows;i++, Ci++)
//	{
