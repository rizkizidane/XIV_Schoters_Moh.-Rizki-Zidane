package schoters.id.xiv_schoters_mohrizkizidane.Model
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
data class article {
    @PrimaryKey(autoGenerate = true)
    var id : int? = null,
    @SerializedName("author")
    var author : String?,
    @SerializedName("content")
    var content : String?,
    @SerializedName("description")
    var description : String?,
    @SerializedName("publishedAt")
    var publishedAt : String?,
    @SerializedName("source")
    var source : Source?,
    @SerializedName("title")
    var title : String?,
    @SerializedName("author")
    var author : String?,
    @SerializedName("author")
    var author : String?,
    @SerializedName("author")
    var author : String?,
    @SerializedName("author")
    var author : String?,
}