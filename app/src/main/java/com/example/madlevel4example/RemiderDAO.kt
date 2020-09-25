package com.example.madlevel4example

import androidx.room.*

@Dao // DAO = stands for data access object
interface ReminderDao {

    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)

}
