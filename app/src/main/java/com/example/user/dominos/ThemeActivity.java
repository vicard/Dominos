package com.example.user.dominos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ThemeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.theme, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clickCouleurs(View v) {
        Intent i = new Intent(this, NiveauActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putString("theme", "couleur");
        i.putExtras(mBundle);
        startActivity(i);
    }

    public void clickFormes(View v) {
        Intent i = new Intent(this, NiveauActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putString("theme", "forme");
        i.putExtras(mBundle);
        startActivity(i);
    }

}
