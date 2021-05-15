package ru.maxdexter.jokesaboutchucknorris.ui.fragments.web

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.maxdexter.jokesaboutchucknorris.databinding.WebFragmentBinding

class WebFragment : Fragment() {


    private lateinit var viewModel: WebViewModel
    private lateinit var binding: WebFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = WebFragmentBinding.inflate(layoutInflater, container, false)
        viewModel = ViewModelProvider(this).get(WebViewModel::class.java)

        initWebView()

        return binding.root
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWebView() {
        binding.web.settings.javaScriptEnabled = true
        binding.web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        viewModel.currentUrl.onEach {
            binding.web.loadUrl(it)
        }.launchIn(lifecycleScope)
    }

    override fun onStop() {
        super.onStop()
        binding.web.url?.let { viewModel.setCurrentUrl(it) }
    }






}