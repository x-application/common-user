package x.app.common.user.command

import x.app.common.AbstractCommand
import x.app.common.user.UserIdentifier

/**
 *   @Project: common-user
 *   @Package: x.app.common.user.command
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:20
 */
abstract class AbstractUserCommand(
        override val userId: String
) : AbstractCommand(), UserIdentifier