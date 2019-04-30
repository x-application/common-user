package x.app.common.user

import x.app.common.Identifiable

/**
 *   @Project: user
 *   @Package: x.app.common.user
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:17
 */
interface UserIdentifiable : Identifiable {

    val userId: String

    override fun getIdentifier(): String {
        return "User(id=$userId)"
    }

}