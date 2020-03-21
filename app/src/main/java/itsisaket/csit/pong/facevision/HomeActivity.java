package itsisaket.csit.pong.facevision;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import itsisaket.csit.pong.facevision.Adapter.TabFragmentAdapetr;

public class HomeActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {

    //bottom tab
    BottomNavigationView menu_bottom;

    //top tab
    ViewPager viewPager;
    TabLayout tabLayout;

    //side navigation
    DrawerLayout drawer;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        menu_bottom = findViewById(R.id.bottom_navigation);
        menu_bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.action_upload)
                {
                    Toast.makeText(HomeActivity.this, "Test upload. Clicked!", Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.action_explore) {
                    Toast.makeText(HomeActivity.this, "Test explore. Clicked!", Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.action_news) {
                    Toast.makeText(HomeActivity.this, "Test news. Clicked!", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        TabFragmentAdapetr adapter = new TabFragmentAdapetr(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    //Exit Application When click BACK button
    boolean isBackButtonClicked = false;

    @Override
    protected void onResume() {
        isBackButtonClicked = false;
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if(isBackButtonClicked){
                super.onBackPressed();
                return;
            }
            this.isBackButtonClicked = true;
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();

        if (id == R.id.nav_view_upload) {
            // Handle the camera action
        }else if (id == R.id.nav_logout){
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
