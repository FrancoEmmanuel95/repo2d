package Model;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
    private List<T> generic= new ArrayList<>();

    public List<T> getGeneric() {
        return generic;
    }

    public void setGeneric(List<T> generic) {
        this.generic = generic;
    }
    public void add(T t ){
        this.generic.add(t);
    }
    public void remove(T t){
        this.generic.remove(t);
    }
    public void showList(){
        for(T t: generic){
            System.out.println(t);
        }
    }
    public void showElement(Integer index){
        System.out.println(generic.get(index));
    }

}
