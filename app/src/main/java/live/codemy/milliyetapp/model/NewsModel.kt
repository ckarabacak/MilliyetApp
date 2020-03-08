package live.codemy.milliyetapp.model


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     01/03/2020 - 14:30     ║
╚════════════════════════════╝
 */

data class NewsModel(
    val newsImageUrl: String,
    val newsTitle: String,
    var isSaved: Boolean,
    override val itemViewType: Int
) : BaseNewsModel()