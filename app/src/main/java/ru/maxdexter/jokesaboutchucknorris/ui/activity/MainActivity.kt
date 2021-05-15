package ru.maxdexter.jokesaboutchucknorris.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import ru.maxdexter.jokesaboutchucknorris.R
import ru.maxdexter.jokesaboutchucknorris.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNav()
    }


    private fun initBottomNav() {
        val navController = supportFragmentManager.findFragmentById(R.id.navHostFragment)?.let {
            NavHostFragment.findNavController(it)
        }
        navController?.let { binding.bottomNavigationView.setupWithNavController(it) }
    }
}