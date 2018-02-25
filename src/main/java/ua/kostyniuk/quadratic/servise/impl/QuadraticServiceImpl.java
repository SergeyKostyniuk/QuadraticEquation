package ua.kostyniuk.quadratic.servise.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.kostyniuk.quadratic.dao.QuadraticDao;
import ua.kostyniuk.quadratic.error.NotRootException;
import ua.kostyniuk.quadratic.model.QuadraticModel;
import ua.kostyniuk.quadratic.servise.QuadraticService;

import java.util.List;


@Service ("quadraticService")
@Transactional
public class QuadraticServiceImpl implements QuadraticService {

    @Autowired
    private QuadraticDao dao;


    @Override
    public QuadraticModel calcQuadratic(String numA, String numB, String numC)  {
        double a = Double.parseDouble(numA);
        double b = Double.parseDouble(numB);
        double c = Double.parseDouble(numC);

        double x1, x2, d;

        d = (b * b) - (4 * a * c);

        if (d < 0) {
            throw new NotRootException("no real roots found");
        } else if (d == 0) {
            x1 = (-b) / (2 * a);
            x2 = x1;

        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
        }

        QuadraticModel model = new QuadraticModel();

        model.setA(a);
        model.setB(b);
        model.setC(c);
        model.setX1(x1);
        model.setX2(x2);

        dao.saveQuadratic(model);

        return model;
    }

    @Override
    public List<QuadraticModel> findAllQuadratic() {
        return dao.findAllQuadratic();
    }
}