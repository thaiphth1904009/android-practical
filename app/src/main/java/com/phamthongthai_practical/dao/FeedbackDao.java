package com.phamthongthai_practical.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.phamthongthai_practical.model.Feedback;

import java.util.List;

@Dao
public interface FeedbackDao {
    @Insert
    long insert(Feedback feedback);

    @Query("SELECT COUNT(*) FROM feedback")
    int countFeedback();
}
