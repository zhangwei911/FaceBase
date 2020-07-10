package viz.commonlib.face.base

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @title: FaceInfo
 * @projectName InsuranceDoubleRecord
 * @description: Face Info
 * @author wei
 * @date 2020-04-03 11:54
 */
@Parcelize
data class CommonFaceInfo(
    var top: Int,
    var bottom: Int,
    var left: Int,
    var right: Int,
    var pitch: Float = -1f,
    var roll: Float = -1f,
    var yaw: Float = -1f,
    var feats: FloatArray = floatArrayOf()
) : Parcelable