import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
    	 People p1 = new People("001",20);
         People p2 = new People("002",30);
         People p3 = new People("003",45);
         //實作1:請實作一個泛型的Map中的key值為people的id，value為people物件，將上述三個people放入Map中
     	Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("001",20);
        map.put("002",30);
        map.put("003",45);        
        float sum = 0; 
         //實作2:請用for迴圈或者iterator，計算Map中三人的平均年齡
        Set entrySet = map.entrySet();
        for (Object e : entrySet) {
    		Map.Entry entry = (Map.Entry)e;
    		sum += (Integer)entry.getValue();
    				
		}
        System.out.println("平均年齡=" + sum/3);
    }
}
