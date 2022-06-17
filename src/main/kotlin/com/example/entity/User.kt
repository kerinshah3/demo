package com.example.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class User {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    var name: String? = null

    var email: String? = null
}