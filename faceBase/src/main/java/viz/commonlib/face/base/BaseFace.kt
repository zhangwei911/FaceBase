package viz.commonlib.face.base

import android.content.Context
import android.graphics.Bitmap

/**
 * @title: BaseFace
 * @projectName InsuranceDoubleRecord
 * @description: Base Face
 * @author wei
 * @date 2020-04-03 11:01
 */
abstract class BaseFace {
    abstract fun init(context: Context)
    abstract fun unInit()
    abstract fun detectFaces(bitmap: Bitmap, getMark: Boolean): MutableList<CommonFaceInfo>
    abstract fun detectFaces(data: ByteArray, getMark: Boolean): MutableList<CommonFaceInfo>
    abstract fun compare(feats1: FloatArray, feats2: FloatArray): Float
}