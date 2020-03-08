package live.codemy.milliyetapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.adapter_item_ads_banner.view.*
import live.codemy.milliyetapp.R
import live.codemy.milliyetapp.model.BaseNewsModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     01/03/2020 - 14:15     ║
╚════════════════════════════╝
 */

class AdsBannerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_ads_banner,
        parent,
        false
    )
) {
    fun bind(
        newsModel: BaseNewsModel,
        onItemClickListener: (BaseNewsModel) -> Unit
    ) {
        MobileAds.initialize(itemView.context) {}
        val adRequest = AdRequest.Builder().build()
        itemView.adView.loadAd(adRequest)
    }
}