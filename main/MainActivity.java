package com.example.sieveintip;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bongkar(android.view.View view) {

        Uri targetURI = Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Keys/");

        String[] isinya = {"* FROM Passwords;"};
        Cursor tunjuk = getContentResolver().query(targetURI, isinya, null, null, null);

        final TextView pengumuman = this.findViewById(R.id.kolom);
        pengumuman.setText(DatabaseUtils.dumpCursorToString(tunjuk));
    }
}
