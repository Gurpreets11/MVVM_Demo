package com.gurupect.mvvm_demo.ui.child;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.gurupect.mvvm_demo.R;
import com.gurupect.mvvm_demo.adapter.PosOrderAdapter;
import com.gurupect.mvvm_demo.constant.AppConstant;
import com.gurupect.mvvm_demo.context.ContextManager;
import com.gurupect.mvvm_demo.databinding.ActivityMainBinding;
import com.gurupect.mvvm_demo.dbmodel.OrderList;
import com.gurupect.mvvm_demo.model.POSOrderDTO;
import com.gurupect.mvvm_demo.model.RequestDto;
import com.gurupect.mvvm_demo.model.ResponseDTO;
import com.gurupect.mvvm_demo.repositories.StoreRepositories;
import com.gurupect.mvvm_demo.ui.base.BaseActivity;
import com.gurupect.mvvm_demo.utils.AppToast;
import com.gurupect.mvvm_demo.utils.AppUtils;
import com.gurupect.mvvm_demo.utils.Logger;
import com.gurupect.mvvm_demo.viewmodels.PosOrderViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends BaseActivity {


    ArrayList<OrderList> orderList = new ArrayList<>();
    PosOrderAdapter newsAdapter;
    PosOrderViewModel newsViewModel;
    List<POSOrderDTO> newsArticles = null;

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        newsViewModel = ViewModelProviders.of(MainActivity.this).get(PosOrderViewModel.class);

        noteRepository = new StoreRepositories(MainActivity.this);


        RequestDto requestDto = new RequestDto();
        POSOrderDTO posOrderDTO = new POSOrderDTO();
        posOrderDTO.setUserId(AppConstant.USER_ID);
        posOrderDTO.setStatus(1);

        requestDto.setPosOrderDTO(posOrderDTO);
        requestDto.setOrderAs("DESC");
        Logger.e("onCreate method called..");
        newsViewModel.init(requestDto);
        newsViewModel.getNewsRepository().observe(this, new Observer<ResponseDTO>() {
            @Override
            public void onChanged(ResponseDTO ResponseDTO) {
                ArrayList<Object> temp = (ArrayList<Object>) ResponseDTO.getRequestTypeObject();
                Logger.e("onChanged method called..");
                if (temp != null && temp.size() > 0) {
                    newsArticles = new ArrayList<>();
                    for (Object v : temp) {
                        POSOrderDTO orderDTO = new Gson().fromJson(new Gson().toJson(v), POSOrderDTO.class);
                        if (orderDTO != null) {
                            newsArticles.add(orderDTO);
                        }
                    }
                    AppToast.showMsgShort("  Data found.." + temp.size());


                    // save data in Database usinf ROOM..
                    saveDataInDB();

                    //  OR Set data toadapter
                    //newsAdapter.notifyDataSetChanged();
                } else {
                    AppToast.showMsgShort("No Data found..");
                }
            }
        });

        //setupRecyclerView();
    }

    private StoreRepositories noteRepository;

    private void saveDataInDB() {
       /* for (POSOrderDTO posOrderDTO : newsArticles) {
            Logger.e("Order Number :: " + posOrderDTO.getOrderNumber());
            noteRepository.insertTask(posOrderDTO.getOrderNumber(), "", false, "123456", posOrderDTO.getTotalAmount().toString(),
                    posOrderDTO.getTotalTax().toString(), posOrderDTO.getQty().toString(), posOrderDTO.getDiscount().toString(), posOrderDTO.getPaymentStatus(),
                    posOrderDTO.getCreationDatetime(), posOrderDTO.getOrderNumber());
        }


        updateTaskList();*/


        for (POSOrderDTO posOrderDTO : newsArticles) {
            insertTask(posOrderDTO.getOrderNumber(), "", false, "123456", posOrderDTO.getTotalAmount().toString(),
                    posOrderDTO.getTotalTax().toString(), posOrderDTO.getQty().toString(), posOrderDTO.getDiscount().toString(), posOrderDTO.getPaymentStatus(),
                    posOrderDTO.getCreationDatetime(), posOrderDTO.getOrderNumber());
        }

        setupRecyclerView( );

    }
    List<OrderList>  orderListDemo = new ArrayList<>();
    private void insertTask(String orderNumber, String description, boolean encrypt, String pwd, String amount, String tax, String qty, String discount, String paymentStatus, String createTime, String orderId) {
        OrderList note = new OrderList();
        note.setTitle(orderNumber);
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

        orderListDemo.add(note);


    }


    private void updateTaskList() {

        Logger.e("updateTaskList method call ");
        noteRepository.getTasks().observe(MainActivity.this, new Observer<List<OrderList>>() {
            @Override
            public void onChanged(@Nullable List<OrderList> notes) {
                if (notes.size() > 0) {

                    setupRecyclerView(notes);


                } else {
                    AppToast.showMsgShort("No data found.");
                }
            }
        });
    }


    @Override
    public Context setContext() {
        return MainActivity.this;
    }

    private void setupRecyclerView(List<OrderList> notes) {
        if (newsAdapter == null) {
            newsAdapter = new PosOrderAdapter(MainActivity.this, notes);
            activityMainBinding.orderItemRV.setLayoutManager(new LinearLayoutManager(this));
            activityMainBinding.orderItemRV.setAdapter(newsAdapter);
            activityMainBinding.orderItemRV.setItemAnimator(new DefaultItemAnimator());
            activityMainBinding.orderItemRV.setNestedScrollingEnabled(true);
        } else {
            newsAdapter.notifyDataSetChanged();
        }
    }

    private void setupRecyclerView( ) {
        if (newsAdapter == null) {
            newsAdapter = new PosOrderAdapter(MainActivity.this, orderListDemo);
            activityMainBinding.orderItemRV.setLayoutManager(new LinearLayoutManager(this));
            activityMainBinding.orderItemRV.setAdapter(newsAdapter);
            activityMainBinding.orderItemRV.setItemAnimator(new DefaultItemAnimator());
            activityMainBinding.orderItemRV.setNestedScrollingEnabled(true);
        } else {
            newsAdapter.notifyDataSetChanged();
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        Logger.e("onPause method called..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.e("onResume method called..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.e("onStop method called..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.e("onDestroy method called..");
    }
}
//  Room DB integration..
// https://android.jlelse.eu/5-steps-to-implement-room-persistence-library-in-android-47b10cd47b24