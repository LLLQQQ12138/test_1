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

import static com.example.test_1.ChangeResult.N_to_10;
import static com.example.test_1.ChangeResult._10_to_N;

public class ChangeActivity extends AppCompatActivity implements View.OnClickListener {

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
    Button btn_a;
    Button btn_b;
    Button btn_c;
    Button btn_d;
    Button btn_e;
    Button btn_f;
    Button btn_change;
    Button btn_clear; //清除
    Button btn_del;   //删除
    int x,y;
    long n;
    String p;
    private TextView change_input;
    private TextView change_output;
    private StringBuilder pending = new StringBuilder();

    private void change_initView() {
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
        btn_a = (Button) findViewById(R.id.btn_a);
        btn_b = (Button) findViewById(R.id.btn_b);
        btn_c = (Button) findViewById(R.id.btn_c);
        btn_d = (Button) findViewById(R.id.btn_d);
        btn_e = (Button) findViewById(R.id.btn_e);
        btn_f = (Button) findViewById(R.id.btn_f);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_change = (Button) findViewById(R.id.btn_change);
        change_input = (TextView)findViewById(R.id.change_input);
        change_output = (TextView)findViewById(R.id.change_output);
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
        btn_a.setOnClickListener(this);
        btn_b.setOnClickListener(this);
        btn_c.setOnClickListener(this);
        btn_d.setOnClickListener(this);
        btn_e.setOnClickListener(this);
        btn_f.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_change.setOnClickListener(this);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.change);
        Resources res =getResources();
        String[] city=res.getStringArray(R.array.num_change);//将province中内容添加到数组city中
        final Spinner spinner_x = findViewById(R.id.input_num_change);//获取到input_num
        final Spinner spinner_y = findViewById(R.id.output_num_change);//获取到input_num
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);//创建Arrayadapter适配器
        spinner_x.setAdapter(adapter);
        spinner_y.setAdapter(adapter);
        spinner_x.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {//通过此方法为下拉列表设置点击事件
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String textx = spinner_x.getItemAtPosition(i).toString();
                if (textx.equals("2进制"))
                { x=2; }
                if (textx.equals("8进制"))
                { x=8; }
                if (textx.equals("10进制"))
                { x=10; }
                if (textx.equals("16进制"))
                { x=16; }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinner_y.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {//通过此方法为下拉列表设置点击事件
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String texty = spinner_y.getItemAtPosition(i).toString();
                if (texty.equals("2进制"))
                { y=2; }
                if (texty.equals("8进制"))
                { y=8; }
                if (texty.equals("10进制"))
                { y=10; }
                if (texty.equals("16进制"))
                { y=16; }

            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        change_initView();

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
                change_input.setText(pending);
                break;
            case R.id.btn_1:
                pending = pending.append("1");
                change_input.setText(pending);
                break;
            case R.id.btn_2:
                pending = pending.append("2");
                change_input.setText(pending);
                break;
            case R.id.btn_3:
                pending = pending.append("3");
                change_input.setText(pending);
                break;
            case R.id.btn_4:
                pending = pending.append("4");
                change_input.setText(pending);
                break;
            case R.id.btn_5:
                pending = pending.append("5");
                change_input.setText(pending);
                break;
            case R.id.btn_6:
                pending = pending.append("6");
                change_input.setText(pending);
                break;
            case R.id.btn_7:
                pending = pending.append("7");
                change_input.setText(pending);
                break;
            case R.id.btn_8:
                pending = pending.append("8");
                change_input.setText(pending);
                break;
            case R.id.btn_9:
                pending = pending.append("9");
                change_input.setText(pending);
                break;
            case R.id.btn_a:
                pending = pending.append("A");
                change_input.setText(pending);
                break;
            case R.id.btn_b:
                pending = pending.append("B");
                change_input.setText(pending);
                break;
            case R.id.btn_c:
                pending = pending.append("C");
                change_input.setText(pending);
                break;
            case R.id.btn_d:
                pending = pending.append("D");
                change_input.setText(pending);
                break;
            case R.id.btn_e:
                pending = pending.append("E");
                change_input.setText(pending);
                break;
            case R.id.btn_f:
                pending = pending.append("F");
                change_input.setText(pending);
                break;

            case R.id.btn_del: //删除
                if (pending.length() != 0) {
                    pending = pending.delete(pending.length() - 1, pending.length());
                    change_input.setText(pending);
                }
                break;
            case R.id.btn_clear: //清空
                pending = pending.delete(0, pending.length());
                change_input.setText(pending);
                break;
            case R.id.btn_change: // =等于
                if ((pending.length() > 0)) {
                    p=""+pending;
                    n=N_to_10(p,x);

                    change_output.setText(_10_to_N(n,y));
                    //pending = pending.delete(0, pending.length());
                }

                break;
            default:
                break;
        }
    }

}
