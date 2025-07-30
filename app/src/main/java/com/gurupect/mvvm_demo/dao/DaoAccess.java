package com.gurupect.mvvm_demo.dao;

import com.gurupect.mvvm_demo.dbmodel.OrderList;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface DaoAccess {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertTask(OrderList orderList);


    @Query("SELECT * FROM OrderList ORDER BY created_at desc")
    LiveData<List<OrderList>> fetchAllTasks();


    @Query("SELECT * FROM OrderList WHERE id =:taskId")
    LiveData<OrderList> getTask(int taskId);


    @Update
    void updateTask(OrderList note);


    @Delete
    void deleteTask(OrderList note);
}
