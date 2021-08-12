
rootProject.name = "empty_project_to_test_gradle"

val utilitiesRepo = "https://github.com/JetBrains-Research/plugin-utilities.git"
val utilitiesProjectName = "org.jetbrains.research.pluginUtilities"

val myRepo = "https://github.com/Furetur/simplelib.git"
val myRepoProjectName = "me.user"

sourceControl {
//    gitRepository(java.net.URI.create(utilitiesRepo)) {
//        producesModule("$utilitiesProjectName:plugin-utilities-core")
//    }
    gitRepository(java.net.URI.create(myRepo)) {
        producesModule("$myRepoProjectName:simplelib")
    }
}
