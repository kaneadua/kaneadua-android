package com.kaneadua.kaneadua;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Game> games = new ArrayList<>();
        // add random games here
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 2.0));
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 0.0));
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 2.0));
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 5.0));
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 2.0));
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 15.0));
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 1.99));
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 2) );
        games.add(new Game("https://picsum.photos/200","Game 1","first demo","a real life demo Game", 0));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        GamesAdapter games2Adapter = new GamesAdapter(this, games);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(games2Adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.layout){
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.loginpage){
            Intent intent = new Intent(this, LoginActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.registerpage){
            Intent intent = new Intent(this, RegisterActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}