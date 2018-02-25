package ua.kostyniuk.quadratic.servise;

import ua.kostyniuk.quadratic.model.QuadraticModel;

import java.util.List;

public interface QuadraticService {

    QuadraticModel calcQuadratic (String numA, String numB, String numC);

    List<QuadraticModel> findAllQuadratic();

}