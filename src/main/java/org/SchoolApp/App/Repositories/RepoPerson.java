package org.SchoolApp.App.Repositories;

import org.SchoolApp.App.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPerson extends JpaRepository<Person, Long> {
}
