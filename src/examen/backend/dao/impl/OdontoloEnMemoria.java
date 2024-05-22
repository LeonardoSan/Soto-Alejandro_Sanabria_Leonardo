package examen.backend.dao.impl;
import examen.backend.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.ArrayList;

public class OdontoloEnMemoria implements IDao<Odontologo> {
    private Logger LOGGER = Logger.getLogger(OdontoloEnMemoria.class);
    List<Odontologo> odontologos = new ArrayList<>();
    @Override
    public Odontologo registrar(Odontologo odontologo) {
        Integer id = odontologos.size()+1;
        odontologo.setId(id);

        odontologos.add(odontologo);
        LOGGER.info("odontologo guardado: "+ odontologo);
        return odontologo;
    }

    @Override
    public Odontologo buscarPorId(Integer id) {
        for(Odontologo odontologo: odontologos){
            if(odontologo.getId().equals(id)){
                LOGGER.info("Odontologo encontrado: "+ odontologo);
                return odontologo;
            }
        }
        LOGGER.info("Odontologo no encontrado");
        return null;
    }

    @Override
    public List<Odontologo> buscarTodos() {
        return odontologos;
    }
}
}