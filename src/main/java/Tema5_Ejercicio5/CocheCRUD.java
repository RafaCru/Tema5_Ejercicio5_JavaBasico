package Tema5_Ejercicio5;

import Tema5_Ejercicio5.Coche;

import java.util.List;

public interface CocheCRUD {
    void save(Coche coche);
    List<Coche>findAll();
    void Update(Coche coche);
    void delete(Coche coche);
}
