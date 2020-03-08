package live.codemy.milliyetapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import live.codemy.milliyetapp.model.FragmentModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     01/03/2020 - 11:32     ║
╚════════════════════════════╝
 */

class CategoryNewsAdapter(
    fragmentManager: FragmentManager,
    private val newsFragmentList: List<FragmentModel>
) : FragmentStatePagerAdapter(
    fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int = newsFragmentList.size

    override fun getItem(position: Int): Fragment = newsFragmentList[position].fragment

    override fun getPageTitle(position: Int): CharSequence? =
        newsFragmentList[position].fragmentTitle
}