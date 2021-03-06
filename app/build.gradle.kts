/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.8.3/userguide/building_java_projects.html
 */

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.31"
    id("org.jetbrains.kotlin.plugin.spring") version "1.4.31"
    id("org.springframework.boot") version "2.4.3"
    application
}

repositories {
    // Use JCenter for resolving dependencies.
    jcenter()
    maven (
        url = "https://dl.bintray.com/ruslanys/maven"
    )
}

dependencies {
    implementation("me.ruslanys.telegraff:telegraff-starter:1.0.0")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    // Define the main class for the application.
    mainClass.set("bot_telegram_solo.ApplicationKt")
}



val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
compileKotlin.kotlinOptions.freeCompilerArgs = listOf("-Xjsr305=strict")

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
compileTestKotlin.kotlinOptions.freeCompilerArgs = listOf("-Xjsr305=strict")

