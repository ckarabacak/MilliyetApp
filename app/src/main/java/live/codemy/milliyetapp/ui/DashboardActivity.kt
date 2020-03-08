package live.codemy.milliyetapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import live.codemy.milliyetapp.R
import live.codemy.milliyetapp.adapter.CategoryNewsAdapter
import live.codemy.milliyetapp.mock.MockData
import live.codemy.milliyetapp.util.extGetDrawable

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        init()
    }

    private fun init() {
        vpNewsCategory.adapter =
            CategoryNewsAdapter(
                supportFragmentManager,
                MockData.getNewsCategoryFragment()
            )

        tabLayNewsCategory.setupWithViewPager(vpNewsCategory)

        toolbar.logo = extGetDrawable(R.drawable.milliyet_logo_white)
    }
}
