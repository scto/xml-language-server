/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api("org.eclipse.lsp4j:org.eclipse.lsp4j:0.5.0")
    api("xerces:xercesImpl:2.12.0")
    api("org.apache.logging.log4j:log4j-api:2.11.1")
    api("org.apache.logging.log4j:log4j-core:2.11.1")
    api("org.apache.logging.log4j:log4j-jul:2.11.1")
    api("org.dom4j:dom4j:2.1.1")
    api("com.google.inject:guice:4.2.1")
    api("com.google.inject.extensions:guice-assistedinject:4.2.1")
    api("jaxen:jaxen:1.1.6")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.2.0")
    testImplementation("org.jacoco:jacoco-maven-plugin:0.8.1")
}

group = "io.github.handofgod94"
version = "1.0-SNAPSHOT"
description = "xml-language-server"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
