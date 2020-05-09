package com.geekholt.practiceui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.geekholt.practiceui.util.LayoutIdUtil;

/**
 * @author 吴灏腾
 * @date 2020/5/2
 * @describe TODO
 */
public class ContainerActivity extends AppCompatActivity {
    private static String EXTRA_TYPE = "type";

    public static void startActivity(Context context, String type) {
        Intent intent = new Intent(context, ContainerActivity.class);
        intent.putExtra(EXTRA_TYPE, type);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String type = getIntent().getStringExtra(EXTRA_TYPE);
        setContentView(LayoutIdUtil.getLayoutId(type));
    }
}
