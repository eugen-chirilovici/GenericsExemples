package part2.generics.miniProject.dao;

import java.util.List;

public interface InternDAO<T> extends BaseDAO<T> {

    void saveIntern(T t);

    List<T> getInterns();
}
