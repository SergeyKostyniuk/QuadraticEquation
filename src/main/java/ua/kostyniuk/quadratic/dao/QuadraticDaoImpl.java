package ua.kostyniuk.quadratic.dao;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.kostyniuk.quadratic.model.QuadraticModel;

import java.util.List;

@Repository("quadraticDao")
public class QuadraticDaoImpl extends AbstractDao<Integer, QuadraticModel> implements QuadraticDao {
    @Override
    public void saveQuadratic(QuadraticModel quadraticModel) {
        persist(quadraticModel);

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<QuadraticModel> findAllQuadratic() {
        Criteria criteria = createEntityCriteria();
        return (List<QuadraticModel>) criteria.list();
    }
}
