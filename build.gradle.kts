plugins {
    id("java")
}

group = "ru.netologia"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sourceCompatibility = 11
compileJava.options.encoding = 'UTF-8'
compileTestJava.options.encoding = 'UTF-8'

dependencies {
    testImplementation ("io.rest-assured:rest-assured:5.3.1")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.6.1")
    testImplementation ("io.rest-assured:json-schema-validator:4.3.1")
}

tasks.test {
    useJUnitPlatform()
}