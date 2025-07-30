package com.gurupect.mvvm_demo.repositories;

import android.content.Context;
import android.os.AsyncTask;
import android.provider.ContactsContract;

import com.gurupect.mvvm_demo.db.StoreDatabase;
import com.gurupect.mvvm_demo.dbmodel.OrderList;
import com.gurupect.mvvm_demo.utils.AppUtils;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

public class StoreRepositories {


    private String DB_NAME = "db_task";

    private StoreDatabase noteDatabase;

    public StoreRepositories(Context context) {
        noteDatabase = Room.databaseBuilder(context, StoreDatabase.class, DB_NAME).build();
    }

    public void insertTask(String title, String description) {

        insertTask(title, description, false, null, null, null, null, null, null, null, null);
    }

    public void insertTask(String title, String description, boolean encrypt, String password, String amount,
                           String tax, String qty, String discount, String paymentStatus, String createTime, String orderId) {

        OrderList note = new OrderList();
        note.setTitle(title);
        note.setDescription(description);
        note.setCreatedAt(AppUtils.getCurrentDateTime());
        note.setModifiedAt(AppUtils.getCurrentDateTime());
        note.setEncrypt(encrypt);
        note.setAmount(amount);
        note.setTax(tax);
        note.setQty(qty);
        note.setDiscount(discount);
        note.setPaymentStatus(paymentStatus);
        note.setCreateTime(createTime);
        note.setOrderId(orderId);

        if (encrypt) {
            note.setPassword(AppUtils.generateHash(password));
        } else note.setPassword(null);

        insertTask(note);
    }

    public void insertTask(final OrderList note) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                noteDatabase.daoAccess().insertTask(note);
                return null;
            }
        }.execute();
    }

    public void updateTask(final OrderList note) {
        note.setModifiedAt(AppUtils.getCurrentDateTime());

        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                noteDatabase.daoAccess().updateTask(note);
                return null;
            }
        }.execute();
    }

    public void deleteTask(final int id) {
        final LiveData<OrderList> task = getTask(id);
        if (task != null) {
            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... voids) {
                    noteDatabase.daoAccess().deleteTask(task.getValue());
                    return null;
                }
            }.execute();
        }
    }

    public void deleteTask(final OrderList note) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                noteDatabase.daoAccess().deleteTask(note);
                return null;
            }
        }.execute();
    }

    public LiveData<OrderList> getTask(int id) {
        return noteDatabase.daoAccess().getTask(id);
    }

    public LiveData<List<OrderList>> getTasks() {
        return noteDatabase.daoAccess().fetchAllTasks();
    }

}
