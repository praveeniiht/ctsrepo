package com.iiht.yaksha.fsdpa.notesapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.yaksha.fsdpa.notesapp.model.Note;
import com.iiht.yaksha.fsdpa.notesapp.repo.NoteRepository;

@Service
@Transactional
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteRepository noteRepository;
	@Override
	
	/*
	 * THis method should get all the notes from the database
	 */
	public List<Note> getAllNotes() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * This method should find the note with the given id in the database and return it.
	 */
	@Override
	public Optional<Note> getNoteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * This method should add the given note into the database
	 */
	@Override
	public Note addNote(Note note) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * This method should delete the given note from the database
	 */
	@Override
	public void deleteNote(Note note) {
		// TODO Auto-generated method stub
	}
	
	/*
	 * This method should return all the notes with the given status
	 */

	@Override
	public List<Note> getAllNotesByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
