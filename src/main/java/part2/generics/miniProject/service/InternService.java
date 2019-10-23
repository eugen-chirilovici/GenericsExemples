package part2.generics.miniProject.service;

import part2.generics.miniProject.entity.Intern;

import java.util.List;

public interface InternService {

    List<Intern> getInterns();

    void saveInterns(Intern intern);

    Intern getInternById(Long id);

    Intern getInternByName(String name);
}
