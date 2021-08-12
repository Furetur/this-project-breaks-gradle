import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

//    val utilitiesProjectName = "org.jetbrains.research.pluginUtilities"
//    implementation("$utilitiesProjectName:plugin-utilities-core") {
//        version {
//            branch = "broken-main-without-submodule"
//        }
//    }

    val myRepoProjectName = "me.user"
    implementation("$myRepoProjectName:simplelib") {
        version {
            // this fails
            branch = "master-with-submodule"
            // however, this works
//            branch = "master"
        }

    }
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
