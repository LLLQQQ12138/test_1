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

public class LengthActivity extends AppCompatActivity implements View.OnClickListener {
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
    Button btn_length;
    Button btn_clear; //清除
    Button btn_del;   //删除

    Double x,n;
    Double y;
    Double result;
    String p,m;
    private TextView length_input;
    private TextView length_output;
    private StringBuilder pending = new StringBuilder();

    private void length_initView() {
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
        btn_length = (Button) findViewById(R.id.btn_length);
        length_input = (TextView)findViewById(R.id.length_input);
        length_output = (TextView)findViewById(R.id.length_output);
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
        btn_length.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length_change);
        Resources res =getResources();
        String[] city=res.getStringArray(R.array.length_change);//将province中内容添加到数组city中
        final Spinner spinner_x = findViewById(R.id.input_length_change);//获取到input_num
        final Spinner spinner_y = findViewById(R.id.output_length_change);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);//创建Arrayadapter适配器
        spinner_x.setAdapter(adapter);
        spinner_y.setAdapter(adapter);
        spinner_x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {//通过此方法为下拉列表设置点击事件
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String textx = spinner_x.getItemAtPosition(i).toString();
                if (textx.equals("厘米"))
                { x=1.0; }
                if (textx.equals("分米"))
                { x=10.0; }
                if (textx.equals("米"))
                { x=100.0; }
                if (textx.equals("公里"))
                { x=100000.0; }
                if (textx.equals("英寸"))
                { x=2.54; }
                if (textx.equals("英尺"))
                { x=30.48; }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinner_y.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {//通过此方法为下拉列表设置点击事件
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String texty = spinner_y.getItemAtPosition(i).toString();
                if (texty.equals("厘米"))
                { y=1.0; }
                if (texty.equals("分米"))
                { y=0.1; }
                if (texty.equals("米"))
                { y=0.01; }
                if (texty.equals("公里"))
                { y=0.00001; }
                if (texty.equals("英寸"))
                { y=0.393701; }
                if (texty.equals("英尺"))
                { y=0.0328084; }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        length_initView();
    }

    public void onClick(View v) {
        int last = 0;
        if(pending.length()!=0)
        {
            last = pending.codePointAt(pending.length()-1);

        }
        switch (v.getId()) {
            case R.id.btn_0:
                pending = pending.append("0");
                length_input.setText(pending);
                break;
            case R.id.btn_1:
                pending = pending.append("1");
                length_input.setText(pending);
                break;
            case R.id.btn_2:
                pending = pending.append("2");
                length_input.setText(pending);
                break;
            case R.id.btn_3:
                pending = pending.append("3");
                length_input.setText(pending);
                break;
            case R.id.btn_4:
                pending = pending.append("4");
                length_input.setText(pending);
                break;
            case R.id.btn_5:
                pending = pending.append("5");
                length_input.setText(pending);
                break;
            case R.id.btn_6:
                pending = pending.append("6");
                length_input.setText(pending);
                break;
            case R.id.btn_7:
                pending = pending.append("7");
                length_input.setText(pending);
                break;
            case R.id.btn_8:
                pending = pending.append("8");
                length_input.setText(pending);
                break;
            case R.id.btn_9:
                pending = pending.append("9");
                length_input.setText(pending);
                break;

            case R.id.btn_del: //删除
                if (pending.length() != 0) {
                    pending = pending.delete(pending.length() - 1, pending.length());
                    length_input.setText(pending);
                }
                break;
            case R.id.btn_clear: //清空
                pending = pending.delete(0, pending.length());
                length_input.setText(pending);
                break;
            case R.id.btn_length: // =等于
                if ((pending.length() > 0)) {
                    p=""+pending;
                    n=Double.parseDouble(p);
                    result = x*n*y;
                    m=String.valueOf(result);
                    length_output.setText(m);
                    //pending = pending.delete(0, pending.length());
                }

                break;
            default:
                break;
        }
    }
}