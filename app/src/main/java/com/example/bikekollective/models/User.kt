package com.example.bikekollective.models

import com.google.firebase.firestore.PropertyName

data class User(
    var email: String? = "",
    @get:PropertyName("display_name") @set:PropertyName("display_name") var displayName: String? = "",
    @get:PropertyName("is_flagged") @set:PropertyName("is_flagged") var isFlagged: Boolean? = null,

)

