package part2.generics.miniProject.dao;

import java.util.List;

public interface EmployeeDAO<T> extends BaseDAO<T> {

    void saveEmployee(T t);

    List<T> getEmployee();
}
