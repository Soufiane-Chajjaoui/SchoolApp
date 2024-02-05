package org.SchoolApp.App.Repositories;

import org.SchoolApp.App.Entities.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoElement extends JpaRepository<Element , Long> {
}
