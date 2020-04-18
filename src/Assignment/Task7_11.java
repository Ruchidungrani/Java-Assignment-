/**
 * Find to sort HashMap in java by keys and values?
 */

package Assignment;

import java.util.*;

public class Task7_11 {
    static Map<String, Integer> map = new HashMap<>();

    public static void KeySort()
    {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);

        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }

    public static HashMap<String, Integer> ValueSort(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry <String, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> x : list) {
            temp.put(x.getKey(), x.getValue());
        }
        return temp;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Task7_11.map.put("Ruchi", 88);
        Task7_11.map.put("Reema", 44);
        Task7_11.map.put("Bhavika", 66);
        Task7_11.map.put("Happy", 22);
        Task7_11.map.put("Ami", 11);
        Map<String, Integer> map1 = ValueSort (map);
        KeySort();
        for (Map.Entry<String, Integer> en : map1.entrySet()) {
            System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
        }

    }
}
