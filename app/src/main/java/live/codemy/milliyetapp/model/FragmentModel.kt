package live.codemy.milliyetapp.model

import androidx.fragment.app.Fragment


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     01/03/2020 - 12:07     ║
╚════════════════════════════╝
 */

data class FragmentModel(
    val icon: Int,
    val fragmentTitle: String,
    val fragment: Fragment
)