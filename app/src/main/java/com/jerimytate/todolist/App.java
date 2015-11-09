package com.jerimytate.todolist;
import android.app.Application;
import com.parse.Parse;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "r31I5EyIScCfG9hLEEh8ldARjpKVSi378dQ2DqDd", "fvuSPXy5eUdINikOUlahzncH9rrh5pQO4HhFvhLg"); // Your Application ID and Client Key are defined elsewhere
    }
}