package live.codemy.milliyetapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_news.*
import live.codemy.milliyetapp.R
import live.codemy.milliyetapp.adapter.NewsListAdapter
import live.codemy.milliyetapp.mock.MockData
import live.codemy.milliyetapp.util.extToast

class NewsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycNewsList.adapter = NewsListAdapter(MockData.getNewsList(10)) { baseNewsModel ->

        }

        swipeLayout.setOnRefreshListener {
            "REFRESH".extToast(requireContext())
            swipeLayout.isRefreshing = false
        }
    }
}
