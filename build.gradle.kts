plugins {
    kotlin("jvm") version "1.8.20"
}

allprojects {
    repositories {
        mavenCentral()
        maven(url=uri("https://papermc.io/repo/repository/maven-public/"))
    }
}

subprojects {
    apply(plugin="org.jetbrains.kotlin.jvm")

    dependencies {
        implementation(kotlin("stdlib"))
//        implementation(kotlin("reflect"))
        
        compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
    }
}