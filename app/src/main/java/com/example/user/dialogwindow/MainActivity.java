package com.example.user.dialogwindow;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new Dialog(MainActivity.this,R.style.AppCompatAlertDialogStyle);

        // Установите заголовок
        dialog.setTitle("Заголовок диалога");
        // Передайте ссылку на разметку
        dialog.setContentView(R.layout.dialog_view);

        //AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);
        // Найдите элемент TextView внутри вашей разметки
        // и установите ему соответствующий текст
        TextView text = (TextView) dialog.findViewById(R.id.dialogTextView);
        text.setText("Текст в диалоговом окне. Вы любите котов?");
        text.setBackgroundColor(R.color.greenColor);
//   dialog.getWindow().setTitleBackgroundColor();
// setTitleColor(R.color.greenColor);

    }

    public void Click(View view) {
        dialog.show();
    }
}
