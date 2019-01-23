import java.util.*;

public class Trees {
  public static void main(String... args) {
    ArrayList<Map<String, Object>> treeMap = new ArrayList<Map<String, Object>>();

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("type", "willow"); //fűzfa
    row0.put("leaf color", "lightgreen");
    row0.put("age", 12);
    row0.put("sex", "male");
    treeMap.add(row0);

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("type", "gingko"); //gingkó
    row1.put("leaf color", "darkgreen");
    row1.put("age", 24);
    row1.put("sex", "female");
    treeMap.add(row1);

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("type", "oak"); //tölgyfa
    row2.put("leaf color", "green");
    row2.put("age", 36);
    row2.put("sex", "monoecious");
    treeMap.add(row2);

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("type", "juniper"); //boróka
    row3.put("leaf color", "silver blue");
    row3.put("age", 48);
    row3.put("sex", "female");
    treeMap.add(row3);

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("type", "red maple"); //vöröslevelű japán juhar
    row4.put("leaf color", "red");
    row4.put("age", 60);
    row4.put("sex", "polygamodioecious");
    treeMap.add(row4);

    for (int i = 0; i < treeMap.size(); i++) {
      System.out.println(treeMap.get(i).get("type"));
    }
  }
}
