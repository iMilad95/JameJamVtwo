package ir.i95milad.jamejam.android.jamejamv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {
    @BindView(R.id.sign_in_btn) Button signIn;
    @BindView(R.id.sign_up_btn) Button signUp;
    @BindView(R.id.textview) TextView txv;

//    LocalDateTime now = LocalDateTime.now();
//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

//        txv.setText(getDateInPersian());


        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogClass cdd=new CustomDialogClass(SplashActivity.this);
                cdd.show();
            }
        });
    }

//    public String getDateInPersian() {
//        String result = "";
//        String date = "";
//
//        try {
//            String[] dateTimeParts = date.split(" ");
//            String time = dateTimeParts[1];
//            String[] dateParts = dateTimeParts[0].split("-");
//
//            PersianDate pc = new PersianDate();
//            pc.initGrgDate(Integer.valueOf(dateParts[0])
//                    , Integer.valueOf(dateParts[1])
//                    , Integer.valueOf(dateParts[2]));
//
//            result = pc.getShYear()
//                    + "-"
//                    +String.format("%02d", pc.getShMonth())
//                    + "-"
//                    +String.format("%02d", pc.getShDay())
//                    + " "
//                    + time;
//
//        }
//        catch (Exception ex)
//        {
//            ex.printStackTrace();
//        }
//
//        return result.replace("-","/");
//    }
}
