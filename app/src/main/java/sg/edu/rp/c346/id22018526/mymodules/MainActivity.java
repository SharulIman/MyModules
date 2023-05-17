package sg.edu.rp.c346.id22018526.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    TextView click1;
    TextView click2;
    TextView click3;
    TextView click4;
    TextView click5;
    ArrayList<Module> moduleList = new ArrayList<Module>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Module module1 = new Module("C203","Web AppIn Development in PHP","2023",1,4,"W65C");
        Module module2 = new Module("C206","Software Development Process","2023",1,4,"W65C");
        Module module3 = new Module("C218","UI/UX Design for Apps","2023",1,4,"W65C");
        Module module4 = new Module("C235","IT Security and Management ","2023",1,4,"W65C");
        Module module5 = new Module("C346","Mobile App Development ","2023",1,4,"E63A");
        moduleList.add(module1);
        moduleList.add(module2);
        moduleList.add(module3);
        moduleList.add(module4);
        moduleList.add(module5);

        click1 = findViewById(R.id.module1text);
        click2 = findViewById(R.id.module2text);
        click3 = findViewById(R.id.module3text);
        click4 = findViewById(R.id.module4text);
        click5 = findViewById(R.id.module5text);

        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module",module1);
                startActivity(intent);
            }
        });
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module",module2);
                startActivity(intent);
            }
        });
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module",module3);
                startActivity(intent);
            }
        });
        click4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module",module4);
                startActivity(intent);
            }
        });
        click5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleActivity.class);
                intent.putExtra("module",module5);
                startActivity(intent);
            }
        });
    }
}