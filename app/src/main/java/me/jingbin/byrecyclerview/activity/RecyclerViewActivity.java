package me.jingbin.byrecyclerview.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import me.jingbin.byrecyclerview.R;
import me.jingbin.byrecyclerview.app.BaseActivity;
import me.jingbin.byrecyclerview.databinding.ActivityRecyclerviewBinding;

/**
 * RecyclerViewActivity
 * Description RecyclerView 使用示例和规范
 * Created by YimWai on 2020/10/10.
 */
public class RecyclerViewActivity extends BaseActivity<ActivityRecyclerviewBinding> {

    private static final String TAG = "RecyclerViewActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        try {
            setTitle("RecyclerView 使用示例");
        } catch (Exception e) {
//            e.printStackTrace();// 不允许这样写
            Log.e(TAG, Log.getStackTraceString(e));
        }
        initialViews();
        initialEvents();
    }

    private void initialViews() {

    }

    private void initialEvents() {

    }

}
