package sg.edu.rp.c346.id22018526.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView modcode;
    TextView modname;
    TextView modyear;
    TextView modsem;
    TextView modcred;
    TextView modven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        modcode = findViewById(R.id.codetext);
        modname = findViewById(R.id.nametext);
        modyear = findViewById(R.id.yeartext);
        modsem = findViewById(R.id.semestertext);
        modcred = findViewById(R.id.modcredtext);
        modven = findViewById(R.id.venuetext);
         Module module = (Module) getIntent().getSerializableExtra("module");

         modcode.setText("Module Code: " + module.code);
         modname.setText("Module Name: " + module.modname);
         modyear.setText("Academic Year: " + module.year);
         modsem.setText("Semester: " + module.semester);
         modcred.setText("Module Credit: " + module.modcredit);
         modven.setText("Venue: " + module.venue);

    }
}