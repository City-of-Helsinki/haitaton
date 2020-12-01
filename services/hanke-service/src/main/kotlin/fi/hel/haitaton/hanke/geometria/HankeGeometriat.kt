package fi.hel.haitaton.hanke.geometria

import org.geojson.FeatureCollection
import java.time.ZonedDateTime

data class HankeGeometriat(
        var id: Int? = null,
        var hankeId: Int? = null,
        var featureCollection: FeatureCollection? = null,
        var version: Int? = null,
        var createdByUserId: Int? = null,
        var createdAt: ZonedDateTime? = null,
        var modifiedByUserId: Int? = null,
        var modifiedAt: ZonedDateTime? = null
) {
    fun withFeatureCollection(featureCollection: FeatureCollection): HankeGeometriat {
        this.featureCollection = featureCollection
        return this
    }
}