package splashscreen.ravi.com.customtoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button mCustomToast;
    View customLayoutView;
    LayoutInflater layoutInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomToast = findViewById(R.id.custom_toast);
        layoutInflater = getLayoutInflater();
        customLayoutView = layoutInflater.inflate(R.layout.costom_toast, (ViewGroup) findViewById(R.id.Custom_toast_layout));
        mCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(customLayoutView);
                toast.show();
            }
        });

    }
}
