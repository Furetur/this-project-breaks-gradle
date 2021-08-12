
rootProject.name = "empty_project_to_test_gradle"

val myRepo = "https://github.com/Furetur/simplelib.git"
val myRepoProjectName = "me.user"

sourceControl {
    gitRepository(java.net.URI.create(myRepo)) {
        producesModule("$myRepoProjectName:simplelib")
    }
}
