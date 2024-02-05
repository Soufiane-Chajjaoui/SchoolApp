package org.SchoolApp.App.Repositories;

import org.SchoolApp.App.Entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoModule extends JpaRepository<Module, Long> {
}
