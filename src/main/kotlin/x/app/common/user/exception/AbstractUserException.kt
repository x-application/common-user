package x.app.common.user.exception

import x.app.common.AbstractException
import x.app.common.user.UserIdentifiable

/**
 *   @Project: common-user
 *   @Package: x.app.common.user.exception
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:32
 */
abstract class AbstractUserException : AbstractException, UserIdentifiable {

    final override var userId: String = ""

    constructor()

    constructor(userId: String) : super(userId)

    constructor(userId: String, message: String) : super(message) {
        this.userId = userId
    }

}