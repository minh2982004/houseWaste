
package Access;

import common.Library;
import java.util.ArrayList;
import model.GarbageStation;
import model.GarbageTruck;


public class GarbageDao {
    Library l = new Library();
    private static GarbageDao instance = null;
    public static GarbageDao Instance() {
        if (instance == null)
            synchronized (GarbageDao.class) {
                if (instance == null)
                    instance = new GarbageDao();
            }
        return instance;        
    }
    public void getFakeInput(ArrayList<GarbageStation> garbageStations) {

        garbageStations.add(new GarbageStation(1, 1765));
        garbageStations.add(new GarbageStation(2, 2808));
        garbageStations.add(new GarbageStation(3, 952));
        garbageStations.add(new GarbageStation(4, 4206));
        garbageStations.add(new GarbageStation(5, 3102));
        garbageStations.add(new GarbageStation(6, 3902));
        garbageStations.add(new GarbageStation(7, 1292));
        garbageStations.add(new GarbageStation(8, 3985));
        garbageStations.add(new GarbageStation(9, 8324));
        garbageStations.add(new GarbageStation(10, 1928));
        garbageStations.add(new GarbageStation(11, 4426));
        garbageStations.add(new GarbageStation(12, 397));
        garbageStations.add(new GarbageStation(13, 3277));
    }
    public void getInput(GarbageTruck g) {

        getFakeInput(g.getGarbageStations());
        System.out.println("Added successfully");
    }
    public void printTheCost(GarbageTruck g) {
        System.out.println(g);
    }

    private int generateId(ArrayList<GarbageStation> garbageStations) {
        return garbageStations.size() + 1;
    }
}