package examen.backend.test;
import examen.backend.dao.impl.OdontoloEnMemoria;
import examen.backend.model.Odontologo;
import examen.backend.service.OdontologoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class OdontologoEnMemoriaTest {
    private static OdontologoService odontologoService = new OdontologoService(new OdontoloEnMemoria());

    @Test
    @DisplayName("Testear que un odontologo fue guardado")
    void testOdontologoGuardado(){
        Odontologo odontologo = new Odontologo("Mengano","Menganito",123456);
        Odontologo odontologoDesdeLaMemoria = odontologoService.registrarOdontologo(odontologo);

        assertNotNull(odontologoDesdeLaMemoria);
    }

    @Test
    @DisplayName("Testear busqueda odontologo por id")
    void testOdontologoPorId(){
        Odontologo odontologo = new Odontologo("Mengano","Menganito",123456);
        odontologoService.registrarOdontologo(odontologo);

        Integer id = 1;
        Odontologo odontologoEncontrado = odontologoService.buscarPorId(id);

        assertEquals(id, odontologoEncontrado.getID());
    }

    @Test
    @DisplayName("Testear busqueda todos los odontologos")
    void testBusquedaTodos() {
        Odontologo odontologo = new Odontologo("Mengano","Menganito",123456);
        odontologoService.registrarOdontologo(odontologo);

        List<Odontologo> odontologos = odontologoService.buscarTodos();

        assertEquals(2, odontologos.size());

    }
}
