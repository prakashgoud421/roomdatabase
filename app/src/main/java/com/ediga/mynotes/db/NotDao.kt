package com.ediga.mynotes.db

import androidx.room.*

@Dao
interface NotDao {
    @Query("SELECT * FROM note ORDER BY id DESC")
    suspend fun getAllNotes():List<Note>

    @Insert
    suspend fun addNotes(vararg note:Note)

    @Update
    suspend fun updateNote(note:Note)

    @Delete
    suspend fun deleteNote(note: Note)
}