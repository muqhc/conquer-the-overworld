rootProject.name = "conquer-the-overworld"

val moduleNameList = listOf(
    "core",
    "plugin"
).map { "${rootProject.name}-$it" }

rootProject.projectDir.list().forEach {
    if (moduleNameList.contains(it)) include(it)
}