package org.SchoolApp.App.Repositories;

import org.SchoolApp.App.Entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoNote extends JpaRepository<Note , Long> {
}
