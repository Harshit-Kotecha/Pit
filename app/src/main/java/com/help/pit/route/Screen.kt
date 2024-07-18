
sealed class Screen(val route: String) {
    object LoginScreen : Screen("login_screen")
    object HomeScreen : Screen("home_screen")
    object SplashScreen : Screen("splash_screen")
    object DirectoryHomeScreen : Screen("directory_home")
    object UserProfileScreen : Screen("user_profile")
    object PollScreen : Screen("poll_screen")
    object ProfileScreen : Screen("profile_screen")
    object LD : Screen("learning_development")
    object Polls : Screen("polls")
    object Auriga : Screen("Auriga")
    object Me : Screen("Me")

    object LearningDetailScreen : Screen("learning_detail")

}
