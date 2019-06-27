package com.example.doccontrol.activities.base.models

object BaseModel {
    data class MedicListModel(val name: String, val rating: Float, val url: String, val type: String)
    data class MedicListResponse(val list: List<MedicListModel>)
}