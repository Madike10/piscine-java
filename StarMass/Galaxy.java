// package StarMass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Galaxy{
    private List<CelestialObject> celestialObjects;
    public Galaxy(){
        celestialObjects = new ArrayList<CelestialObject>();
    }
    public List<CelestialObject> getCelestialObjects(){
        return celestialObjects;
    }
    public void  addCelestialObject(CelestialObject object){
       this.celestialObjects.add(object);
    }
    public HashMap<String, Integer> computeMassRepartition() {
        HashMap<String, Integer> massRepartition = new HashMap<>();
        massRepartition.put("Star", 0);
        massRepartition.put("Planet", 0);
        massRepartition.put("Other", 0);

        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                massRepartition.put("Star", massRepartition.get("Star") + ((Star) obj).getMass());
            } else if (obj instanceof Planet) {
                massRepartition.put("Planet", massRepartition.get("Planet") + ((Planet) obj).getMass());
            } else {
                massRepartition.put("Other", massRepartition.get("Other") + obj.getMass());
            }
        }

        return massRepartition;
    }
}