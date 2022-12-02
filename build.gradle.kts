plugins {
    id("fabric-loom").version("1.0.12")
}

var minecraftVersion = "1.17.1"
var yarnMappings = "$minecraftVersion+build.1"
var loaderVersion = "0.14.11"
var fabricApiVersion = "0.36.1+1.17"

dependencies {
    minecraft(group = "com.mojang", name = "minecraft", version = minecraftVersion)
    mappings(group = "net.fabricmc", name = "yarn", version = yarnMappings, classifier = "v2")
    modImplementation(group = "net.fabricmc", name = "fabric-loader", version = loaderVersion)
    modImplementation(group = "net.fabricmc.fabric-api", name = "fabric-api", version = fabricApiVersion)
}

description = "RenovateDemonstration"