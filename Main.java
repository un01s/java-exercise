import java.util.HashMap;
import java.util.Map;

public class Main
{
    private static Map<Coordinate, Integer> scoreMap = new HashMap<Coordinate, Integer>();
    
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(1,2);
        Coordinate c2 = new Coordinate(2,3);
        scoreMap.put(c1, 0);
        scoreMap.put(c2, 0);
        if (scoreMap.containsKey(c1)) {
            System.out.println("scoreMap has c1");
            scoreMap.remove(c1);
            scoreMap.put(c1, 1);
        }
        System.out.println("scoreMap :"+scoreMap);
    }
}
