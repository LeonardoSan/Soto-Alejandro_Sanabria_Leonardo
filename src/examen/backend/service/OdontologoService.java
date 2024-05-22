package examen.backend.service;

import examen.backend.dao.IDao;
import examen.backend.model.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo registrarOdontologo(Odontologo odontologo){
        return odontologoIDao.registrar(odontologo);
    }

    public Odontologo buscarPorId(Integer id){
        return odontologoIDao.buscarPorId(id);
    }

    public List<Odontologo> buscarTodos(){
        return odontologoIDao.buscarTodos();
    }
}