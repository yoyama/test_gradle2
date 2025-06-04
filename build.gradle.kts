plugins {
    kotlin("jvm")
}
dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(17)
}
tasks.test {
    useJUnitPlatform()
}
