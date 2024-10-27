package Service;
import Model.*;

import java.util.List;

public class AircraftService {
    GenericClass list = new GenericClass();


    public List Origin2Tags(List<Airport> origin){
        for(Airport a :origin){

            for(String tag : a.getEtiquetas()){
                list.add(tag);
            }



            list.add(a.getEtiquetas());
        }
        return (List) list;
    }

}
