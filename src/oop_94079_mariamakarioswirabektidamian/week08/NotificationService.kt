package oop_94079_mariamakarioswirabektidamian.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email to $emailAddress")
    }

    fun proccessUser(user: UserProfile) {

        if (user.email != null) {

            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}