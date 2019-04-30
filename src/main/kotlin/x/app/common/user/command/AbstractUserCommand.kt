package x.app.common.user.command

import x.app.common.AbstractCommand
import x.app.common.AbstractResult
import x.app.common.user.UserIdentifiable

/**
 *   @Project: common-user
 *   @Package: x.app.common.user.command
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:20
 */
abstract class AbstractUserCommand<T : AbstractResult>(
        override val userId: String
) : AbstractCommand<T>(), UserIdentifiable