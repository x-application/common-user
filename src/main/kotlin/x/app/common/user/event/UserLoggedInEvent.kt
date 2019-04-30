package x.app.common.user.event

/**
 *   @Project: common-user
 *   @Package: x.app.common.user.event
 *   @Author:  Iamee
 *   @Date:    2019-05-01 0:56
 */
class UserLoggedInEvent(
        userId: String = "",
        time: Long = 0L
) : AbstractUserEvent(userId = userId, time = time)