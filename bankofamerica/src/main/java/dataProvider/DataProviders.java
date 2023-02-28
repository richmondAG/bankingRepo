/**
 * 
 */
package dataProvider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import utility.NewExcelLibrary;

/**
 * @author richm
 *
 */
public class DataProviders  {
	
	NewExcelLibrary obj = new NewExcelLibrary();

	//Class --> LoginPageTest,HomePageTest Test Case--> loginTest, wishListTest, orderHistoryandDetailsTest
	

		@DataProvider(name = "payBillData")
		public Object[][] getCredentials() {
		
			// Totals rows count
			int rows = obj.getRowCount("PayBill");
			// Total Columns
			int column = obj.getColumnCount("PayBill");
			int actRows = rows - 1;
			
			//Created an object of array to store data
			Object[][] data = new Object[actRows][1];

			for (int i = 0; i < actRows; i++) {
				Map<String, String> hashMap = new HashMap<>();
				for (int j = 0; j < column; j++) {
					hashMap.put(obj.getCellData("PayBill", j, 1), obj.getCellData("PayBill", j,i+ 2));
					
				}
				data[i][0]=hashMap;
				
			}
			return data;
	
	
		}
	

}
