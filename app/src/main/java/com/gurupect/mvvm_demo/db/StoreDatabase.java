package com.gurupect.mvvm_demo.db;

import com.gurupect.mvvm_demo.dao.DaoAccess;
import com.gurupect.mvvm_demo.dbmodel.OrderList;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {OrderList.class}, version = 1, exportSchema = false)
public abstract class StoreDatabase extends RoomDatabase {

    public abstract DaoAccess daoAccess();
}


