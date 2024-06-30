package pro.sky.sql_start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.sql_start.model.Faculty;

import java.util.Collection;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findByNameIgnoreCaseOrColorIgnoreCase(String name, String color);

    Collection<Faculty> findByColor(String color);
}
