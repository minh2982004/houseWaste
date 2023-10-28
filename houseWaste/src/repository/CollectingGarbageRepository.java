
package repository;
import Access.GarbageDao;
import model.GarbageTruck;
import model.GarbageStation;

public class CollectingGarbageRepository implements ICollectingGarbageRepository
{

    @Override
    public void getInput(GarbageTruck g) {
       GarbageDao.Instance().getInput(g);
               
    }

    @Override
    public void printTheCost(GarbageTruck g) {
        GarbageDao.Instance().printTheCost(g);
    }
  
}