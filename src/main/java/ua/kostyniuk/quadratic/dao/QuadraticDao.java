package ua.kostyniuk.quadratic.dao;

import ua.kostyniuk.quadratic.model.QuadraticModel;

import java.util.List;

public interface QuadraticDao {

    void saveQuadratic(QuadraticModel quadraticModel);

    List<QuadraticModel> findAllQuadratic();
}
