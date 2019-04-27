package x.app.common.user.event

/**
 *   @Project: common-user
 *   @Package: x.app.common.user.event
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:23
 */
class UserCreatedEvent(userId: String = "", time: Long = 0L) : AbstractUserEvent(userId, time)