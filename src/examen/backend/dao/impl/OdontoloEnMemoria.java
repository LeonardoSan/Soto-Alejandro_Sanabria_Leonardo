package examen.backend.dao.impl;
import java.util.ArrayList;
import java.util.List;

public class OdontoloEnMemoria {
    private List<Odontologo> odontologos = new ArrayList<>();

    @Override
    public void guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    @Override
    public List<Odontologo> listarTodos() {
        return new ArrayList<>(odontologos);
    }
}
