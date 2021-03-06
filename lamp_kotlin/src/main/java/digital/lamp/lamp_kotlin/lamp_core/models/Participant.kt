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
 * A participant within a study; a participant cannot be enrolled in more than one study at a time.
 * @param id A globally unique reference for objects.
 * @param studyCode The researcher-provided study code for the participant.
 * @param language The participant's selected language code for the LAMP app.
 * @param theme The participant's selected theme for the LAMP app.
 * @param emergencyContact The participant's emergency contact number.
 * @param helpline The participant's selected personal helpline number.
 */
@Parcelize

data class Participant (
    /* A globally unique reference for objects. */
    @Json(name = "id")
    var id: kotlin.String? = null,
    /* The researcher-provided study code for the participant. */
    @Json(name = "study_code")
    var studyCode: kotlin.String? = null,
    /* The participant's selected language code for the LAMP app. */
    @Json(name = "language")
    var language: kotlin.String? = null,
    /* The participant's selected theme for the LAMP app. */
    @Json(name = "theme")
    var theme: kotlin.String? = null,
    /* The participant's emergency contact number. */
    @Json(name = "emergency_contact")
    var emergencyContact: kotlin.String? = null,
    /* The participant's selected personal helpline number. */
    @Json(name = "helpline")
    var helpline: kotlin.String? = null
) : Serializable, Parcelable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}

