package x.app.common.user.exception

/**
 *   @Project: service-user
 *   @Package: x.app.common.user.exception
 *   @Author:  Iamee
 *   @Date:    2019-05-02 1:39
 */
class UserValidateFailedException : AbstractUserException {

    override val code: Int = 0

    constructor()

    constructor(userId: String) : super(userId)

}