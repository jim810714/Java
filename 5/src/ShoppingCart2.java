import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShoppingCart2 {
    public static void main(String[] args) {

        //實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)到shoppingList中

    	
        List<Product> shoppingList = new ArrayList<>();
        shoppingList.add(new Notebook("Asus",30000));
        shoppingList.add(new Notebook("Acer",20000));
        shoppingList.add(new Food("Cookie",200));

                
        //實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中
        int sum = 0;
        for (Product key : shoppingList) {
			Product name =  key;
			sum= sum + name.getPrice();
			}
        System.out.println(sum);
//    	int sum =0;
//    	
//		for (int i=0 ; i<shoppingList.size() ; i++) {
//			  
//			Object item = shoppingList.get(i);
//			System.out.println(item);
////			if(shoppingList.get(i) instanceof Number == true) {  
////				
////				sum = sum + (Integer)shoppingList.get(i) ;
//			}	
//		
////		System.out.println(sum);
//
//        Iterator iterator = shoppingList.iterator();
//        while (iterator.hasNext()) {
//			Object product = (Object) iterator.next();
//			System.out.println(product);
//		}
        
        //實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額,並印在Console中
        int sumNote = 0;
        
        for (Product key : shoppingList) {        	    
        	if ( Notebook.class.equals( key.getClass())  ) {
        		Product name =  key;
    			sumNote = sumNote + name.getPrice();
			}
				}
        System.out.println(sumNote);



    }
}
