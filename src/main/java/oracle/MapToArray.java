package oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapToArray {
	String productName;
	String productId;
	String productType;
	String productBrand;
	int price;
	int weight;
	Map<String, String> properties;
	public Map<String, String> getProperties() {
		properties = new HashMap<String, String>();
		properties.put("productName", productName);
		properties.put("productId", productId);
		properties.put("productType", productType);
		properties.put("productBrand", productBrand);
		properties.put("price", ""+price);
		properties.put("weight", ""+weight);
		return properties;
	}
	public static void main(String[] args) {
		MapToArray mapToArray1 = new MapToArray();
		mapToArray1.productName = "productName1";
		mapToArray1.productId = "productId1";
		mapToArray1.productType = "productType1";
		mapToArray1.productBrand = "productBrand1";
		mapToArray1.price = 100;
		mapToArray1.weight = 100;
		MapToArray mapToArray2 = new MapToArray();
		mapToArray2.productName = "productName2";
		mapToArray2.productId = "productId2";
		mapToArray2.productType = "productType2";
		mapToArray2.productBrand = "productBrand2";
		mapToArray2.price = 200;
		mapToArray2.weight = 200;
		MapToArray mapToArray3 = new MapToArray();
		mapToArray3.productName = "productName3";
		mapToArray3.productId = "productId3";
		mapToArray3.productType = "productType3";
		mapToArray3.productBrand = "productBrand3";
		mapToArray3.price = 300;
		mapToArray3.weight = 300;
		MapToArray mapToArray4 = new MapToArray();
		mapToArray4.productName = "productName4";
		mapToArray4.productId = "productId4";
		mapToArray4.productType = "productType4";
		mapToArray4.productBrand = "productBrand4";
		mapToArray4.price = 400;
		mapToArray4.weight = 400;
		List<MapToArray> mapToArrays = new ArrayList<MapToArray>();
		mapToArrays.add(mapToArray1);
		mapToArrays.add(mapToArray2);
		mapToArrays.add(mapToArray3);
		mapToArrays.add(mapToArray4);
		String[][] array = getArray(false,mapToArrays);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
	private static String[][] getArray(boolean flag, List<MapToArray> mapToArrays) {
		if(!flag){
			String[][] strings = new String[mapToArrays.get(0).getProperties().keySet().size()][mapToArrays.size()+1];
			int i = 0,j = 0,count = 0;
			for (MapToArray map : mapToArrays) {
				i = 0;
				j = count > 0 ? count+1 : count;
				count++;
				Set<String> set = map.getProperties().keySet();
				for (String key : set) {
					if(j == 0){
						strings[i][j] = key; j++;
						strings[i][j] = map.getProperties().get(key);
						i++;j--;
					}else{
						strings[i][j] = map.getProperties().get(key);
						i++;
					}
				}
			}
			return strings;
		}else{
			
		}
		return null;
	}
}
