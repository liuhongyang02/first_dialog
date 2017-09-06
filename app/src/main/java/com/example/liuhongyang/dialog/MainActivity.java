package com.example.liuhongyang.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) this.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("这是一个提示的对话框")//显示的消息内容
                        .setTitle("提示对话框");//对话框标题

                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "您按下了确认按钮", Toast.LENGTH_SHORT).show();

                    }
                });

                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "您按下了取消按钮", Toast.LENGTH_SHORT).show();

                    }
                });

                builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "您按下了忽略按钮", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.show();
            }
    });
    //editText1 = (EditText)findViewById(R.id.editTextUserId1);
    //editText2 = (EditText)findViewById(R.id.editTextPwd2);

    //String str1 = editText1.getText().toString();
    //String str2 = editText2.getText().toString();
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                // Get the layout inflater
                final LayoutInflater inflater = getLayoutInflater();
                final View DialogView = inflater.inflate(R.layout.login_dialog, null);
                builder.setView(DialogView)
                        .setTitle("Login")
                        // Add action buttons

                        .setPositiveButton(R.string.login, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                // login
                        EditText editText1 = (EditText)DialogView.findViewById(R.id.editTextUserId1);
                                EditText editText2 = (EditText)DialogView.findViewById(R.id.editTextPwd2);
                        String str1 = editText1.getText().toString();

                        String str2 = editText2.getText().toString();

                        if(str1.equals("abc")&&str2.equals("123"))
                        {
                            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                        }
                                //Toast.makeText(MainActivity.this, "您按下了取消按钮", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(MainActivity.this, "您按到取消按钮", Toast.LENGTH_SHORT).show();
                            }
                        });
                builder.show();
            }
        });

    }
}
