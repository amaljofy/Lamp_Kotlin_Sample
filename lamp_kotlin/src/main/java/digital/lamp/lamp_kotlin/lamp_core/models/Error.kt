/**
* LAMP Platform
* The LAMP Platform API.
*
* The version of the OpenAPI document: 1.0.0
* Contact: team@digitalpsych.org
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package digital.lamp.lamp_kotlin.lamp_core.models



import com.squareup.moshi.Json
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

import java.io.Serializable
/**
 * 
 * @param error 
 */
@Parcelize

data class Error (
    @Json(name = "error")
    var error: kotlin.String? = null
) : Serializable, Parcelable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}

