package com.example.toodo
import androidx.lifecycle.LiveData

class NoteRepository (private val noteDao: NoteDao){
    val allNotes: LiveData<List<Note>> = noteDao.fetchAllNotes()

    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }

    suspend fun delete(note:Note){
        noteDao.delete(note)
    }

}