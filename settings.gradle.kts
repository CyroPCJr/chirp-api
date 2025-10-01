rootProject.name = "Chirp"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

includeBuild("build-logic")

include("app")

include("user")
include("chat")
include("notification")
include("common")
