package com.example.matala4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int n1, n2, n3, n4, n5, count = 0;
    int ans;
    String st1, st2, st3;
    ImageView i, i2, i3;
    EditText et1, et2, et3;
    TextView t1, t2, t3, t4, t5, t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        i = findViewById(R.id.i);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        t1 = findViewById(R.id.t);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);

    }



    public void Thirdtime(View view) {
        st3 = et3.getText().toString();
        if (st3.isEmpty())
            Toast.makeText(this, "you didn't enter any number", Toast.LENGTH_SHORT).show();
        else {
            ans = Integer.parseInt(st3);
            if (n3 + n4 + n5 == ans) {
                i2.setVisibility(view.VISIBLE);
                i2.setImageResource(R.drawable.v);
                count++;
            } else {
                i2.setVisibility(view.VISIBLE);
                i2.setImageResource(R.drawable.x);
            }
            Toast.makeText(this, count + "/" + 3 + "", Toast.LENGTH_SHORT).show();}
    }

    public void Secondtime(View view) {
        st2 = et2.getText().toString();
        if (st2.isEmpty())
            Toast.makeText(this, "you didn't enter any number", Toast.LENGTH_SHORT).show();
        else {
            t2.setText(n3 + n4 + "");
            t6.setText(n5 + "");
            ans = Integer.parseInt(st2);
            if (n4 + n1 + n2 == ans) {
                i.setVisibility(view.VISIBLE);
                i.setImageResource(R.drawable.v);
                count++;
            } else {
                i.setVisibility(view.VISIBLE);
                i.setImageResource(R.drawable.x);}
        }
    }

    public void Firsttime(View view) {
        n3 = n1 + n2;
        st1 = et1.getText().toString();
        if(st1.isEmpty())
            Toast.makeText(this, "you didn't enter any number", Toast.LENGTH_SHORT).show();
        else{
            t1.setText(n1 + n2 + "");
            t5.setText(n4 + "");
            ans = Integer.parseInt(st1);
            if (n1 + n2 == ans) {
                i3.setVisibility(view.VISIBLE);
                i3.setImageResource(R.drawable.v);
                count++;
            } else {
                i3.setVisibility(view.VISIBLE);
                i3.setImageResource(R.drawable.x);}
        }
    }
    public void NewEx(View view) {
        count = 0;
        n5 = (int) (Math.random() * 99 + 10);
        n4 = (int) (Math.random() * 99 + 10);
        i.setVisibility(view.INVISIBLE);
        i2.setVisibility(view.INVISIBLE);
        i3.setVisibility(view.INVISIBLE);
        n1 = (int) (Math.random() * 99 + 10);
        t3.setText(n1 + "");
        n2 = (int) (Math.random() * 99 + 10);
        t4.setText(n2 + "");
        t1.setText("");
        t2.setText("");
        t5.setText("");
        t6.setText("");
    }
}