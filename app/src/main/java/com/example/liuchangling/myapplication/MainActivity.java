package com.example.liuchangling.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

//    上面是 gridview 适配器
    Bean bean=new Bean();
    private List<Bean> beanList=new ArrayList<>();
    private List<Taobao> taobaoList;

    private RecyclerViewAdapter recyclerViewAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();

        recyclerView = findViewById(R.id.news_list);

        recyclerViewAdapter = new RecyclerViewAdapter(beanList, MainActivity.this, "num1", "num2");
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
////      下面配置RecyclerView 布局
//        recyclerViewAdapter = new RecyclerViewAdapter(taobaoList, MainActivity.this);
        recyclerView.setAdapter(recyclerViewAdapter);


    }

    public void initdata() {
        taobaoList = new ArrayList<>();
        String[] taobao_name = new String[]{
                "蓝月亮洗衣液组合","蓝月亮洗衣液组合", "南方黑芝麻糊360*3袋", "鞋刷软毛刷鞋刷子不伤血", "ANN骑士靴女高筒2019秋冬平底鞋",
        };
        String[] taobao_price = new String[]{
                "￥22.2","￥22.2", "￥332", "￥213", "￥99.9"
        };
        String string=new String("2020-12-12");
        for (int i = 0; i < 4; i++) {
            Taobao stu = new Taobao();
            stu.setName(taobao_name[i]);
            stu.setInformation(taobao_price[i]);
            taobaoList.add(stu);
        }
        bean.setTime(string);
        bean.setList(taobaoList);
        beanList.add(bean);
        beanList.add(bean);
        beanList.add(bean);
    }
}
