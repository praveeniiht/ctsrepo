package com.iiht.yaksha.fsdpa.notesapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.iiht.yaksha.fsdpa.notesapp.exceptions.InvalidNoteStatusException;
import com.iiht.yaksha.fsdpa.notesapp.model.Note;
import com.iiht.yaksha.fsdpa.notesapp.service.NoteService;
@RestController
public class NotesController {
	
	@Autowired
	private NoteService noteService;

	
	
	/*
	 * This should return all the available notes as response 
	 */
	@GetMapping("/allnotes")
    public ResponseEntity<List<Note>> getAllNotes() {
        return null;
    }
	
	
	/*
	 * This should return the note with the given id
	 */
		
	  @GetMapping("/note/{Id}") 
	  public ResponseEntity<Optional<Note>> getNoteById(@PathVariable("Id") Long id) { 
		  return null;
	  }
	 

	  
	  /*
	   * This should take the note details from the request body and insert into to the list available
	   */
	@PostMapping("/addnote")
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        
        return null;
    }
	
	/*
	 * THis should delete the note which is passed from the request body
	 */
	@DeleteMapping("/deletenote")
	public ResponseEntity<Note> deleteNote(@RequestBody Note note) {
		return null;
		
	}
	
	/*
	 * This should return all the notes which are of the given status
	 */
	
	@GetMapping("/{status}") 
	  public ResponseEntity<List<Note>>	  getAllByStatus(@PathVariable("status") String status) {
		return null;
		 
	}	 
}
