package x.app.common.user.command

import x.app.common.AbstractResult

/**
 *   @Project: common-user
 *   @Package: x.app.common.user.command
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:22
 */
class CreateUserCommand(userId: String = "", val password: String) : AbstractUserCommand<CreateUserCommand.Result>(userId) {

    data class Result(val userId: String) : AbstractResult()

}