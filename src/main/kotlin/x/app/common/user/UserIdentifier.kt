package x.app.common.user

import x.app.common.Identifier

/**
 *   @Project: user
 *   @Package: x.app.common.user
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:17
 */
interface UserIdentifier : Identifier {

    val userId: String

    override fun getIdentifier(): String {
        return "User(id=$userId)"
    }

}