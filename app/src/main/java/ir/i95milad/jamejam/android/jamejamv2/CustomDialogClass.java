package ir.i95milad.jamejam.android.jamejamv2;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import butterknife.BindView;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {
    @BindView(R.id.btn_yes) Button btnYes;
    @BindView(R.id.btn_no) Button btnNo;
    private Activity currentActivity;

    public CustomDialogClass(Activity currentActivity) {
        super(currentActivity);
        // TODO Auto-generated constructor stub
        this.currentActivity = currentActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
                currentActivity.finish();
                break;
            case R.id.btn_no:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}