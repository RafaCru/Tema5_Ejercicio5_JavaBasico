package Tema5_Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CocheCRUDImpl implements CocheCRUD{
    List<Coche> coches =new ArrayList<>();

    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        return coches;
    }

    @Override
    public void Update(Coche coche) {
        for (int i=0;i< coches.size();i++){
            if (Objects.equals(coches.get(i).modelo, coche.modelo)){
            coches.set(i,coche);}

        }
    }

    @Override
    public void delete(Coche coche) {
        for (int i=0;i< coches.size();i++){
            if (Objects.equals(coches.get(i).modelo, coche.modelo)){
                coches.remove(i);}
        }

    }

    @Override
    public String toString() {
        return " CocheCRUDImpl{" +
                "coches=\n" + coches +
                '}';
    }
}
