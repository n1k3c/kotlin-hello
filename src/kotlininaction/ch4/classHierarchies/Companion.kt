package kotlininaction.ch4.classHierarchies

class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

//class User77 {
//    val nickname: String
//
//    constructor(email: String) {
//        nickname = email.substringBefore('@')
//    }
//
//    constructor(facebookAccountId: Int) {
//        nickname = getFacebookName(facebookAccountId)
//    }
//}

//class User77(val nickname: String) {
//    companion object {
//        fun newSubscribingUser(email: String) =
//                User(email.substringBefore('@'))
//
//        fun newFacebookUser(accountId: Int) =
//                User(getFacebookName(accountId))
//    }
//
//}

fun main(args: Array<String>) {
    println(A.bar())
}