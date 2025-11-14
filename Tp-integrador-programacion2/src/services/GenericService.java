package services;

import java.sql.SQLException;
import java.util.List;

public interface GenericService<T> {

    void insertar(T entity) throws SQLException;
    

    void actualizar(T entity) throws SQLException;
    

    void eliminar(Long id) throws SQLException;
    

    T getById(Long id) throws SQLException; 

    List<T> getAll() throws SQLException;
}
