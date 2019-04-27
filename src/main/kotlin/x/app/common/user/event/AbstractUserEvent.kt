package x.app.common.user.event

import x.app.common.AbstractEvent
import x.app.common.user.UserIdentifier

/**
 *   @Project: common-user
 *   @Package: x.app.common.user.event
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:20
 */
abstract class AbstractUserEvent(
        override val userId: String,
        time: Long
) : AbstractEvent(time), UserIdentifier