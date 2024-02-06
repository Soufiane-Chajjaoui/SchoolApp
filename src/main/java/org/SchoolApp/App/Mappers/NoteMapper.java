package org.SchoolApp.App.Mappers;

import org.SchoolApp.App.DTOs.NoteDTO;
import org.SchoolApp.App.Entities.Note;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
public interface NoteMapper {
    NoteDTO ToNoteDTO(Note note);
    Note ToNoteEntity(NoteDTO noteDTO);
}
