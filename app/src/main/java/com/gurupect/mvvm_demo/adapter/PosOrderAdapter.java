package com.gurupect.mvvm_demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gurupect.mvvm_demo.R;
import com.gurupect.mvvm_demo.dbmodel.OrderList;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PosOrderAdapter extends RecyclerView.Adapter<PosOrderAdapter.NewsViewHolder> {
    private List<OrderList> posArticleDTOS;
    private Context mContext;

    public PosOrderAdapter(Context context, List<OrderList> posArticleDTOS) {
        this.posArticleDTOS = posArticleDTOS;
        this.mContext = context;

    }

    @NonNull
    @Override
    public PosOrderAdapter.NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_order_item, parent, false);
        return new  NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PosOrderAdapter.NewsViewHolder itemRowHolder, int i) {
        itemRowHolder.orderNumberTV.setText(""+posArticleDTOS.get(i).getTitle());
        itemRowHolder.articlePriceTV.setText(""+posArticleDTOS.get(i).getAmount());

        itemRowHolder.productSellingPriceTV.setText(""+posArticleDTOS.get(i).getTax());

        itemRowHolder.productDiscountTV.setText(""+posArticleDTOS.get(i).getDiscount());
        itemRowHolder.articleQtyTV.setText(""+posArticleDTOS.get(i).getQty());
        itemRowHolder.customerNameTV.setText("" + posArticleDTOS.get(i).getPaymentStatus());
        itemRowHolder.orderDateTV.setText("" + posArticleDTOS.get(i).getCreateTime());
    }

    @Override
    public int getItemCount() {
        return posArticleDTOS.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{

        private ImageView vendorIV;
        private TextView orderNumberTV, articlePriceTV, productSellingPriceTV, productDiscountTV,
                articleQtyTV, customerNameTV, contactNumTV;
        private TextView orderDateTV;

        public NewsViewHolder(@NonNull View view) {
            super(view);

            orderNumberTV = view.findViewById(R.id.orderNumberTV);

            articlePriceTV = view.findViewById(R.id.articlePriceTV);
            articleQtyTV = view.findViewById(R.id.articleQtyTV);
            productSellingPriceTV = view.findViewById(R.id.productSellingPriceTV);
            productDiscountTV = view.findViewById(R.id.productDiscountTV);
            customerNameTV = view.findViewById(R.id.customerNameTV);

            contactNumTV = view.findViewById(R.id.contactNumTV);
            orderDateTV = view.findViewById(R.id.orderDateTV);

        }
    }

}
