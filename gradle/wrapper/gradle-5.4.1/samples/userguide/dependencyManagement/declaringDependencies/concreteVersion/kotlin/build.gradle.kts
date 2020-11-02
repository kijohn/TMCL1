// tag::dependencies[]
plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-web:5.0.2.RELEASE")
}
// end::dependencies[]

// tag::rich-version[]
dependencies {
    implementation("org.slf4j:slf4j-api") {
        version {
            strictly("[1.7, 1.8[")
            prefer("1.7.25")
        }
    }

    constraints {
        add("implementation", "org.springframework:spring-core") {
            version {
                require("4.2.9.RELEASE")
                reject("4.3.16.RELEASE")
            }
        }
    }
}
// end::rich-version[]

tasks.register<Copy>("copyLibs") {
    from(configurations.compileClasspath)
    into("$buildDir/libs")
}
