// package StarGalaxy;

import java.util.ArrayList;
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
}