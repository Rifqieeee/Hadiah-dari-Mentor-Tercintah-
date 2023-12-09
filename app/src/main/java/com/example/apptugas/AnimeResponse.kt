package com.example.apptugas

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimeResponse(

	@field:SerializedName("data")
	val data: List<DataItem>,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Meta(

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("dimensions")
	val dimensions: Dimensions? = null
):Parcelable

@Parcelize
data class AnimeStaff(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Dimensions(

	@field:SerializedName("small")
	val small: Small? = null,

	@field:SerializedName("large")
	val large: Large? = null,

	@field:SerializedName("tiny")
	val tiny: Tiny? = null,

	@field:SerializedName("medium")
	val medium: Medium? = null
):Parcelable

@Parcelize
data class Productions(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Links(

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("last")
	val last: String? = null,

	@field:SerializedName("first")
	val first: String? = null,

	@field:SerializedName("self")
	val self: String? = null,

	@field:SerializedName("related")
	val related: String? = null
):Parcelable

@Parcelize
data class StreamingLinks(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Episodes(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Large(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
):Parcelable

@Parcelize
data class Staff(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class MediaRelationships(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class RatingFrequencies(

	@field:SerializedName("11")
	val jsonMember11: String? = null,

	@field:SerializedName("12")
	val jsonMember12: String? = null,

	@field:SerializedName("13")
	val jsonMember13: String? = null,

	@field:SerializedName("14")
	val jsonMember14: String? = null,

	@field:SerializedName("15")
	val jsonMember15: String? = null,

	@field:SerializedName("16")
	val jsonMember16: String? = null,

	@field:SerializedName("17")
	val jsonMember17: String? = null,

	@field:SerializedName("18")
	val jsonMember18: String? = null,

	@field:SerializedName("19")
	val jsonMember19: String? = null,

	@field:SerializedName("2")
	val jsonMember2: String? = null,

	@field:SerializedName("3")
	val jsonMember3: String? = null,

	@field:SerializedName("4")
	val jsonMember4: String? = null,

	@field:SerializedName("5")
	val jsonMember5: String? = null,

	@field:SerializedName("6")
	val jsonMember6: String? = null,

	@field:SerializedName("7")
	val jsonMember7: String? = null,

	@field:SerializedName("8")
	val jsonMember8: String? = null,

	@field:SerializedName("9")
	val jsonMember9: String? = null,

	@field:SerializedName("20")
	val jsonMember20: String? = null,

	@field:SerializedName("10")
	val jsonMember10: String? = null
):Parcelable

@Parcelize
data class PosterImage(

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("original")
	val original: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("tiny")
	val tiny: String? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("medium")
	val medium: String? = null
):Parcelable


@Parcelize
data class Reviews(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Relationships(

	@field:SerializedName("animeCharacters")
	val animeCharacters: AnimeCharacters? = null,

	@field:SerializedName("animeProductions")
	val animeProductions: AnimeProductions? = null,

	@field:SerializedName("staff")
	val staff: Staff? = null,

	@field:SerializedName("streamingLinks")
	val streamingLinks: StreamingLinks? = null,

	@field:SerializedName("quotes")
	val quotes: Quotes? = null,

	@field:SerializedName("characters")
	val characters: Characters? = null,

	@field:SerializedName("castings")
	val castings: Castings? = null,

	@field:SerializedName("mappings")
	val mappings: Mappings? = null,

	@field:SerializedName("animeStaff")
	val animeStaff: AnimeStaff? = null,

	@field:SerializedName("reviews")
	val reviews: Reviews? = null,

	@field:SerializedName("installments")
	val installments: Installments? = null,

	@field:SerializedName("genres")
	val genres: Genres? = null,

	@field:SerializedName("mediaRelationships")
	val mediaRelationships: MediaRelationships? = null,

	@field:SerializedName("categories")
	val categories: Categories? = null,

	@field:SerializedName("productions")
	val productions: Productions? = null,

	@field:SerializedName("episodes")
	val episodes: Episodes? = null
):Parcelable

@Parcelize
data class Installments(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Mappings(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Medium(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
):Parcelable

@Parcelize
data class DataItem(

	@field:SerializedName("relationships")
	val relationships: Relationships? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("attributes")
	val attributes: Attributes? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null
):Parcelable

@Parcelize
data class CoverImage(

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("original")
	val original: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("tiny")
	val tiny: String? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null
):Parcelable

@Parcelize
data class Categories(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Castings(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Tiny(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
):Parcelable

@Parcelize
data class Attributes(

	@field:SerializedName("nextRelease")
	val nextRelease: String? = null,

	@field:SerializedName("endDate")
	val endDate: String? = null,

	@field:SerializedName("episodeCount")
	val episodeCount: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("ratingRank")
	val ratingRank: Int? = null,

	@field:SerializedName("posterImage")
	val posterImage: PosterImage? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("subtype")
	val subtype: String? = null,

	@field:SerializedName("youtubeVideoId")
	val youtubeVideoId: String? = null,

	@field:SerializedName("averageRating")
	val averageRating: String? = null,

	@field:SerializedName("coverImage")
	val coverImage: CoverImage? = null,

	@field:SerializedName("ratingFrequencies")
	val ratingFrequencies: RatingFrequencies? = null,

	@field:SerializedName("showType")
	val showType: String? = null,

	@field:SerializedName("abbreviatedTitles")
	val abbreviatedTitles: List<String?>? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("episodeLength")
	val episodeLength: Int? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null,

	@field:SerializedName("nsfw")
	val nsfw: Boolean? = null,

	@field:SerializedName("synopsis")
	val synopsis: String? = null,

	@field:SerializedName("titles")
	val titles: Titles? = null,

	@field:SerializedName("ageRating")
	val ageRating: String? = null,

	@field:SerializedName("totalLength")
	val totalLength: Int? = null,

	@field:SerializedName("favoritesCount")
	val favoritesCount: Int? = null,

	@field:SerializedName("coverImageTopOffset")
	val coverImageTopOffset: Int? = null,

	@field:SerializedName("canonicalTitle")
	val canonicalTitle: String? = null,

	@field:SerializedName("tba")
	val tba: String? = null,

	@field:SerializedName("userCount")
	val userCount: Int? = null,

	@field:SerializedName("popularityRank")
	val popularityRank: Int? = null,

	@field:SerializedName("ageRatingGuide")
	val ageRatingGuide: String? = null,

	@field:SerializedName("startDate")
	val startDate: String? = null,

	@field:SerializedName("status")
	val status: String? = null
):Parcelable

@Parcelize
data class AnimeCharacters(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class AnimeProductions(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Titles(

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("ja_jp")
	val jaJp: String? = null,

	@field:SerializedName("en_jp")
	val enJp: String? = null,

	@field:SerializedName("en_us")
	val enUs: String? = null
):Parcelable

@Parcelize
data class Quotes(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Genres(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Characters(

	@field:SerializedName("links")
	val links: Links? = null
):Parcelable

@Parcelize
data class Small(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
):Parcelable
