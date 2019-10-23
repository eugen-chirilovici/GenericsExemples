package part2.generics.miniProject.service;

import part2.generics.miniProject.dao.InternDAO;
import part2.generics.miniProject.dao.InternDAOImpl;
import part2.generics.miniProject.entity.Intern;

import java.util.List;

public class InternServiceImpl implements InternService {


    InternDAO internDAO = new InternDAOImpl();

    @Override
    public List<Intern> getInterns() {
        return internDAO.getInterns();
    }

    @Override
    public void saveInterns(Intern intern) {
        internDAO.saveIntern(intern);
    }

    @Override
    public Intern getInternById(Long id) {
        return (Intern) internDAO.getById(id);
    }

    @Override
    public Intern getInternByName(String name) {
        return (Intern) internDAO.getByName(name);

    }
}
