package com.example.classwork_310;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   /* EditText edt_name,edt_email,edt_pass;
    Button btn_sub;
    static String TAG = "My info : ";

*/

   ImageView img;
   Button btn_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview_layout);
/*

       edt_name = findViewById(R.id.edt_name);
       edt_email = findViewById(R.id.edt_email);
       edt_pass = findViewById(R.id.edt_numpass);

       btn_sub = findViewById(R.id.btn_submit);

       final Toast tst = Toast.makeText(getApplicationContext(),"Done!",Toast.LENGTH_SHORT);

       btn_sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              */
/* String name = edt_name.getText().toString();
               String email = edt_email.getText().toString();

               Log.v(TAG,name);
               Log.v(TAG,email);
               Log.v(TAG,edt_pass.getText().toString());*//*


               //Toast.makeText(getApplicationContext(),edt_name.getText().toString(),Toast.LENGTH_SHORT).show();

               tst.setText("Hello!");
               tst.setDuration(Toast.LENGTH_LONG);
               tst.show();



           }
       });

*/



        img = findViewById(R.id.imageView);
        btn_change = findViewById(R.id.btn_change);


        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               img.setImageResource(R.drawable.newlogo);

            }
        });


    }
}
