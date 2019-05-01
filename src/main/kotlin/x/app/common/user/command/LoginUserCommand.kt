package x.app.common.user.command

import x.app.common.AbstractResult

/**
 *   @Project: common-user
 *   @Package: x.app.common.user.command
 *   @Author:  Iamee
 *   @Date:    2019-05-01 0:53
 */
class LoginUserCommand(override var userId: String, val accountId: String, var password: String) : AbstractUserCommand<LoginUserCommand.Result>(userId = userId) {

    data class Result(val userId: String) : AbstractResult()

}