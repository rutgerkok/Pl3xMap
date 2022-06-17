dependencies {
    compileOnly("io.papermc.paper", "paper-api", "1.19-R0.1-SNAPSHOT")
    compileOnlyApi("org.checkerframework", "checker-qual", "3.15.0")
}

java {
    withJavadocJar()
    withSourcesJar()

    targetCompatibility = JavaVersion.toVersion(17)
    sourceCompatibility = JavaVersion.toVersion(17)
}