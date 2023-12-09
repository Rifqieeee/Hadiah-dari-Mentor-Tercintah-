package com.example.apptugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.apptugas.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val toggle = ActionBarDrawerToggle(
            this, binding.drawerLayout, binding.contentMain.toolbar,0, 0
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        binding.navView.setNavigationItemSelectedListener(this)
        val navHost = supportFragmentManager.findFragmentById(R.id.main_nav) as NavHostFragment
        val navController = navHost.navController
        binding.contentMain.bottomNav.setupWithNavController(navController)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.nav_profile -> {
                Toast.makeText(this, "Feature sedang dalam pengembangan", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_mode -> {
                Toast.makeText(this,"Feature sedang dalam pengembangan", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_community -> {
                Toast.makeText(this, "Feature sedang dalam pengembangan", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_update -> {
                Toast.makeText(this, "Feature sedang dalam pengembangan", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_logout ->{
                Toast.makeText(this, "Feature sedang dalam pengembangan", Toast.LENGTH_SHORT).show()
            }
        }
         binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }



}

