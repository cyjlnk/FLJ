package com.diabin.latte.ec.main.cart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.diabin.latte.delegates.bottom.BottomItemDelegate;
import com.diabin.latte.ec.R;
import com.diabin.latte.net.callback.ISuccess;

//import com.diabin.latte.ec.pay.FastPay;
//import com.diabin.latte.ec.pay.IAlPayResultListener;

/**
 * Created by 傅令杰
 */

public class ShopCartDelegate extends BottomItemDelegate implements View.OnClickListener, ISuccess, ICartItemListener{


    @Override
    public void onClick(View v) {

    }

    @Override
    public Object setLayout() {
        return R.layout.delegate_shop_cart;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    @Override
    public void onItemClick(double itemTotalPrice) {

    }

    @Override
    public void onSuccess(String response) {

    }
}
