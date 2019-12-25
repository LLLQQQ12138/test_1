package com.example.test_1;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VolumeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_volume;
    Button btn_clear; //清除
    Button btn_del;   //删除

    Double x,n;
    Double y;
    Double result;
    String p,m;
    private TextView volume_input;
    private TextView volume_output;
    private StringBuilder pending = new StringBuilder();

    private void volume_initView() {
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_volume = (Button) findViewById(R.id.btn_volume);
        volume_input = (TextView)findViewById(R.id.volume_input);
        volume_output = (TextView)findViewById(R.id.volume_output);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_volume.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume_change);
        Resources res =getResources();
        String[] city=res.getStringArray(R.array.volume_change);//将province中内容添加到数组city中
        final Spinner spinner_x = findViewById(R.id.input_volume_change);//获取到input_num
        final Spinner spinner_y = findViewById(R.id.output_volume_change);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);//创建Arrayadapter适配器
        spinner_x.setAdapter(adapter);
        spinner_y.setAdapter(adapter);
        spinner_x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {//通过此方法为下拉列表设置点击事件
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String textx = spinner_x.getItemAtPosition(i).toString();
                if (textx.equals("毫升"))
                { x=1.0; }
                if (textx.equals("立方厘米"))
                { x=1.0; }
                if (textx.equals("升"))
                { x=1000.0; }
                if (textx.equals("立方米"))
                { x=1000000.0; }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinner_y.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {//通过此方法为下拉列表设置点击事件
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String texty = spinner_y.getItemAtPosition(i).toString();
                if (texty.equals("毫升"))
                { y=1.0; }
                if (texty.equals("立方厘米"))
                { y=1.0; }
                if (texty.equals("升"))
                { y=0.001; }
                if (texty.equals("立方米"))
                { y=0.000001; }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        volume_initView();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_0:
                pending = pending.append("0");
                volume_input.setText(pending);
                break;
            case R.id.btn_1:
                pending = pending.append("1");
                volume_input.setText(pending);
                break;
            case R.id.btn_2:
                pending = pending.append("2");
                volume_input.setText(pending);
                break;
            case R.id.btn_3:
                pending = pending.append("3");
                volume_input.setText(pending);
                break;
            case R.id.btn_4:
                pending = pending.append("4");
                volume_input.setText(pending);
                break;
            case R.id.btn_5:
                pending = pending.append("5");
                volume_input.setText(pending);
                break;
            case R.id.btn_6:
                pending = pending.append("6");
                volume_input.setText(pending);
                break;
            case R.id.btn_7:
                pending = pending.append("7");
                volume_input.setText(pending);
                break;
            case R.id.btn_8:
                pending = pending.append("8");
                volume_input.setText(pending);
                break;
            case R.id.btn_9:
                pending = pending.append("9");
                volume_input.setText(pending);
                break;

            case R.id.btn_del: //删除
                if (pending.length() != 0) {
                    pending = pending.delete(pending.length() - 1, pending.length());
                    volume_input.setText(pending);
                }
                break;
            case R.id.btn_clear: //清空
                pending = pending.delete(0, pending.length());
                volume_input.setText(pending);
                break;
            case R.id.btn_volume: // =等于
                if ((pending.length() > 0)) {
                    p=""+pending;
                    n=Double.parseDouble(p);
                    result = x*n*y;
                    m=String.valueOf(result);
                    volume_output.setText(m);
                    //pending = pending.delete(0, pending.length());
                }

                break;
            default:
                break;
        }

    }
}