package com.example.test_1;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.sqrt;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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
    Button btn_point; //小数点
    Button btn_clear; //清除
    Button btn_del;   //删除
    Button btn_plus;
    Button btn_minus;
    Button btn_multiply;
    Button btn_divide;
    Button btn_equal;
    Button btn_left;
    Button btn_right;

    Button btn_pai;
    Button btn_sin;
    Button btn_cos;
    Button btn_tan;
    Button btn_genhao;
    Button btn_1x;
    Button btn_x_jiecheng;

    private String p1_sin;
    private Double p2_sin;
    private Spinner spChange;
    private List<String> list;
    private ArrayAdapter<String> adapter;
    private TextView et_input;
    private StringBuilder pending = new StringBuilder();

private void land_initView()
{
    btn_pai = (Button) findViewById(R.id.btn_pai);
    btn_sin = (Button) findViewById(R.id.btn_sin);
    btn_cos = (Button) findViewById(R.id.btn_cos);
    btn_tan = (Button) findViewById(R.id.btn_tan);
    btn_genhao = (Button) findViewById(R.id.btn_genhao);
    btn_1x = (Button) findViewById(R.id.btn_1x);
    btn_x_jiecheng = (Button) findViewById(R.id.btn_x_jiecheng);

    btn_pai.setOnClickListener(this);
    btn_sin.setOnClickListener(this);
    btn_cos.setOnClickListener(this);
    btn_tan.setOnClickListener(this);
    btn_genhao.setOnClickListener(this);
    btn_1x.setOnClickListener(this);
    btn_x_jiecheng.setOnClickListener(this);

}


    private void initView() {
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
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        et_input = (TextView) findViewById(R.id.et_input);
        btn_left = (Button) findViewById(R.id.btn_left);
        btn_right = (Button) findViewById(R.id.btn_right);

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
        btn_point.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_left.setOnClickListener(this);
        btn_right.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.change:
                Intent change_intent = new Intent(MainActivity.this,ChangeActivity.class);
                startActivity(change_intent);
                break;
            case R.id.LengthChange:
                Intent length_intent = new Intent(MainActivity.this,LengthActivity.class);
                startActivity(length_intent);
                break;
            case R.id.VolumeChange:
                Intent Volume_intent = new Intent(MainActivity.this,VolumeActivity.class);
                startActivity(Volume_intent);
                break;
            case R.id.help:
                Toast.makeText(this, "this is help", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Exit:
                finish();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int orientation = getResources().getConfiguration().orientation;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            initView();
            if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            land_initView();
            }
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
                et_input.setText(pending);
                break;
            case R.id.btn_1:
                pending = pending.append("1");
                et_input.setText(pending);
                break;
            case R.id.btn_2:
                pending = pending.append("2");
                et_input.setText(pending);
                break;
            case R.id.btn_3:
                pending = pending.append("3");
                et_input.setText(pending);
                break;
            case R.id.btn_4:
                pending = pending.append("4");
                et_input.setText(pending);
                break;
            case R.id.btn_5:
                pending = pending.append("5");
                et_input.setText(pending);
                break;
            case R.id.btn_6:
                pending = pending.append("6");
                et_input.setText(pending);
                break;
            case R.id.btn_7:
                pending = pending.append("7");
                et_input.setText(pending);
                break;
            case R.id.btn_8:
                pending = pending.append("8");
                et_input.setText(pending);
                break;
            case R.id.btn_9:
                pending = pending.append("9");
                et_input.setText(pending);
                break;
            case R.id.btn_plus:
                //if (last >= '0' && last <= '9' ) {
                pending = pending.append("+");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_minus:
                //if (last >= '0' && last <= '9') {
                pending = pending.append("-");
                //  }
                et_input.setText(pending);
                break;
            case R.id.btn_multiply:
                // if (last >= '0' && last <= '9' ) {
                pending = pending.append("*");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_divide:
                // if (last >= '0' && last <= '9' ) {
                pending = pending.append("/");
                // }
                et_input.setText(pending);
                break;
            case R.id.btn_point:
                if (judje1()) {
                    pending = pending.append(".");
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_right:// )右括号
                if((last>='0' &&last<='9'||last==')')&&judje2()==1) {
                    pending = pending.append(")");
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_left:// （左括号
                if((last!='(')||(last<='0' &&last>='9')){
                    pending = pending.append("(");
                    et_input.setText(pending);
                }
                break;



            case R.id.btn_pai:
                pending = pending.append(Math.PI);
                et_input.setText(pending);
                break;

            case R.id.btn_sin:

                p1_sin = pending.toString();
                p2_sin = Double.parseDouble(p1_sin);
                et_input.setText(String.valueOf(Math.sin(p2_sin)));
                break;

            case R.id.btn_cos:

                p1_sin = pending.toString();
                p2_sin = Double.parseDouble(p1_sin);
                et_input.setText(String.valueOf(Math.cos(p2_sin)));
                break;

            case R.id.btn_tan:

                p1_sin = pending.toString();
                p2_sin = Double.parseDouble(p1_sin);
                et_input.setText(String.valueOf(Math.tan(p2_sin)));
                break;
            case R.id.btn_genhao:

                p1_sin = pending.toString();
                p2_sin = Double.parseDouble(p1_sin);
                et_input.setText(String.valueOf(sqrt(p2_sin)));
                break;
            case R.id.btn_1x:

                p1_sin = pending.toString();
                p2_sin = Double.parseDouble(p1_sin);
                et_input.setText(String.valueOf(1/(p2_sin)));
                break;
            case R.id.btn_x_jiecheng:
                p1_sin = pending.toString();
                p2_sin = Double.parseDouble(p1_sin);
                Double n=p2_sin,sum = 1.0;
                for(Double i=0.0;i<n;i++)
                {   p2_sin=n-i;
                    sum=sum*p2_sin;

                }
                et_input.setText(String.valueOf(sum));
                break;

            case R.id.btn_del: //删除
                if (pending.length() != 0) {
                    pending = pending.delete(pending.length() - 1, pending.length());
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_clear: //清空
                pending = pending.delete(0, pending.length());
                et_input.setText(pending);
                break;
            case R.id.btn_equal: // =等于
                if ((pending.length() > 1)) {
                    InfixInToDuffix inf = new InfixInToDuffix();
                    String jieguo;
                    try {
                        String a = inf.toSuffix(pending);
                        jieguo = inf.dealEquation(a);

                    } catch (Exception ex) {
                        jieguo = "出错";
                    }
                    et_input.setText(pending + "=" + jieguo);
                    pending = pending.delete(0, pending.length());
                    if (Character.isDigit(jieguo.charAt(0))) {
                        pending = pending.append(jieguo);
                    }
                }
                break;
            default:
                break;
        }
    }

    private boolean judje1() {
        String a = "+-*/.";
        int[] b = new int[a.length()];
        int max;
        for (int i = 0; i < a.length(); i++) {
            String c = "" + a.charAt(i);
            b[i] = pending.lastIndexOf(c);
        }
        Arrays.sort(b);
        if (b[a.length() - 1] == -1) {
            max = 0;
        } else {
            max = b[a.length() - 1];
        }
        if (pending.indexOf(".", max) == -1) {
            return true;
        } else {
            return false;
        }
    }
    private int judje2(){
        int a=0,b=0;
        for(int i = 0 ; i < pending.length() ;i++){
            if(pending.charAt(i)=='(' ) {
                a++;
            }
            if(pending.charAt(i)==')' ) {
                b++;
            }
        }
        if(a == b)
            return 0;
        if(a > b)
            return 1;
        return 2;
    }




}
