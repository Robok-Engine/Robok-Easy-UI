# Robok-Amix

A language to create layout

## What's Amix?

Write in .amx (Amix) and convert to Android Views (XML).

## Add to project

[![JitPack Release](https://jitpack.io/v/Robok-Engine/Robok-Amix.svg)](https://jitpack.io/#Robok-Engine/Robok-Amix)

```kotlin
allprojects {
    repositories {
        maven("https://jitpack.io")
    }
}

implementation("com.github.Robok-Engine:Robok-Amix:<version>")
```

## Syntax
```amix
config(
  orientation = "horizontal"
)
Column(
  width = "match_parent",
  height = "match_parent"
) {
  Button(
    id = "shoot_button",
    text = "Shoot",
    width = "wrap_content",
    height = "wrap_content
  )
}
```

## How it works
- **What's config field?**: Config field is used to store config layout  
Available Config's:  
style: a theme for ui (more used on Robok Engine)  
orientation: a orientation for layout, landscape portrait etc.  
(These Config are just returned in the onGenerateCode, they are not added to the xml code.)

## How to compile 

```kotlin
fun main(vararg args: String) {
  val context: Context = /* Obtain your Context, ex:  from an Activity or Application */
  
  val amix = Amix.Builder(context)
    .setUseComments(true) // Enable comments in xml code (not recommended)
    .setCode("<example-code>") // some amix code
    .setOnGenerateCode { generatedCode, config ->
      // here you can do something with your generated Android Views XML Layout code
    }
    .setOnError { errorMessage ->
      // when some error happens
      println("Error: $errorMessage")
    }
    .create()
    amix.compile() // compile the code
}
```
