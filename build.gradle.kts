plugins {
    id("java")
}

group = "org.carlspring.hello.world.gradle"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(platform("org.junit:junit-bom:${appLibs.versions.junit.get()}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
